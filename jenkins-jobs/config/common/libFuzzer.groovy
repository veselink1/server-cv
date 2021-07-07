return {
    CC="clang-9"
    CXX="clang++-9"
    // As of Cheshire-Cat we have switch to GCC 10, which is installed in
    // parallel with GCC-7 on the standard build image. To use the newer C++
    // standard library from GCC-10 we need to explicitly tell clang where to
    // find it.
    CFLAGS="--gcc-toolchain=/opt/gcc-10.2.0 -Wl,-rpath,/opt/gcc-10.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-10.2.0 -Wl,-rpath,/opt/gcc-10.2.0/lib64"

    // Add llvm-9's bin dir to path, so `llvm-symbolizer' can be found (we
    // cannot use the versioned suffix one - llvm-symbolizer-9' - as the
    // binary must be named 'llvm-symbolizer').
    PATH="${PATH}" + ":/usr/lib/llvm-9/bin/"

    CMAKE_ARGS="-DBUILD_ENTERPRISE=1"

    // Setup libFuzzer - enable it, enable ASAN & UBSan; also need to disable
    // precompiled-headers as using them at the same time as libFuzzer fails:
    //     error: current translation unit is compiled with the target feature '-fsanitize=fuzzer-no-link' but the AST file was not
    CMAKE_ARGS="${CMAKE_ARGS} -DCB_LIBFUZZER=1 -DCB_ADDRESSSANITIZER=1 -DCB_UNDEFINEDSANITIZER=1 -DCB_PCH=0"

    CTEST_ARGS="--tests-regex fuzz"
}
