# Purpose is to return the sum of all values below a maximum that are multiples of 3 and/or 5
max = 1000
total = 0

for i in range(max):
    if (i % 3 == 0 or i % 5 == 0):
        total += i

print(total)