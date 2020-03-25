return {
    CMAKE_ARGS= "${CMAKE_ARGS} -DBUILD_ENTERPRISE=1"

    // For C++17 support we require at least XCode 11. This is installed in
    // a non-default path on the macOS CV machines.
    PATH="/Library/Developer/CommandLineTools_11.3.1/usr/bin:${PATH}"
}
