
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
   public String reverse(String s){
       String ret = "";
       for(int k = 0; k < s.length(); k += 2) {
           ret = s.charAt(k) + ret;
        }
        return ret;
    }
}
