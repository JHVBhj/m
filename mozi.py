def kedvezmeny(hol,kor):
    if hol=="Budapest" and kor>=65:
        return 20 #százalék
    elif hol=="Budapest" and kor>=30:
        return 2 #százalék
    else:
        return 15 #százalék

#assert kedvezmeny("Budapest",68)==20
#assert kedvezmeny("Budapest",40)==2
assert kedvezmeny("Pécs",35)==2
#assert kedvezmeny("Budapest",0)==15
#assert kedvezmeny("Pécs",0)==15
