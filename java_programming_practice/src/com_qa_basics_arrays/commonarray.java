package com_qa_basics_arrays;

public class commonarray {
public static void main(String[] args) {
int a[]={1,2,3,4,5,9,10,6,7,};
int b[]={1,2,3,4,5,9};
for(int i=0;i<a.length;i++){
    for(int j=0;j<b.length;j++){
        if(a[i]==b[j]){
            System.out.println(a[i]);
        }
       
        }
    }
}

}


