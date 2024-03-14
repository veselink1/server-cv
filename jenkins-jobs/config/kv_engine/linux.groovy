return {
// Disable Unity build on this job (the fastest job which compiles EE code) so
// we have coverage of non-unity in CV, to flag any non-unity specific issues
// like missing header #includes.
CMAKE_ARGS="${CMAKE_ARGS} -DCB_UNITY_BUILD=OFF"

CTEST_ARGS="--exclude-regex memcached-spdlogger-test"
}
