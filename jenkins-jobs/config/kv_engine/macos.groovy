return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DPHOSPHOR_DISABLE=ON"
// 03.01.2020:
// Set warning threshold to 1 as we have 1 -Wtautological-compare warning
// in mad-hatter as we need to cherry-pick the fix from master. So for now
// just suppress the warning.
WARNING_THRESHOLD=1
TESTS_EXCLUDE="memcached-spdlogger-test"
}
