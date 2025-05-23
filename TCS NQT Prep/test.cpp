#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout<<"Enter array length: ";
    cin>>n;

    vector<int> arr(n);
    cout<<"Enter "<< n <<" Elements: ";

    for (int i=0; i<n; i++) {
        cin>>arr[i];  //takes array elements
    }

    // cout<< "Array Elements are: ";

    // for(int num : arr) {
    //     cout<< num <<" "; //Prints all elements
    // }

    for(int i=0; i<=n-2; i++){
        int k = min(i + 3, n);
        int maximum = arr[i];
        for(int j = i; j < k; j++){
            if (arr[j] > maximum){
                maximum = arr[j];
            }
        }
        cout << maximum << " ";            
    }
     
    return 0;
}