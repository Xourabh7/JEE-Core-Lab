import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        boolean b = isPowerOfTwo(n);
        System.out.println(b);
    }
	static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
            
            
            
}
        

	


