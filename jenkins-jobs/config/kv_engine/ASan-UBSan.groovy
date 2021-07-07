return {

// Breakpad disabled as it deliberately crashes (which ASan doesn't like :)
// breakdancer disabled as it is very slow under ASan.
// MB-25989: Disabling rocksdb tests while they are not stable.
CTEST_ARGS="--exclude-regex memcached-breakpad-test-segfault|breakdancer|" +
"ep_testsuite_basic.value_eviction.rocksdb|" +
"ep_testsuite_basic.full_eviction.rocksdb|" +
"ep_testsuite.value_eviction.rocksdb|" +
"ep_testsuite.full_eviction.rocksdb|" +
"ep_testsuite_dcp.full_eviction.rocksdb|" +
"ep_testsuite_dcp.value_eviction.rocksdb|" +
"ep_testsuite_xdcr.full_eviction.rocksdb|" +
"ep_testsuite_xdcr.value_eviction.rocksdb|" +
"ep-engine-persistence-unit-tests.rocksdb"
}
