public class Maluj extends Thread{
    int max;

    public Maluj(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (;;){
            for (int i = 0; i <= max; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\r");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = max; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\r");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
