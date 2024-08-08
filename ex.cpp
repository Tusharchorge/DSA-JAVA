#include<iostream>
#include<string>
using namespace std;

string remove_vowels(string s){
    string ans = "";
    for(int i=0; i<s.size(); i++){
        if(s[i]!='a' || s[i]!='e' || s[i]!='i' || s[i]!='o' || s[i]!='u'){
            ans += s[i];
        }
    }
    return ans;
    
}

int main(){
    string s= "Iamantony";

    cout<<remove_vowels(s);
}