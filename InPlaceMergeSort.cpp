#include<bits/stdc++.h>
using namespace std;

//Gap method
//SC- o(1)
void MergeInPlace(int * arr, int s, int e){
    int mid = (s+e)/2;
    int total_len = e -s +1;
    int gap = total_len / 2 + total_len % 2;// ceil operation
    while(gap > 0){
        int i = s;
        int j = s + gap;
        while(j <=e){
            if (arr[i] > arr[j]){
                swap(arr[i], arr[j]);
            }
            ++i, ++j;
        }
        gap = gap <= 1 ? 0 :(gap / 2) + (gap % 2);
    }

}



void mergeSort(int*arr, int s, int e){
    //Base case
    // s==e -> single element
    // s>e -> invalid array
    if(s>=e)
    return;

    int mid = (s+e)/2;

    //left part solve using recursion

    mergeSort(arr, s, mid);
    //right part solve using recursion

    mergeSort(arr, mid+1, e);

    // Now merge two sorted array
    MergeInPlace(arr,s,e);

} 



int main(){
    int arr[] = {112,45,-1,0,3,2,2,56,67,22,1,23,6};
    int n = 13;

    int s =0;
    int e = n-1; 

    mergeSort( arr, s, e);

    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }
    cout << endl;


    return 0;


}
