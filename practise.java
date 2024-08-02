
import java.io.*;
import java.util.Scanner;
class GFG {
	public static void main(String[] args)
{
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("Entered Number is Even");
		}

		else{
			System.out.println("Entered Number is Odd");
		}
	}
}
//2
import java.io.*;

class GFG {
    static int biggestOfThree(int x, int y, int z)
    {

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
    public static void main(String[] args)
    {
        int a, b, c;
        int largest;
        a = 5;
        b = 10;
        c = 3;
        largest = biggestOfThree(a, b, c);
        System.out.println(largest
                           + " is the largest number.");
    }
}
//3

import java.io.*;

class GFG {
    static int biggestOfThree(int x, int y, int z)
    {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;

        else
            return z;
    }
    public static void main(String[] args)
    {
        int a, b, c, largest;
        a = 5;
        b = 10;
        c = 3;
        largest = biggestOfThree(a, b, c);
        System.out.println(largest
                           + " is the largest number.");
    }
}
//4
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args)
    {
        int a, b, c;
        a = 5;
        b = 10;
        c = 3;
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
        System.out.println(Collections.max(x)
                           + " is the largest number.");
    }
}
//5
public class LargestNumber {

  public static void main(String[] args) {
    int num1 = 10, num2 = 20, num3 = 15;
    int largest = Math.max(Math.max(num1, num2), num3);

    System.out.println("The largest number is: " + largest);
  }
}
//6
import java.io.*;

class GFG {

    public static void main(String[] args)
    {
        int a = 15, b = 25;
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}
//7
class gfg {

    static void prime_N(int N)
    {
        int x, y, flg;
        System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");

        for (x = 1; x <= N; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
    public static void main(String[] args)
    {
        int N = 45;

        prime_N(N);
    }
}




