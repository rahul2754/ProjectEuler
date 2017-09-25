t = set([(i * (i + 1) // 2) for i in range(1, 60000)])
p = set([(i * (3 * i - 1) // 2) for i in range(1, 60000)])
h = set([(i * (2 * i - 1)) for i in range(1, 60000)])

# Specific upper limit due to performance issues.

for i in t:
	if i in p and i in h:
		print(i)
