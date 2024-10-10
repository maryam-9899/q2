/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q2;

/**
 *
 * مريم العيسي
 * 445005470
 */
public class Q2 {

    class LinearSearch {

           static int search(int arr[], int n, int x) {
       
        for (int i = 0; i < n; i++) {
           
            if (arr[i] == x)
                return i;
        }

        
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;

       
        int x = 1; 

        
        int index = search(arr, n, x);
        
        
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);

            }

}

}
