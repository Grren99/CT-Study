def binarysearch1(L,key,low,high):
    if low > high:
        return -1
    
    middle = (low + high) / 2

    if key == L[middle]:
        return middle
    elif key < L[middle]:
        return binarysearch1(L,key,low,middle-1)
    else:
        return binarysearch1(L,key,middle+1,high)

def binarysearch2(L,key,low,high):
    while(low <= high):
        middle = (low + high)/2

        if key == L[middle]:
            return middle
        elif key > middle:
            low = middle + 1
        else:
            high = middle -1
    return -1