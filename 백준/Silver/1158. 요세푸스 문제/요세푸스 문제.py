from collections import deque

def josephus_problem(n, k):
    dq = deque(range(1, n+1))
    result = []
    while dq:
        dq.rotate(-(k-1))   # k-1만큼 왼쪽으로 회전
        result.append(dq.popleft())
    return result

n, k = map(int, input().split())
print("<" + ", ".join(map(str, josephus_problem(n, k))) + ">")