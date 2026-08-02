while(True):
    def hashidx(asciiv,table):
        hashi=asciiv%table
        print (hashi)
        return hashi
    key=input("Enter your name:")
    table=int(input("enter no of tables:"))
    asciiv=sum(ord(i) for i in key)
    print(asciiv)

    hashidx(asciiv,table)


    def hash_idx(key,table):
        hashi=key%table
        print (hashi)
        return hashi
    key=int(input("Enter Roll no:"))
    table=int(input("enter no of tables:"))
    hash_idx(key,table)

    a=input("Do you want to continue? (y/n):")
    if a=='n':
        break