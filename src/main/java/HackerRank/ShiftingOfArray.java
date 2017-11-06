package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShiftingOfArray {

    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
        int n = 5;
        int k = 4;
        int a[] = new int[n];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        
        int b[]=new int[n];//new array 
        for(int a_i=0; a_i < n; a_i++){
            //System.out.println(a[a_i]);
        }
        int j=0;
        for(int i=k;i<n;i++)
        {
            
            b[j]=a[i];
            j++;
        }
        for(int l=0;l<k;l++)
        {
            b[j+l]=a[l];
        }
        for(int z:b){
            System.out.print(z+" ");
        }
    }
}
