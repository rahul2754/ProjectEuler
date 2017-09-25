def factor_sum(n):
	s = 0

	for i in range(1, n):
		if n % i == 0:
			s += i

	return s

n = 300
amicable_sum = 0

for i in range(1, n):
	val1 = factor_sum(i)
	for j in range(1, n):
		if i != j and val1 == factor_sum(j):
			amicable_sum += i
			print(i)
			break
		else:
			continue

print(amicable_sum)