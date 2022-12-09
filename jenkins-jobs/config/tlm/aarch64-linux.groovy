return {
    // Reset to default CB_DOWNLOAD_DEPS_REPO as aarch64 builds run on nodes
    // outside VPN (EC2) and hence cannot access latestbuilds as set by
    // tlm/common.groovy script.
    CMAKE_ARGS="${CMAKE_ARGS} -U CB_DOWNLOAD_DEPS_REPO"
}
