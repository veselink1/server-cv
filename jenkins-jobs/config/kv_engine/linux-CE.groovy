return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DPHOSPHOR_DISABLE=ON"

CTEST_ARGS="--exclude-regex memcached-spdlogger-test"
}
