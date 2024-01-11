def interpolationsearch(L,key,low,high):
    if low > high:
        return -1
    middle = low + (high-low)*(key-L[low])/(L[high]-L[low])

    if key == L[middle]:
        return middle
    elif key < L[middle]:
        return interpolationsearch(L,key,low,middle-1)
    else:
        return interpolationsearch(L,key,middle + 1,high)