return {
    // 2019-03-13: Grandfathered in from couchstore-addresssanitizer-master -
    // fails with:
    //   ASan runtime does not come first in initial library list; you should
    //   either link runtime to your application or manually preload it with
    //   LD_PRELOAD.
    CTEST_ARGS="--exclude-regex couchstore-purge|couchstore-rewind|couchstore-changecount"

    // On master branch, there are 4 instances of the following warning from
    // view-engine code:
    //     runtime error: member call on address 0x60d000000380 which does not point to an object of type 'v8::Platform'
    //
    //     0x60d000000380: note: object has invalid vptr
    //      01 00 00 00  e0 9f dd dc 10 7f 00 00  00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00  00 00 00 00
    //                   ^~~~~~~~~~~~~~~~~~~~~~~
    //                   invalid vptr
    //         #0 0x4ebce8 in std::default_delete::operator()(v8::Platform*) const /opt/gcc-10.2.0/lib/gcc/x86_64-pc-linux-gnu/10.2.0/../../../../include/c++/10.2.0/bits/unique_ptr.h:85:2
    //         #1 0x4eadcd in std::unique_ptr >::~unique_ptr() /opt/gcc-10.2.0/lib/gcc/x86_64-pc-linux-gnu/10.2.0/../../../../include/c++/10.2.0/bits/unique_ptr.h:361:4
    //         #2 0x7f10d7eb8160 in __run_exit_handlers /build/glibc-S9d2JN/glibc-2.27/stdlib/exit.c:108
    //         #3 0x7f10d7eb8259 in exit /build/glibc-S9d2JN/glibc-2.27/stdlib/exit.c:139
    //         #4 0x7f10d7e96bfd in __libc_start_main /build/glibc-S9d2JN/glibc-2.27/csu/../csu/libc-start.c:344
    //         #5 0x438779 in _start (/home/couchbase/jenkins/workspace/couchstore.ASan-UBSan_master/build/couchstore/couchstore_mapreduce-builtin-test+0x438779)
    WARNING_THRESHOLD=4
}
