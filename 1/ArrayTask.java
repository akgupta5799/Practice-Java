

// Write statements that perform the following one‐dimensional‐array operations:
 // a. Set the 10 elements of integer array counts to zero.
 // b. Add one to each of the 15 elements of integer array bonus.
 // c. Display the five values of integer array bestScores in column format.

 public class ArrayTask { 
 public static void main(String args[]) { 
 
 // part a 
 int array[]={0,0,0,0,0,0,0,0,0,0}; 
 
 // part b 
 int bonus[];
 bonus=new int[15]; 
 for(int i=0;i<15;i++){ 
 bonus[i]+=1;
 }
 
 // part c 
 int bestScores[]={10,20,30,40,50}; 
 for (int j=0;j<5;j++){
 System.out.println(bestScores[j]); 
 }
 }
}