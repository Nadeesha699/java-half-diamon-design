package Class;

public class HalfDaiman {

    public void createHalfDiamand() {
        int x = 1;
        int y = 1;
        int u = 1;

        while (x <= 21) {
            if (x <= 10) {
                while (y <= u) {
                    System.out.print("*");
                    y++;
                }
                System.out.print("\n");
                u++;
            } else {
                while (y <= u) {
                    System.out.print("*");
                    y++;
                }
                System.out.print("\n");
                u--;
            }

            y = 1;
            x++;

        }

    }
}
