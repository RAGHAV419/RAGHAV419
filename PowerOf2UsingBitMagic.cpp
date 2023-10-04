#include<bits/stdc++.h>
using namespace std;

//Check whether given number is power of 2 or not

//Method 1 (Naive approach- DIVIDE BY 2  we get only even if divided by 2 otherwise we get an odd number we return false)

bool isPOwer2(int n){
    if(n == 0)
    return false;
    while( n!=1){
        if(n % 2!= 0 ) // become odd
        return false;
        n = n/2;
    }
    return true;
}




// Method 2 -  brain kerningam  = unset the rightmost set bit.Number which are powerf 2  contain only one set bit in them

bool isPOWER2(int n){
    if (n==0)
    return false;

    return ((n & (n-1)) == 0);
    // one line expression for the same is below
    // return (n!=0) && ((n & (n-1)) == 0)
}



int main(){
    int n = 16;
    cout << isPOWER2(n)<< endl;

}