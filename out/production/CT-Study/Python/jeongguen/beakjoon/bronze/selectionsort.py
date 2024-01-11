def selectionsort(L):
    n = len(L)
    for i in range(n-1):
        min = i
        for j in range(i+1,n):
            if L[min] > L[j]:
                min = j
        L[i],L[min] = L[min],L[i]
        printStep(L,i+1)
def printStep(arr,val):
    print("step %2d = "%val,end=' ')
    print(arr)


data = [5,3,8,4,9,1,6,2,7]
print("정렬 전 : ",data)
selectionsort(data)
print("정렬 후 : ",data)