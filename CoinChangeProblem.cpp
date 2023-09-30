#include<bits/stdc++.h>
using namespace std;

int solve(vector<int> &arr ,int target){
    //Base case
    if(target == 0)
      return 0;

    //so that mini will not get update
    if(target < 0)
      return INT_MAX;

    //Solve 1 case
    int mini = INT_MAX;
    for(int i = 0; i<arr.size(); i++){
          int ans = solve(arr, target - arr[i]);
          // to avoid Int max  + 1 so do not gom out of integer range
          
          if(ans  != INT_MAX)
          mini = min(mini ,ans + 1);
         
        
    } 
     return mini;
    

}

int main(){
    vector<int> arr{1,2,3};
    int target = 5;

    int ans = solve(arr, target);

    cout<<"The Minimum Possible   Ways is " << ans << endl;
    return 0;

}