# Author 1 : Hitesh Laware hnlaware@bu.edu

def Analyzer(str1,size): 
    if int(size)<0 or int(size)>10:# check condition for size to be between 0-10
        print("Wrong Input!!! Please enter the value of size between 0 and 10")
        return 0
    print("The string you entered is: "+str1)
    print("The value of size you entered is: "+size)    
    print("Your result is here: ")
    length=len(str1)
    if length<int(size):
        print(str1)
    index=0
    flag=0
    #algorithm to implement the solution for the problem
    while index<=len(str1)-int(size):    
        compare=str1[index:index+int(size)]
        #print(compare)
        index2=index+int(size)
        while index2<=len(str1)-int(size):
            compare2=str1[index2:index2+int(size)]
            #print("    "+compare2+"*")
            if compare2==compare:
                print(compare)
                flag=1
            index2=index2+1
        index=index+1
        if flag==1:
            break
 #taking user input     
str1=input("Enter your string")
size=input("Enter the size of your comparison")     


Analyzer(str1,size)


    
