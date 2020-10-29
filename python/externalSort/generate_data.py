import random
import csv

_number_counts=1000000

f = open("unsorted.txt", "w")
for _ in range(_number_counts):
    num = random.randint(0, 1000)
    f.write(str(num) + "\n")
f.close()

