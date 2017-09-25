'''
Problem Statement:

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?

Extended Problem Statement:
What is the Nth prime number?
'''


def is_prime(n):
	for i in range(2, n//2 + 1):
		if n % i == 0:
			return False
	return True

n = int(input())
counter = 0
i = 1

while counter < n:
	i += 1
	if is_prime(i):
		counter += 1
	
print(i)