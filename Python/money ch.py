pdp = int(input("กรอกราคา : "))
money = int(input("กรอกจำนวนเงิน : "))
money_type = [1000, 500, 100, 50, 20, 10, 5, 2, 1]
summoney = money - pdp 
 
for t in money_type:
    if summoney >= t:
        print("{} บาท = {}".format(t, int(summoney / t)))
        summoney = summoney % t