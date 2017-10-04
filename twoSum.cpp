#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j] == target){
                    vector<int> myvector ;
                    int myarray [] = { i,j };
                    myvector.insert (myvector.begin(), myarray, myarray+2);
                    return myvector;
                }
            }
        }
    }
};

int main()
{
    vector<int> nums; int a[] = {2, 7, 11, 15}; nums.insert(nums.begin(), a, a+4);
    int n = 26;
    Solution s;
    vector<int> arr = s.twoSum(nums, n);
    cout<<arr[0]<<'\t'<<arr[1];
    
    return 0;
}
