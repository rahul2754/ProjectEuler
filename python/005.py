'''
Problem Statement:

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Extended Problem Statement:

What is the smallest positive number that is evenly divisible by all of the number from 1 to 'limit'?
'''

from math import gcd
from functools import reduce

def lcm(n1, n2):
	return n1 * n2 // gcd(n1, n2)

def smallest_multiple(*args):
	return reduce(lcm, args)

result = smallest_multiple(*range(1, int(input()) + 1)) # Input the limit here.

if result:
	print(result)