return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DPHOSPHOR_DISABLE=ON"

TESTS_EXCLUDE="memcached-spdlogger-test"
}
