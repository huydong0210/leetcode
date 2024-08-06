package permutations

func Permute(nums []int) [][]int {
	result := make([][]int, 0)
	recurse(nums, make([]int, 0), &result, len(nums))
	return result
}
func recurse(nums []int, path []int, result *[][]int, length int) {
	if len(path) == length {
		index := make([]int, len(path))
		copy(index, path)
		*result = append((*result), index)
		return
	}
	for i, num := range nums {
		newNums := make([]int, 0)
		newNums = append(newNums, nums[:i]...)
		newNums = append(newNums, nums[i+1:]...)
		newPath := make([]int, 0)
		newPath = append(newPath, path...)
		newPath = append(newPath, num)
		recurse(newNums, newPath, result, length)
	}
}
