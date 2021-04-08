return {
    CC="clang-9"
    CXX="clang++-9"
    // As of Cheshire-Cat we have switch to GCC 10, which is installed in
    // parallel with GCC-7 on the standard build image. To use the newer C++
    // standard library from GCC-10 we need to explicitly tell clang where to
    // find it.
    CFLAGS="--gcc-toolchain=/opt/gcc-10.2.0 -Wl,-rpath,/opt/gcc-10.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-10.2.0 -Wl,-rpath,/opt/gcc-10.2.0/lib64"

    ENABLE_THREADSANITIZER=1
}
