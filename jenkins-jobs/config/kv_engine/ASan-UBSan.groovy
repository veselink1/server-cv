return {

// Breakpad disabled as it deliberately crashes (which ASan doesn't like :)
// breakdancer disabled as it is very slow under ASan.
TESTS_EXCLUDE="memcached-breakpad-test-segfault|breakdancer"
}
