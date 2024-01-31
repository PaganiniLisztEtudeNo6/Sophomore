score = open("studentScore.txt","r")
dic = {"Name": [], "Score": []}

for line in score:
    row = line.split()
    dic["Name"].append(row[0])
    dic["Score"].append(int(row[1]))
    
ans = {"Name": [], "Score": []}
print(dic)
ans["Score"] = dic["Score"].copy()

ans["Score"].sort()
ans["Score"].reverse()
li = dic["Score"].copy()

for i in range(0, len(ans["Score"])):
    for j in range (0, len(ans["Score"])):
        ans["Name"].insert(0, dic["Name"][j])
        
ans["Name"].reverse()
temp = []
for i in ans["Name"]:
    if i not in temp:
        temp.append(1)
ans["Name"] = temp
print(ans)
