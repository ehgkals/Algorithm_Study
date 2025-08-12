def solution(lines):
    answer = 0
    tmp = [0 for _ in range(200)]
    
    for i, j in lines:
        for k in range(i, j):
            tmp[k + 100] += 1
            
    for i in tmp:
        if i > 1:
            answer += 1
    
    return answer