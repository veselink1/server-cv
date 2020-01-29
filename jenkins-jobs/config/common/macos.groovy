return {
CMAKE_ARGS= "${CMAKE_ARGS} -DBUILD_ENTERPRISE=1"

// macOS builders have 8 CPU threads; set parallelism to nCPUS+2
PARALLELISM=10
}
