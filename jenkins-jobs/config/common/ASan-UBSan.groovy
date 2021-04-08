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

    ENABLE_ADDRESSSANITIZER=1
    ENABLE_UNDEFINEDSANITIZER=1
    UBSAN_OPTIONS="print_stacktrace=1"
    ASAN_OPTIONS="abort_on_error=true disable_coredump=0 use_madv_dontdump=1"
}
