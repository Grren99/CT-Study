N = int(input())

for i in range(0,N):
    a,b,c = input().split()
    max = int(a)
    if max > int(b) and max > int(b):
        if pow(max,2) == pow(int(b),2) + pow(int(c),2):
            print("Scenario #%d:"%(i+1))
            print("yes")
            print()
        else:
            print("Scenario #%d:"%(i+1))
            print("no")
            print()           
    elif int(b) > int(c):
        if pow(int(b),2) == pow(max,2) + pow(int(c),2):
            print("Scenario #%d:"%(i+1))
            print("yes")
            print()
        else:
            print("Scenario #%d:"%(i+1))
            print("no")
            print()
    else:
        if pow(int(c),2) == pow(max,2) + pow(int(b),2):
            print("Scenario #%d:"%(i+1))
            print("yes")
            print()
        else:
            print("Scenario #%d:"%(i+1))
            print("no")   
            print()
         
