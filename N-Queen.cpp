#include<bits/stdc++.h>
using namespace std;

void printSol(vector<vector<char>>&board, int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            cout<<board[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<endl<<endl;
}

bool isSafe(int row, int col, vector<vector<char>>&board, int n){
    int i=row, j=col;
    while(j>=0){
        if(board[i][j] == 'Q'){
            return false;
        }
        j--;
    }

    i=row, j=col;
    while(i>=0 && j>=0){
        if(board[i][j] == 'Q'){
            return false;
        }
        i--;
        j--;
    }

    i=row, j=col;
    while(i<n && j>=0){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}

void solve(vector<vector<char>>&board, int col, int n){
    if(col>=n){
        printSol(board, n);
        return;
    }

    for(int row=0; row<n; row++){
        if(isSafe(row, col, board, n)){
            board[row][col]='Q';

            solve(board, col, n);

            board[row][col]='.';
        }
    }
}

int main(){

    int n;
    cout<<"Enter the no.- ";
    cin>>n;
    vector<vector<char>>board(n, vector<char>(n, '.'));
    int col=0;
    solve(board, col, n);
}