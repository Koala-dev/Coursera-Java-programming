
/**
 * Write a description of class recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursion
{

    
        static int num = 0;
        public static void recursion1() {
            num++;
            System.out.println("数字：" + num);
            if(num <= 9){
                recursion1();
            }else{
                System.out.println("end");
        }
    }
    
    public static long factorial(int n){
        if(n == 1 ){
            return 1;
            }else{
                return n*factorial(n-1);
                }
        }
        
        public static void main(String[] args) {
            System.out.println(factorial(5));
            }
    }
