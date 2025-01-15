return {
    CC="clang-18"
    CXX="clang++-18"
    CFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    PATH="/opt/clang-18.1.8/bin:" + "${PATH}"

    // Disable Unity build on this job (the fastest job which compiles EE code) so
    // we have coverage of non-unity in CV, to flag any non-unity specific issues
    // like missing header #includes.
    CMAKE_ARGS="${CMAKE_ARGS} -DCB_UNITY_BUILD=OFF"
    CTEST_ARGS="--exclude-regex memcached-spdlogger-test"
}
