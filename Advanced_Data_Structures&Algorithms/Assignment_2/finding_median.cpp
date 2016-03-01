
//Author 1 : Hitesh Laware hnlaware@bu.edu
#include <iostream>
using namespace std;
//method median that gives you median for 2 sorted arrays
int getMedian(int ar1[], int ar2[], int n){

    int i = 0;  /* Current index of i/p array ar1[] */
    int j = 0; /* Current index of i/p array ar2[] */
    int count;
    int m1 = -1, m2 = -1;
    for (count = 0; count <= n; count++)//n here is equal to n+m/2 thus satisfying the complexity
    {
        if (i == n)
        {
            m1 = m2;
            m2 = ar2[0];
            break;
        }
        else if (j == n)
        {
            m1 = m2;
            m2 = ar1[0];
            break;
        }
        if (ar1[i] < ar2[j])
        {
            m1 = m2;  /* Store the prev median */
            m2 = ar1[i];
            i++;
        }
        else
        {
            m1 = m2;  /* Store the prev median */
            m2 = ar2[j];
            j++;
        }
    }
    return m2;
}
//main function takes input from user about the size of n and m and the contents of the 2 arrays
//note that the 2 arrays need to be entered sorted
int main() {
	int n,m;
	cout<<"Enter the value of n :";
	cin>>n;
	cout<<"Enter the value of m";
	cin>>m;
	int ar1[n];
	int ar2[m];
	cout<<"Enter the contents of ar1[] in a sorted way :";
	for(int i=0;i<n;i++){
		cin>>ar1[i];
	}
	cout<<"Enter the contents of ar2[] in a sorted way : ";
	for(int j=0;j<m;j++){
		cin>>ar2[j];
	}
	int median=getMedian(ar1,ar2,(n+m)/2);
	//prints the final answer
    cout<<"The median of the two arrays is : "<<median;
	return 0;
}
