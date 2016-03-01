# Author 1: Hitesh Laware hnlaware@bu.edu

# Kindly update the method Test() in order to execute the file
def Test(x,y):
    print("update the  here")


n=input("Enter the size of n :")
Nuts =[]
Bolts=[]
BigSmall=[]
i=0
j=0
#the array BigSmall is incremented if the particular Nut is Larger than the Bolt it is compared with in Test()
# Thus the later on the Nuts[] and Bolts[] arrays are sorted on the basis of BigSmall[]
for i in range(n):
    for j in range(n):
        if Test(Nuts,Bolts)== "Too Big":
            BigSmall[i][j]+=1
        elif Test(Nuts,Bolts)=="Tool Small":
            BigSmall[i][j]+=0
        elif Test(Nuts,Bolts)=="Perfect Match":
            temp=Nuts[j]
            Nuts[j]=Nuts[i]
            Nuts[i]=temp
for i in range(n):
    for j in range (n-i-1):
        if (BigSmall[j]> BigSmall[j+1]):
            tmp=BigSmall[j]
            BigSmall[j]=BigSmall[j+1]
            BigSmall[j+1]=tmp











