with open("sorted.txt") as fp:
    for i, row in enumerate(fp):
        if i == 4:
            print(row)
            break