# 9. Palindrome Number

**Difficulty:** Easy    
**Topics:** Math    
**Hint:** A negative number can never be a palindrome.

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

## Examples

**Example 1:**

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

**Example 2:**

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Constraints:**

* $-2^{31} <= x <= 2^{31} - 1$

**Follow-up**: Could you solve it without converting the integer to a string?

For more examples, refer to the [LeetCode page](https://leetcode.com/problems/palindrome-number/).

**Solution**

[Java implementation](./PalindromeNumber.java)

[Test cases](../../../../../../../../test/java/com/jpsantq/leetcode/problems/basic/b_0009_palindrome_number/PalindromeNumberTest.java)