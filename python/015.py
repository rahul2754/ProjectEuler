'''
Problem Statement:

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?

Extended Problem Statement:

How many such routes are there through a NxN grid?
'''

from math import factorial

n = int(input()) # Assign 20 to n for the current problem.

print(int(factorial(2 * n) / factorial(n) ** 2))