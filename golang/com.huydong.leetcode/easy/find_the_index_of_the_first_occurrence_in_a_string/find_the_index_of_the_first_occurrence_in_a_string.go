package find_the_index_of_the_first_occurrence_in_a_string

func strStr(haystack string, needle string) int {
	for i := 0; i < len(haystack); i++ {
		for j := i + 1; j < len(haystack); j++ {
			if needle == haystack[i:j] {
				return i
			}
		}
	}
	return -1
}
