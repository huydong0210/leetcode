package easy

func TwoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i, n := range nums {
		m[target-n] = i
	}
	result := make([]int, 2)
	for i, n := range nums {
		index, isPresent := m[n]
		if isPresent && index != i {
			result[0] = i
			result[1] = index
		}
	}
	return result
}
