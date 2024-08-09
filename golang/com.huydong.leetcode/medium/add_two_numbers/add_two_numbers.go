package add_two_numbers

import "fmt"

type ListNode struct {
	Val  int
	Next *ListNode
}

func AddTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var result, pointer *ListNode
	remember := 0
	for l1 != nil || l2 != nil {
		sum := 0
		sum += getValue(l1)
		nextValue(&l1)
		sum += getValue(l2)
		nextValue(&l2)
		sum += remember
		if pointer == nil {
			pointer = &ListNode{Val: sum % 10}
			result = pointer
		} else {
			pointer.Next = &ListNode{Val: sum % 10}
			pointer = pointer.Next
		}
		remember = sum / 10
	}
	if remember > 0 {
		pointer.Next = &ListNode{Val: remember}
	}
	return result

}
func getValue(l *ListNode) int {
	if l == nil {
		return 0
	} else {
		return l.Val
	}
}
func nextValue(l **ListNode) {
	if *l != nil {
		*l = (*l).Next
	}
}
func CreateListNode(vals []int) *ListNode {
	var pointer *ListNode
	var result *ListNode
	for _, value := range vals {
		if pointer == nil {
			pointer = &ListNode{Val: value}
			result = pointer
		} else {
			pointer.Next = &ListNode{Val: value}
			pointer = pointer.Next
		}

	}
	return result
}
func PrintListNode(node *ListNode) {
	for node != nil {
		fmt.Print(node.Val, " ")
		node = node.Next
	}
}
