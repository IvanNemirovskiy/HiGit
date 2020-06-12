package Workers.company;

public class  CreateClass
{
    public static void main(String[] args)
    {

        final int NMAX = 10;

        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {

                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 2) / i;

                odds[n][k] = lotteryOdds;
            }
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}


        /*try {
            File myObj = new File("egsdg.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created" + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }catch(IOException e){
                System.out.println("An error occurred");
                e.printStackTrace();


        }*/


