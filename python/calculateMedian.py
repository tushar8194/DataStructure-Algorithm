import statistics


def cal_median(data_array):
    output = statistics.median(data_array)
    return output


data1 = [2, -1, 3, 6, 9, 4, 5, -1] # 3.5
data2 = [-1, 6, 5, 8, 1.1, 0]
non_negative = []
for num in data2:
    if num >= 0:
        non_negative.append(num)
print(cal_median(non_negative))
