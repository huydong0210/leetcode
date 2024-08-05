package roman_to_int

func RomanToInt(s string) int {
	result := 0
	for i := 0; i < len(s); i++ {
		if i == len(s)-1 {
			result += getValue(s[i])
			continue
		}
		if getValue(s[i]) < getValue(s[i+1]) {
			result += getValue(s[i+1]) - getValue(s[i])
			i++
		} else {
			result += getValue(s[i])
		}
	}
	return result
}
func getValue(s byte) int {
	switch s {
	case 'I':
		return 1
	case 'V':
		return 5
	case 'X':
		return 10
	case 'L':
		return 50
	case 'C':
		return 100
	case 'D':
		return 500
	case 'M':
		return 1000
	default:
		return 0
	}
}
