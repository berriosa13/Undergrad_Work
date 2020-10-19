public class silly1
{
    public static void main (String [] args)
    {
        float price, pricelist[];

        int num, count;

        Scanner kb = new Scanner(System.in);

        System.out.print("How many prices?");
        num = kb.nextInt();

        for (count = 0 ; count <= num ; count++)
        {
            System.out.println ("Enter price for item #" + (count + 1));
            pricelist[count] = kb.nextFloat();
        }

        // now print them out
        for (count = 0 ; count < num ; count++)
        {
            System.out.println ("Price for item #" + (count + 1) + " is " +
                    pricelist [count]);
        }
    }
}
//Save your answer into a .txt file. Upload your answer to D2L.