def solution(s, skip, index):
    answer = ''
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    skipped = [x for x in alphabet if x not in skip]
    
    for i in range (0, len(s)):
        find_index = skipped.index(s[i]) + index
        answer += skipped[find_index % (len(skipped))]
    
    return answer