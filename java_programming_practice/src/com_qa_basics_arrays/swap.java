package com_qa_basics_arrays;

public class swap {

    public static void main(String[] args) {
        int[] a={8,6,7,1,5};
              a=vinodh(a);
        for(int i:a)
              System.out.println(i);
}
    public static int[] vinodh(int[] a){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int temp=0;
                if(a[i]<a[j]){
                    temp=a[j];                  
                    a[j]=a[i];                  
                    a[i]=temp;      
                  }         
                }
        }
        return a;

    }
}
