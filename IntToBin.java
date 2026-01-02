/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) {
        if(x==1 || x==0) {
            return Integer.toString(x);
        }
    String res = "";
        if (x%2==1){
            res="1";
        }
        else
        {
            res ="0";
        }
    return toBinary(x/2) + res;
        
    }    
 }
