package pandlindrome

func IsPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	reverse := 0
	index := x
	for x > 0 {
		reverse *= 10
		reverse += x % 10
		x /= 10
	}
	return reverse == index

}
