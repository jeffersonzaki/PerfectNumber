//imports panel commands
import javax.swing.JOptionPane;

//finding the perfect number
public class PerfectNumber {

    //for output in the main
    public static String output = " ";


    //finding perfect number
    public static boolean isPerfect(long n){
        //sum the factors. temp is the number
        long sum = 0; long temp = n;

        //half the value
        temp = temp/2;

        //find all divisors and add them
        while (temp > 0) {
            if (n % temp == 0) {
                sum = sum + temp;
            }
            temp = temp - 1;
        }
        if(sum == n){
            return true;
        }
        else {
            return false;
        }
    }



    // * Main Method * //
    public static void main(String[] args) {

        //finds the perfect numbers in this range
        for( long index = 1; index <= 10000; ++ index) {
            boolean flag = isPerfect(index);

            if (flag == true) {
                //output text in the message panel
                output += "\nThe Number " + index + " is a perfect number";
            }
        }

        //shows message panel
        JOptionPane.showMessageDialog(null, output);

    }
}
