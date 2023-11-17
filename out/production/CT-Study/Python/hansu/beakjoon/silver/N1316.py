from collections import Counter

n = int(input())
answer = 0

for _ in range(n):
    word = input()
    counts = Counter(word)
    check = 1

    for letter, count in counts.items():
        if letter * count not in word:
            check = 0
            break

    answer += check

print(answer)
