
a = set(line.strip() for line in open('randomA.txt'))
b = set(line.strip() for line in open('randomB.txt'))

def jaccard_sim(a, b):
    c = a.intersection(b)
    return float(len(c)) / (len(a) + len(b) - len(c))

res = jaccard_sim(a,b)

print(res)

# https://www.statology.org/jaccard-similarity-python/