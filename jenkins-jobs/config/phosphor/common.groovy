return {
    // Phosphor only used in KV-Engine, skip building everything else
    CMAKE_ARGS="${CMAKE_ARGS} -DCOUCHBASE_KV_COMMIT_VALIDATION=1"
}