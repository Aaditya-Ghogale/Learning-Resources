// #include<bits/stdc++.h>
// using namespace std;

// int Natural_Num_Sum(int a){

//     if(a==0){
//         return 0;
//     }
    
//     int sum =0;


//         for(int i=1;i<=10;i++){
//             sum+= i*a;
//         }
//         return sum;
// }

// int main(){
//     int n;
//     cout<<"Enter The Number : ";
//     cin>>n;

//     int n1 = Natural_Num_Sum(n);
//     cout <<"The Sum Of First "<< n<<"Natural Numbers is : "<<n1<<endl;
//     return 0;
// }

//    this code is of Time Complexity: O(1) but it is not efficient...


// // 2nd Approach
#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cout<<"number de....";
    cin>>n;

    int sum = n*55;

    cout<<"The Sum Of First "<<n<<" Natural Numbers is : "<<sum<<endl;
    return 0;

}

// Time Complexity: O(1) so it is efficient....



//Key Takeaways:
//try to simplify the logic mathematically to reduce the time complexity of the code.
//always use #include <bits/stdc++.h> in your code to avoid writing multiple header files.
//as #include <bits/stdc++.h> basiccally includes all the header files.
//always use namespace std; in your code to avoid writing std:: in front of every cin, cout, etc.