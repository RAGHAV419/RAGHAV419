#include <bits/stdc++.h>
using namespace std;

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if(root == NULL || root == p || root == q){
            return root;
        }

        TreeNode* left = lowestCommonAncestor(root->left, p, q);
        TreeNode* right = lowestCommonAncestor(root->right, p, q);

        if(left == NULL){
            return right;
        }
        else if(right == NULL){
            return left;
        }
        else{
            return root;
        }
    }
};

// Function to build a binary tree from its level order traversal
TreeNode* buildTree() {
    int val;
    cin >> val;
    if (val == -1) {
        return NULL;
    }
    TreeNode* newNode = new TreeNode(val);
    cout << "Enter left child of " << val << ": ";
    newNode->left = buildTree();
    cout << "Enter right child of " << val << ": ";
    newNode->right = buildTree();
    return newNode;
}

int main() {
    Solution solution;
    
    cout << "Enter the binary tree in level order traversal (-1 for NULL): ";
    TreeNode* root = buildTree();

    int pVal, qVal;
    cout << "Enter value of p: ";
    cin >> pVal;
    cout << "Enter value of q: ";
    cin >> qVal;

    TreeNode* p = new TreeNode(pVal);
    TreeNode* q = new TreeNode(qVal);

    TreeNode* result = solution.lowestCommonAncestor(root, p, q);

    cout << "Lowest common ancestor: " << result->val << endl;

    // Deallocate memory
    delete p;
    delete q;
}
