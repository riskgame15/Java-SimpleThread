
public class NumberGenerator implements Runnable {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(hashCode());
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
