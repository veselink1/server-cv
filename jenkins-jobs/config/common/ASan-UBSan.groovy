return {
    CC="clang-9"
    CXX="clang++-9"
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
