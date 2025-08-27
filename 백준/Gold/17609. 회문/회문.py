import sys
input = sys.stdin.readline

def is_palindrome(s, left, right, chance):
    while left < right:
        if s[left] == s[right]:
            left += 1
            right -= 1
        else:
            if chance:
                return (is_palindrome(s, left+1, right, False) or
                        is_palindrome(s, left, right-1, False))
            else:
                return False
    return True

T = int(input())
for _ in range(T):
    s = input().strip()
    if is_palindrome(s, 0, len(s)-1, True):
        if is_palindrome(s, 0, len(s)-1, False):
            print(0) 
        else:
            print(1)
    else:
        print(2)     