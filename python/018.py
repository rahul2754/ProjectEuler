'''
Problem Statement: 

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

	3
   7 4
  2 4 6
 8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:
<insert a huge triangle here>
'''

arr = [
	[3],
	[7, 4],
	[2, 4, 6],
	[8, 5, 9, 3]]

for i in range(len(arr) - 2, -1, -1):
	for j in range(len(arr[i])):
		val =  max(arr[i + 1][j], arr[i + 1][j + 1])
		arr[i][j] += val

print(arr[0][0])