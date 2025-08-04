def solution(mats, park):
    max = -1
    answer = -1
    for i in range(0, len(park)):
        for j in range(0, len(park[i])):
            
            if(park[i][j] == "-1"):
                park[i][j] = "1"
            else:
                continue
                
            if(i != 0 and j != 0):
                if(park[i - 1][j].isdigit() and park[i - 1][j - 1].isdigit() and park[i][j - 1].isdigit()):
                    park[i][j] = str(min(int(park[i - 1][j]), int(park[i - 1][j - 1]), int(park[i][j - 1])) + 1)

            if(int(park[i][j]) > max):
                max = int(park[i][j])
    
    mats.sort()
    for i in park:
        print(i)
    
    for i in mats:
        if(i <= max):
            answer = i
            
    return answer