import java.util.*;
/**
 * Write a description of class arraylist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arraylist
{
   public static void main(String[] args){
       List<String> list = new ArrayList<String>();
       list.add("ryan");
       list.add("kevin");
       list.add("lily");
       int size = list.size();
       String[] array = (String[])list.toArray(new String[size]);
       for (int i = 0; i < array.length; i++){
           System.out.println(array[i]);
        }
    }
    
}
