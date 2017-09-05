'''
Problem Statement:

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?

Extended Problem Statement:
What is the Nth prime number?
'''


def is_prime(num):
	for i in range(2, num):
		for j in range(2, i):
			if i % j == 0:
				return False
	else:
		return True

n = int(input()) # Enter the value for 'N' here.

counter = 0
number = 2

while counter <= n:
	if is_prime(number):
		counter += 1
	number += 1

print(number)