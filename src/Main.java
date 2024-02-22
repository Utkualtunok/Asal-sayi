public class Main {
    public static void main(String[] args) {
        System.out.print("1 ile 100 arasındaki asal sayılar :");
        //Asal sayı bulma formülü
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
