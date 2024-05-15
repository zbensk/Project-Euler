# This program calculates the sum of all the even fibonacci numbers below a maximum value
total = 0
maxValue = 4000000

secondLast = 0
last = 1
temp = 0

while (temp <= maxValue):
    if (temp % 2 == 0):
        total += temp
    
    temp = secondLast + last
    secondLast = last
    last = temp

print(total)