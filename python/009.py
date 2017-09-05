'''
Problem Statement:

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
'''

n = int(input()) # Enter the limit here.

max_sum = 0

for i in range(1, n+1):
	for j in range(i+1, n+1):
		for k in range(j+1, n+1):
			if (i**2 + j**2 == k**2):
				max_sum = max(max_sum, i + j + k)s

print(max_sum)
