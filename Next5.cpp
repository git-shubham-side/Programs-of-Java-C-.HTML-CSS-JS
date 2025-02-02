// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

int main() {
    
    //I am solving a program That takes a array numbers form a user and checks if its even then i will print next 5 numbers & if not it will print previous 5 numbers
    
    
    int arr[5];
    int i,k,j,m;
    
    cout<<"Enter 5 numbers:";
    for(i=1;i<=5;i++)
    {
        cin>>arr[i];
    }
    
    for(k=1;k<=5;k++){
        
        if(arr[k]%2==0){
             cout<<arr[k]<<"\t"<<"Number is Even:"<<"\t";
             
             for(j=1;j<=5;j++){
                 cout<<arr[k]+j<<"\t";
             }
             cout<<endl;
             
        }else{
            cout<<arr[k]<<"\t"<<"Number is Odd:"<<"\t";
            for(m=1;m<=5;m++)
            {
                cout<<arr[k]-m<<"\t";
            }
            cout<<endl;
        }
    }
   
    

    return 0;
}