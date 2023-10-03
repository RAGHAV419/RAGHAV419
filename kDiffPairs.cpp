#include<bits/stdc++.h>
using namespace std;

int kdiffPairs(vector<int> arr , int k){
    set<pair<int, int>> ans;
    sort(arr.begin(), arr.end());
    int i=0, j =1;
    while(j< arr.size()){
        int diff = arr[j] - arr[i];
        if(diff == k){
             ans.insert({arr[i], arr[j]});
            i++, j++;
        }
        else if(diff > k){
            i++;
        }
        else{
            j++;
        }
        if (i==j) j++;
    }
    return ans.size();
}

int main (){
     vector<int>arr{1,2,3,4,5};
     int k =1;
      int result = kdiffPairs(arr, k);
      cout <<"The total number of distict pairs are:  "<< result;
    
    

}