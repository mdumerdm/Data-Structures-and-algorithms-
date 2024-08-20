#include <iostream>
using namespace std;
int main(){

    int dummy [20]={1,2,3,4,5,32,343,54,343,56,87,45,32,23,54,657,767,43,32,21};
    cout<<dummy[12]<<endl;
    //lets find the largest in array 
    int largest=dummy[0];
    for (int i=0;i<=19;i++){
       if (largest<dummy[i]){
        largest=dummy[i];     
    } 
}
cout<<"the largest array values is "<<largest<<endl;

 int smallest=dummy[0];
    for (int i=0;i<=19;i++){
       if (smallest>dummy[i]){
        smallest=dummy[i];     
    } 
}
cout<<"the smallest number in  array values is "<<smallest <<endl;

}
