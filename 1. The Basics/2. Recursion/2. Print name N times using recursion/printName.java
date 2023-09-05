// Print Name N times using Recursion
 
public class printName {
    public static void printNtimes(int n){ 
        printNames(n); 
    }
    static void printNames(int n)
    {
        if(n==1) 
        {
            System.out.print("Coding Ninjas" + " ");
            return;
        }
        System.out.print("Coding Ninjas" + " ");
        printNames(n-1);
    }
}