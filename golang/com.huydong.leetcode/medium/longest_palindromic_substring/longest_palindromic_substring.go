package longest_palindromic_substring

func LongestPalindrome(s string) string {
	longest := ""
	if len(s) > 0 {
		longest = s[0:1]
	} else {
		return longest
	}
	for i := 0; i < len(s)-1; i++ {
		longest = max(longest, expand(s, i, i))
		if s[i] == s[i+1] {
			longest = max(longest, expand(s, i, i+1))
		}
	}
	return longest

}
func expand(s string, a, b int) string {
	if a-1 >= 0 && b+1 < len(s) && s[a-1] == s[b+1] {
		return expand(s, a-1, b+1)
	} else {
		return s[a : b+1]
	}
}
func max(a, b string) string {
	if len(a) > len(b) {
		return a
	} else {
		return b
	}
}
