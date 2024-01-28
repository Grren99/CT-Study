def sequentialsearch(L,key,low,high):
    for i in range(low,high):
        if L[i] == key:
            return i
    return -1