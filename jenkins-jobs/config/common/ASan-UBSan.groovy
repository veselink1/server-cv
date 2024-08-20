return {
    CC="clang-15"
    CXX="clang++-15"
    CFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    PATH="/opt/clang-15.0.7/bin:" + "${PATH}"
    CMAKE_ARGS="-DBUILD_ENTERPRISE=1"
    ENABLE_ADDRESSSANITIZER=1
    ENABLE_UNDEFINEDSANITIZER=1
    UBSAN_OPTIONS="print_stacktrace=1 log_path=sanitizers.log suppressions=${WORKSPACE}/tlm/ubsan.suppressions"
    ASAN_OPTIONS="abort_on_error=true disable_coredump=0 use_madv_dontdump=1 log_path=sanitizers.log"
}
