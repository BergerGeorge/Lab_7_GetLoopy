public class Main {
    public static void main(String[] args) {
        int  thirty = 0;
        System.out.println("Loop #1");
        for (thirty = 0; thirty < 31; thirty++)
        {
            System.out.println(thirty);
        }
        int downToZero = 30;


        System.out.println("Loop #2");
        for (downToZero = 30; downToZero > -1; downToZero--)
        {
            System.out.println(downToZero);
        }


        System.out.println("Loop #3");
        int toEighteen = 0;
        for (toEighteen = 0; toEighteen < 19; toEighteen = toEighteen + 3)
        {
            System.out.println(toEighteen);
        }


        System.out.println("Loop #4");
        int toZero = 10;
        for (toZero = 10; toZero > -1; toZero = toZero - 2)
        {
            System.out.println(toZero);
        }


        System.out.println("Nested Loop #1");
        for(int i = 1; i <= 5; i++)
        {
            for(int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Nested Loop #2");
        int rows = 5;
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Nested Loop #3");
        int p = 1;
        int i;
        for (p = 1; p <= 5; p++) //vertical rows
        {
            for (i = 1; i <= 5; i++) //horizontal rows
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}