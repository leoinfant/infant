public class Display
{
public static void main(String args[])
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1; j <= 9; j++)
        {
            int c = i * 10 + j;
            if (c % 2 =0)
                System.out.print(c + " " );
        }
        System.out.println();
    }
}
}
