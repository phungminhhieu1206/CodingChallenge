package com.hieudev.leetcode;

/**
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * --
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *--
 * -2^31 <= x <= 2^31 - 1
 */
public class _9_PalindromeNumber {
    public static void main(String[] args) {
        int[] arr = {121, -121, 10};
        _9_PalindromeNumber obj = new _9_PalindromeNumber();
        for (int a : arr) {
            System.out.println(a + ": " + obj.isPalindrome(a));
        }
    }

    // cách 0: chuyển thành string, đảo ngược string, convert dạng số -> cách này không ổn khi số reverse lớn hơn ngưỡng int, exception khi convert từ string sang int: 9987654321

    // cách 1: convert string, so sánh cặp đầu cuối char
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        int n = xStr.length();
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            if (xStr.charAt(i) != xStr.charAt(n-i-1)) return false;
        }
        return true;
    }

    // cách 2 (5ms): tạo số ngược lại với số x
    public boolean isPalindrome2(int x) {
        int ld = 0;
        int rev = 0;
        int originalNum = x;
        while(x > 0){
            ld = x%10;
            rev = (rev*10)+ld;
            x /= 10;
        }
        return originalNum == rev;
    }

    // cách 3 (4ms):
    // + đặt tên biến ngắn
    // + khai báo gọn hơn
    public boolean isPalindrome3(int x) {
        int rem=0,temp=x,rev=0;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev==temp;
    }
}
