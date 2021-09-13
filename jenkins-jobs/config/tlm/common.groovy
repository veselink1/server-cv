return {
    // Allow cbdeps which are in testing (cbdeps-promote'd) but not yet
    // published to be picked up.
    CMAKE_ARGS="${CMAKE_ARGS} -D CB_DOWNLOAD_DEPS_REPO=http://latestbuilds.service.couchbase.com/builds/releases/cbdeps"
}
