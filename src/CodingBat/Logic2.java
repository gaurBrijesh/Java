package CodingBat;

/**
 * Created by brijesh on 8/5/17.
 */
public class Logic2 {
    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */

    public int loneSum(int a, int b, int c) {
        if(a == b && b ==c)
            return 0;

        if(a==b)
            return c;

        if(b==c)
            return a;
        if(c==a)
            return b;

        return (a+b+c);
    }

    /*
    public int loneSum(int a, int b, int c)
{
	if(a == b)
	{
    	if(a == c)
    	  return 0;
    	return c;
  	}
  	if(a == c)
    	return b;
  	if(b == c)
    	return a;
  return (a + b + c);
}
     */



    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
 */

    public int luckySum(int a, int b, int c) {
        if(a== 13)
            return 0;
        if(b==13)
            return a;
        if(c==13)
            return a+b;

        return a+b+c;
    }

    /*
    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
     */

    public int noTeenSum(int a, int b, int c) {
        return (fixTeen(a) + fixTeen(b) + fixTeen(c));
    }

    public int fixTeen(int n){
        if(n <13 || n >19 || n==15 || n==16)
            return n;
        return 0;
    }


    /*
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
     */

    public int round10(int num)
    {
        int digit = num % 10;
        if(digit >= 5)
            return num + (10 - digit);
        return num - digit;
    }
    public int roundSum(int a, int b, int c)
    { return (round10(a) + round10(b) + round10(c)); }




/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b-a) <= 1 && Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2
                || Math.abs(c-a) <= 1 && Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2);
    }

    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
     */

    public int blackjack(int a, int b) {
        if(a > 21)
        {
            if(b > 21)
                return 0;
            return b;
        }
        if(a < b && b <= 21)
            return b;
        return a;

    }


    /*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false


     */

    public boolean evenlySpaced(int a, int b, int c)
    {
        int temp;
        if(b > a)
        {
            temp = a;
            a = b;
            b = temp;
        }
        if(c > b)
        {
            temp = b;
            b =c;
            c = temp;
        }
        if(b > a)
        {
            temp = a;
            a = b;
            b = temp;
        }
        return(a - b == b - c);
    }

}