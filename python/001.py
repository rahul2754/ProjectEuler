'''
Problem Statement: 

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000
'''

limit = 1000 - 1 # Decrementing 1 because sum for numbers under 1000.

n1, n2, n3 = limit // 3, limit // 5, limit // 15 # n represents the number of multiples of 3 or 5 or 15 under the limit.

s = (3 * n1 * (n1 + 1) / 2.0) + (5 * n2 * (n2 + 1) / 2.0) - (15 * n3 * (n3 + 1) / 2.0) # Basically, the sum to 'n' formula.

print(int(s))
