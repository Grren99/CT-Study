def bubblesort(L):
    n = len(L)
    for i in range(n-1,0,-1):
        change = False
        for j in range(i):
            if L[j] > L[j+1]:
                L[j],L[j+1] = L[j+1],L[j]
                change = True
        if change == False:
            break
        printStep(L,n-i)
def printStep(arr,val):
    print("step %2d = "%val,end=' ')
    print(arr)


data = [5,3,8,4,9,1,6,2,7]
print("정렬 전 : ",data)
bubblesort(data)
print("정렬 후 : ",data)