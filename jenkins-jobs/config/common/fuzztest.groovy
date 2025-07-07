return {
    // Run Saturday, sometime between 12:00 and 24:00
    CRON_SCHEDULE="H H(12-23) * * 6"
    CC="/opt/clang-18.1.8/bin/clang-18"
    CXX="/opt/clang-18.1.8/bin/clang++-18"
    CFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    CXXFLAGS="--gcc-toolchain=/opt/gcc-13.2.0 -Wl,-rpath,/opt/gcc-13.2.0/lib64"
    CMAKE_ARGS="${CMAKE_ARGS} -DCB_ADDRESSSANITIZER=ON -DFUZZTEST_FUZZING_MODE=ON"
    // Time budget for fuzzing (per test).
    FLAGS_fuzz_for="10m"
    CTEST_ARGS="--tests-regex ^fuzztest\\."
}
