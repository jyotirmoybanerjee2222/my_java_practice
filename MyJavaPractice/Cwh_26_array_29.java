package MyJavaPractice;
import java.util.Scanner;

public class Cwh_26_array_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []marks = new int[5];
		//int [] marks = {98,45,79,99,80};
		float [] marks = {98.1f,45.1f,79.1f,99.f,80.1f};
		
		//System.out.println(marks[1]);
		System.out.println(marks.length);
		System.out.println(marks[0]);
		
		String [] students = {"Harry","Rohan","Shubam","lovish"};
		System.out.println(students.length);
		//System.out.println(students.length);
		
		//for loop
		int I = marks.length;
		for(int i = 0; i<marks.length;i++)
		{
			System.out.println("marks:" +marks[i]);
		}
		System.out.println("Reverse order");
		for(int i = 0; i<marks.length;i++)
		{
			System.out.println("marks:" +marks[I-i-1]);
		}
		//for-each loop
		for(float element: marks)
		{
			System.out.println(element);
		}
		
		//multidimension array
		   int [][] flats;
		   flats = new int [2][3];
		   flats[0][0] = 101;
		   flats[0][1] = 102;
		   flats[0][2] = 103;
		   
		   flats[1][0] = 204;
		   flats[1][1] = 205;
		   flats[1][2] = 206;
		   //displaying 2-D array
		   
		   for(int i = 0; i<flats.length;i++) {
			   for(int j = 0; j<flats[i].length;j++)
				{
					System.out.print(flats[i][j]);
					System.out.print(" ");
				}
			   System.out.println("");
			   		 		
		   }

		   //practice problem 1 & 3
		   float [] mark = {25.5f,56.0f,63.0f};
		   float sum = 0.0f;
		   for (float element:mark) {
			   sum = sum+element;
		   }
		   System.out.println("The valu of sum is :"+sum);
		   System.out.println("The value of savg marks  is :"+sum/mark.length);
		   //practice problem 2
		  // float [] mark = {25.5f,56.0f,63.0f};
		   float num = 0.0f;
		   boolean isInArray = false;
		   for (float element:mark) {
			   if(num == element)
			   {
				   isInArray = true;
				   break;
				   
			   }
		   }
		   if(isInArray) {
               System.out.println("The value is present in the array");
		   }
		   else
		   {
			   System.out.println("The value is  not preset in array");
		   }
		   
		   
		   //problem4
		   int [][] mat1 = { {1,2,3},
				            {4,5,6}};
		   
		   //problem5
		   int [][] mat2 = { {4,5,3},
		                    {4,5,6}};   
		   
		   int [][] res = { {0,0,0},
		                    {0,0,0}};
		   
		   for(int i = 0 ;i<mat1.length;i++)
		   {
			   for(int j = 0 ;j<mat1[i].length;j++)
			   {
				   System.out.format("Setting value for i=%d  and j = %d\n",i,j); 
				   res[i][j]= mat1[i][j] + mat2[i][j];
			   }
			   
		   }
		   for(int i = 0 ;i<mat1.length;i++)
		   {
			   for(int j = 0 ;j<mat1[i].length;j++)
			   {
				   System.out.print(res[i][j]+"  "); 				   				   
			   }
			   System.out.println("");
			   
		   }
		   
		   //problem 5
		   int []arr= {1,2,3,5,6};
		   int n = arr.length/2;
		   //System.out.println(n);
		   for(int i = 0;i<n;i++)
		   {
			  int temp= arr[i];
			  arr[i]=arr[arr.length-i-1];
			  arr[arr.length-i-1]=temp;
		   }
		   n = arr.length;
		   System.out.println("arr in reverse orde");
		   for(int i = 0;i<n;i++)
		   {
              System.out.print(arr[i] + " ");
		   }
		   
		   //problem 6
		   //int max = 0;
		   int max = Integer.MIN_VALUE;
		   int min = Integer.MAX_VALUE;
		   for(int e: arr)
		   {
			   if(e>max)
			   {
				   max = e;
			   }
			   if(e<min)
			   {
				   min = e;
			   }
		   }
		   System.out.println("max element is "+max);
		   System.out.println("min element is "+min);
		   
		   //problem 7
		   System.out.println("min value :"+Integer.MIN_VALUE);
		   System.out.println("max value :"+Integer.MAX_VALUE);
			   
		   
		   //probblem7
		   boolean isSorted = true;
		   for(int i = 0;i<arr.length;i++)
		   {
			   if(arr[i]>=arr[i+1])
			   {
				   isSorted = false;
				   break;
			   }
		   }
		   if(isSorted) {
			   System.out.println("The number is boolean");
		   }
		   else {
			   System.out.println("The number is not sorted");
		   }
		
	}

}
