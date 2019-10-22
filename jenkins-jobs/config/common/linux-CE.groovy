return {
// 2017-05-26: ubuntu16.04 machines are currently 4 cores with
// 8GB RAM - constrain parallelism so we don't swap (too much)...
PARALLELISM=6
TEST_PARALLELISM=3
}
