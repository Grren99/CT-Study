def insertionsort(L):
    n = len(L)
    for i in range(1,n):
        key = L[i]
        j = i-1
        while j >= 0 and L[j] > key:
            L[j + 1] = L[j]
            j -= 1
        L[j+1] = key
        printStep(L,i)
def printStep(arr,val):
    print("step %2d = "%val,end=' ')
    print(arr)

data = [5,3,8,4,9,1,6,2,7]
print("정렬 전 : ",data)
insertionsort(data)
print("정렬 후 : ",data)