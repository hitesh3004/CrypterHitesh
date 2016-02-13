/*
 Author 1: Hitesh Laware hnlaware@bu.edu
 */

#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <fstream>
using namespace std;
//function that takes every binary number as a separate string
int lookfornextnum(string str,int nextIndex){
	string s=str;
	for(unsigned i=nextIndex;i<s.length();i++){
		if(i==s.length()-1){
			i=i+1;
			return i;
		}
		if(s.at(i)==' '|| s.at(i)==','|| s.at(i)=='.'|| s.at(i)=='_'||s.at(i)=='-'||s.at(i)=='*'){
			return i;
		}
	}
	return 0;
}
//function that converts binary to decimal
int convertbinary(int num){
	   long bin, dec = 0, rem,base = 1;

	    bin = num;
	    while (bin > 0)
	    {
	        rem = bin % 10;
	        dec = dec + rem * base;
	        base = base * 2;
	        bin = bin / 10;
	    }

	    return dec;
}
//function that adds all the decimal numbers
int binary_sum(string fileName){
	std::string myString;
	int sum,binnumvalue,decnumvalue;
	unsigned index,initialIndex;
	initialIndex=0;
	sum=0;

/*	ofstream file_("BinaryRead.txt");
	if(file_.is_open()){
		file_<<"1 11 10,100 \n";
		file_<<"1,11,10,100,1 \n";
		file_.close();
	}*/
	string str1=fileName;
	ifstream file_(str1);
	if(file_.is_open()){
		while(getline(file_,myString)){
			std::cout<<myString<<endl;
		}
		file_.close();
	}
	else
		std::cout<<"file is not open"<<endl;

	while(index!=myString.length()){
		//cout<<"Length of string is: "<<myString.length()<<'\n';
		index=lookfornextnum(myString,initialIndex);
		//cout<<"index is:"<<index<<endl;
		std::string numstr = myString.substr (initialIndex,index-initialIndex);
		//cout<<"num string is"<<numstr<<endl;
		if(numstr.length()>32){
			cout<<"one or many numbers in the text file is larger than 32 bit"<<'\n';
			return 0;
		}
		binnumvalue = atoi(numstr.c_str());
		//cout<<"The num value is:"<<binnumvalue<<endl;
		decnumvalue=convertbinary(binnumvalue);
		initialIndex=index+1;
		sum=sum+decnumvalue;
	}
	cout<<"The sum is "<<sum<<endl;

	return 0;
}

int main() {
	//taking user input
	string file;
	cout<<"Please enter your file name from which you wish to read binary numbers "<<endl;
	cin>>file;
	binary_sum(file);
	return 0;

}
