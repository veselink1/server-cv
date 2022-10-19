// Linux Debug build; as per linux but setting build type to 'Debug'
return {
    CMAKE_ARGS= "-DBUILD_ENTERPRISE=1 -DCMAKE_BUILD_TYPE=Debug"
}
