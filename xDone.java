import java.util.Scanner;
public class xDone {

    public static void main(String[] args)
    {
        int input = 3;
        char block = 0x258C;
        char space = 0x00A0;
        String correctSpace = Character.toString(space) + Character.toString(space) + Character.toString(space);
        boolean flag = true;
        Scanner kb = new Scanner(System.in);

        //this is for making sure only numbers are entered
        while(flag)
        {
            System.out.println("Please enter an ODD number that is greater than or equal to 3: ");
            try
            {
                kb = new Scanner(System.in);
                input = kb.nextInt();

                if(input >=3 && input % 2 == 1)
                {
                    flag = false;
                }
                else
                {
                    System.out.println("The number you entered was not greater than 3 and/or odd:");
                }
            }
            catch (Exception e) {
                System.out.println("No, it must be a number");
            }
        }
        String image = "";
        for (int row = 0; row < input; row++)
        {
            for (int column = 0; column < input; column++)
            {
                if (row == column || row + column == input - 1)
                {
                    image += block;
                }
                else
                    {
                    image += space;
                }
            }
            image += "\n";
        }
        System.out.println(image);
    }
}
