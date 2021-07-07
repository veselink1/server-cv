return {
    // 2019-03-13: Grandfathered in from couchstore-addresssanitizer-master -
    // fails with:
    //   ASan runtime does not come first in initial library list; you should
    //   either link runtime to your application or manually preload it with
    //   LD_PRELOAD.
    CTEST_ARGS="--exclude-regex couchstore-purge|couchstore-rewind|couchstore-changecount"
}
