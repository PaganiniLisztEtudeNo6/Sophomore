def save_hash(key,arr):
    index = search_hash(key)
    if len(arr[index].__str__()) > 0 and arr[index] != [] :
        print("Override Value",arr[index],"->",key)
        arr[index] = key
    print(key,"Saved")
def search_hash(key):
    return int(str(key)[1]+str(key)[3]+str(key)[5])
arr = [[]]*1000
save_hash(11111111,arr)
save_hash(21219100,arr)
save_hash(12345678,arr)
print("-----------------------")
print("Index 17 = ",search_hash(21219100))
print("Index 56 = ",search_hash(12345678))