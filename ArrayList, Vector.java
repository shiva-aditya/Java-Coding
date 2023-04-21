import java.util.*;
public class Array_List{
   public static void main(String[] args){
      ArrayList<Integer>al = new ArrayList<>(); // arraylist declaration
      al.add(1);// push_back function
      al.add(11);
      al.add(1,10000);// insert at certain index. Arguments - (index, element)

      al.get(1); // indexing in java takes index to print the element at that index

      ArrayList<Integer>lly = new ArrayList<>();
      lly.addAll(al);// copy function

      al.remove(1);//erase function take index

      al.remove(Integer.valueOf(11));//removes certain element

      al.size(); //size function

      al.isEmpty(); //return bool of true or false

      al.subList(1, 3); // return sublist from start index to end index - 1

      al.indexOf(1); // gives the index of the element given. It gives -1 when element is not there in the list

      al.set(1, 100); // used to change/overide the element at certain index. Arguments - (index, element)

      Collections.sort(al); // used to sort the arraylist in ascending order
      al.sort(Comparator.naturalOrder()); // used to sort the arraylist in ascending order
      al.sort(Comparator.reverseOrder()); // used to sort the array;ist in descending order
      Arrays.sort("array_name"); // used to sort array in java. It also takes another 2 args which is start and end

      al.lastIndexOf(1); // same as upper bound -1, means last occurence index of certain element

      al.retainAll(lly); // this is used to maintain the elements same in both arraylist, means only elements which are 
      // there in al will retain in lly. ex : if "lly" has 120 and "al" dont have, it will automatically deleted.

      al.containsAll(lly); // it will give true if all element in "lly" is there in al, else return false

      al.trimToSize(); // Explanation - https://www.programiz.com/java-programming/library/arraylist/trimtosize

      al.ensureCapacity(5); // Explantion - https://www.programiz.com/java-programming/library/arraylist/ensurecapacity

      al.removeRange(1, 3); // removes element from start to end -1. This requires main function to inherit ArrayList<Type>
      al.subList(1, 3).clear();// recommend to use to remove from start to end-1


   }
}
