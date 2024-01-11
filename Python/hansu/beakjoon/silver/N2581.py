m = int(input())
n = int(input())

primes = [True] * (n + 1)
primes[0] = False
primes[1] = False

for i in range(2, int(n ** 0.5) + 1):
    if primes[i]:
        for j in range(2, n // i + 1):
            primes[i * j] = False

result = [i for i in range(m, n + 1) if primes[i]]
if result:
    print(sum(result))
    print(result[0])
else:
    print(-1)
