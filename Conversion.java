import java.util.*;
public class App{
   public static void main(String[] args){
      // convert array to arraylist
      String[] arr = {"vs", "sdaa", "addv"};
      ArrayList<String>AL = new ArrayList<>(Arrays.asList(arr));
      //convert arrylist to array
      ArrayList<String>AA = new ArrayList<>(Arrays.asList("sdv", "sdvv", "sdv"));
      // the above statement is like this-- vector<int>AA = {"sdv", "sdvv", "sdv"};
      String[] arr2 = new String[AA.size()];
      AA.toArray(arr2);
      System.out.print(AA.toString());
      //convert arraylist to string
      String str = AA.toString();
   }
}
