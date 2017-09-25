'''
Problem Statement:

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
'''

n = int(input()) # Enter the limit here.

for i in range(1, n+1):
	for j in range(i+1, n+1):
		for k in range(j+1, n+1):
			if (i + j + k == n and i**2 + j**2 == k**2):
				print(i * j * k)
				print(i, j, k)
				break
