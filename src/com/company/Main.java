package com.company;

public class Main {

    public static void main(String[] args) {
        int rows=9;
        for(int i=1;i<=rows;i++)
        {
            for(int j=rows;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
	// write your code here
    }
}
