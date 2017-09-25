'''
Original Problem Statement:

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

Extended Problem Statement:

What is the largest prime factor of the number N?

'''

# Method 1: Using the basic Primality test.

def simple_primality(n):
	for i in range(n//2, 2, -1):
		if n % i == 0:
			print("Testing for {}".format(i))
			for j in range(2, i//2):
				if i % j == 0:
					break
			else:
				return i

number = 600851475143

result = simple_primality(number)

if result:  # Displays the result if it exists.
	print(result)
else:
	print(number)
