'''
Problem Statement:

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
'''

n = int(input()) # Assign 1000 to 'n' for the current problem.

total = 0

for i in range(1, n+1):
	if i % 1000 == 0:
		count = 2
	elif i % 100 == 0:
		count = 2
	elif i % 10 == 0:
		count = 1
	elif i <= 20:
		count = 1
	else:
		count = len(list(filter(lambda a: a != '0', list(str(i)))))

	total += count

print(total)