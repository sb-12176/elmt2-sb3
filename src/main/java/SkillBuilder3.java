/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    private static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        for (int count = 0; count < numOfTimesToRepeat; count++){
            result += s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";

        for (int count = 0; count < height; count++){
            str += repeat("*", count+1) + "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";

        int spaces = height - 1;

        for (int count = 0; count < height; count++){
            str += repeat(" ", spaces);
            str += repeat("*", count+1) + "\n";
            spaces--;
        }

        return str;
    }

    public static String circle(int radius)
    {
        String str = "";

        for(int y = radius-1; y > -radius; y--){
            int x = (int)Math.sqrt( Math.pow(radius, 2) - Math.pow(y, 2) );
            int spaces = (radius - x);
            str += repeat(" ", spaces) + (repeat("*", x*2) + "\n");
        }


        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += (i);
            }
        }

        return sum;
    }

    public static boolean isPerfect(long number){

        if (sumOfDivisors(number) == number){
            return true;
        }

        return false;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        int i = 1;

        while (i < number){
            if (number % i == 0){
                sum += (i);
                i++;
            }
        }

        return sum;
    }

    /*public static void main(String[] args) {
        System.out.println(circle(8));
    }

     */

}

