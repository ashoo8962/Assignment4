package Programs.Assignment.Assign_4;

public class Assi_4_q3Palindro {
 
    public static void main(String[] args) {
        


        int n =21;
        int temp =n;
        int sum=0,rev,rem=0;
        while(n!=0)
        {
            rev= n%10; // gives last digit
            sum = sum*10 +rev;
            n=n/10;

        }

if(sum==temp)
System.out.println("Palindrome");
else
System.out.println("Not pali");
    }


}
