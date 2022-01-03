from mock1_masik import linszoveg

#print(linszoveg(3,6))
def vissza(a,b):
    s=linszoveg(a,b)
    v=""
    for i in range(-1,-len(s)-1,-1):
        v=v+s[i]
    return v
#print(vissza(3,6))
        
