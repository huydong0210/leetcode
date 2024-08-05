package longest_substring_without_repeating_characters

func LengthOfLongestSubstring(s string) int {
	if len(s) == 1 || len(s) == 0 {
		return len(s)
	}
	left := 0
	right := 1
	length := 0
	hashMap := make(map[byte]int)
	hashMap[s[0]] = 1
	for right < len(s) {
		_, isPresent := hashMap[s[right]]
		if isPresent {
			delete(hashMap, s[left])
			left++
		} else {
			hashMap[s[right]] = 1
			right++
		}
		length = max(length, right-left)
	}
	return length
}
