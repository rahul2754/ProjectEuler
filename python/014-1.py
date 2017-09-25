def collatzSequence(n):
	length = 0

	while n != 1:
		if n % 2 == 0:
			n //= 2
		else:
			n = 3 * n + 1
		length += 1

	return length + 1

max_length = 0
max_number = 0

for i in range(1000000, 0, -1):
	if i % 100000 == 0:
		print("Crossed {}".format(i/100000))
	
	result = collatzSequence(i)

	if result > max_length:
		max_length = result
		max_number = i

print(max_length)
print(max_number)