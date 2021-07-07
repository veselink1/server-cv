return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DBUILD_ENTERPRISE=1"

// MB-25989: Disabling rocksdb tests while they are not stable.
// Exclude breakpad tests as TSan doesn't like us crashing memcached...
CTEST_ARGS="--exclude-regex ep_testsuite_basic.full_eviction.rocksdb|" +
"ep_testsuite_basic.value_eviction.rocksdb|" +
"ep_testsuite.value_eviction.rocksdb|" +
"ep_testsuite.full_eviction.rocksdb|" +
"ep_testsuite_xdcr.full_eviction.rocksdb|" +
"ep_testsuite_xdcr.value_eviction.rocksdb|" +
"ep_testsuite_dcp.value_eviction.rocksdb|" +
"ep_testsuite_dcp.full_eviction.rocksdb|memcached-breakpad-test"
}
