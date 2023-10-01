#include<bits/stdc++.h>
using namespace std;

//Leaders in Array i.e  -an elemnt is said to be leader
// if there is nothing greater than this element in right of it.


//Method 1
//TC = o(N^2)
void Leaders(vector<int> &arr){
    int n = arr.size();

    for(int i =0; i<n; i++ ){
        bool flag = false;
           
        for(int j=i+1; j<n; j++){
            if(arr[i]<= arr[j]){
                flag = true;
                break;
            }
        }

        if(flag == false)
        cout<< arr[i] << " ";
     }
}

// Method 2 optimised approach
// KEY POINT - The right most  element is always a leader of thr array.

// TC = theta(n)
// But this print array from right side , to print array from 
// right we need auxillary space a new arrfay and copyinf=g
// the current leader ininnew array and thrn reversing the array

void leaders( vector<int> &arr ){
    int n = arr.size();
    int curr_ldr = arr[n-1];
    cout << curr_ldr<< " ";

    for(int i= n-2; i>=0; i--){
        if(curr_ldr < arr[i]){
            curr_ldr = arr[i];
            cout << curr_ldr << " ";
        }
    }
}


int main(){
    vector<int> arr{7,10,4,3,6,5,2};
    
    //function call
    cout << " The leader array is:- "<< endl;

    leaders(arr);
   
    
}