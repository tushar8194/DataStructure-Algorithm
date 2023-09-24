def min_jars(num_lst,C,K,N):
    """
    @param num_lst: given list of numbers
    @param C: maximum number of points allowed per jar
    @param K: maximum diff b/w any two points
    @param N: total number of points
    @return: minimum number of jars required to keep all points in jar
    """
    i = 1
    jars_bucket = []
    jar = []
    num_lst.sort(reverse=True)
    for num in num_lst:
        print("num taken" + str(num))
        if C > len(jar) > 0:
            for elem in jar:
                if(elem - num) > K :
                    print("Diff is more than "+str(K) + " Can not add more points to it")
                    jars_bucket.append(jar)
                    jar = []
                    print("jars_bucket " + str(jars_bucket))
                    break
            print("Adding to Jar - " + str(num))
            jar.append(num)
            print(jar)
        elif len(jar) == C:
            print("Jar is full taking new jar")
            jars_bucket.append(jar)
            jar = [num]
        else:
            jar = [num]
        i = i + 1
    print("Min Jars Needed " + str(len(jars_bucket) + len(jar)))




numbers = [12, 6, 3, 2, 1]
min_jars(numbers,3,5,0)

# Expected output is 3