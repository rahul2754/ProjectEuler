'''
Problem Statement:

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
'''

def collatz_sequence(num):
	counter = 1
	while num != 1:
		if num % 2 == 0:
			num //= 2
		else:
			num = 3 * num + 1
		counter += 1
	return counter

current_number = 2 * 10**6 - 1
longest_length = 0
longest_current_number = current_number

while current_number > 0:
	result = collatz_sequence(current_number)
	if result > longest_length:
		longest_length = result
		longest_current_number = current_number
	current_number -= 1

print(longest_current_number) # The starting number which produces the longest sequence.
print(longest_length)		  # The length of the longest sequence.

'''
NOTE: This code took 35.81 seconds to produce the results on a Core i7-7500U machine running Ubuntu 17.04
'''
