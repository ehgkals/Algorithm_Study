def overlap(a, b):
    return max(0, min(a[1], b[1]) - max(a[0], b[0]))

def solution(lines):
    answer = 0
    a, b, c = lines
    overlap_sum = overlap(a, b) + overlap(b, c) + overlap(a, c)
    triple_overlap = max(0, min(a[1], b[1], c[1]) - max(a[0], b[0], c[0]))
    answer = overlap_sum - 2 * triple_overlap
    
    
    return answer