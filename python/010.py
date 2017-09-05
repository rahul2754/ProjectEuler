'''
Problem Statement:

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
'''

def basic_primality(num):
	if num in (2, 3, 5, 7):
		return num
	for i in range(2, num//2 + 1):
		if num % i == 0:
			return 0
	return num
n = int(input()) # Enter the limit here.
s = 0            # Initializing the variable which holds the 'sum' value.

for i in range(2, n):
	s += basic_primality(i)

print(s)