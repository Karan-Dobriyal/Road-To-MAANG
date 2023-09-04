// Check if a number is Armstrong Number or not
// Example 1:
// Input:153 
// Output: Yes, it is an Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 153

// Input:170 
// Output: No, it is not an Armstrong Number
// Explanation: 1^3 + 7^3 + 0^3 != 170

// What are Armstrong Numbers?

// Armstrong Numbers are the numbers having the sum of digits raised to power no. of 
// digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.


import java.util.Scanner; 
public class amstrongNumber { 
    public static int countNum(int num){ 
        int count = 0; 
        while(num != 0){ 
            count++; 
            num/=10; 
        } 
        return count; 
    } 

    public static boolean isArmstrong(int num,int power){ 
        int temp = num; 
        int sum = 0;  
        while(num != 0){ 
            int lastDig = num % 10; 
            sum += Math.pow(lastDig,power); 
            num /= 10; 
        } 
        if(sum == temp) return true; 
        else  return false; 
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int inputNum = sc.nextInt(); 
        int power = countNum(inputNum); 
        System.out.println(isArmstrong(inputNum,power)); 
    }

}