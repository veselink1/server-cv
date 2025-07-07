return {
    // Run once a day, sometime between 22:00 and 23:00
    CRON_SCHEDULE="H H(22-23) * * *"
    // Enable code coverage for unit tests.
    ENABLE_CODE_COVERAGE=true
    // Add GCC to the PATH so the gcov executable is found.
    PATH="/opt/gcc-13.2.0/bin:/opt/clang-18.1.8/bin:${PATH}"
}
