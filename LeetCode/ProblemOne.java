// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array&difficulty=EASY


public class ProblemOne {

   public static int removeElement(int[] array, int num) {
      int k = 0;
      for (int i = 0; i < array.length; i++) {
         if (array[i] != num) {
            k++;
         }
      }
      return k;
   }
   public static void main(String[] args) {
      int[] array = {3,2,2,3};
      int num = 2;
      System.out.println(removeElement(array, num));
   } 
}
