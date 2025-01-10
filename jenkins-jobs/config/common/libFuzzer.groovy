return {
    CC="clang-18"
    CXX="clang++-18"
    CFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    PATH="/opt/clang-18.1.8/bin:/opt/gcc-13.2.0/bin:" + "${PATH}"
    CMAKE_ARGS="-DBUILD_ENTERPRISE=1"

    // Setup libFuzzer - enable it, enable ASAN & UBSan; also need to disable
    // precompiled-headers as using them at the same time as libFuzzer fails:
    //     error: current translation unit is compiled with the target feature '-fsanitize=fuzzer-no-link' but the AST file was not
    CMAKE_ARGS="${CMAKE_ARGS} -DCB_LIBFUZZER=1 -DCB_ADDRESSSANITIZER=1 -DCB_UNDEFINEDSANITIZER=1 -DCB_PCH=0"

    CTEST_ARGS="--tests-regex fuzz"
}
