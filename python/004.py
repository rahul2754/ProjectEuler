'''
Problem Statement:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
'''

def largest_palindrome(n):
	for i in range(10**n - 1, 10**(n-2), -1):
		for j in range(10 ** n, 10**(n-2), -1):
			val = i * j
			if str(val) == str(val)[::-1]:
				return (i, j, val)

result = largest_palindrome(n) # Replace 'n' with the number of digits of the numbers.	

if result:
	print(result)
