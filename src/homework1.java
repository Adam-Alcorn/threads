import java.util.Random;

class Time1 {
    public static void delay( int msec ) {
        // Pause thread for specified number of milliseconds
        try {
            Thread.sleep( msec );
        } catch( InterruptedException e ) {
            Thread.currentThread().interrupt();
        }
    }
}

public class homework1 {
 public static int n = 0;
    public static void main (String[] args) {

        Thread p3 = new P3 () ;
        Thread p4 = new P4 () ;
        Thread display = new Display1();

        System.out.println("P1 N: " + homework1.n);

        //Thread.currentThread().setPriority(p4.MAX_PRIORITY);

        p4.start ();
        p3.start ();
        display.start();


    }
}

class P3 extends Thread {

    int temp = 0;

    public void run ()  {
        //Random rnd = new Random();
        while(homework1.n < 2)//  Time.delay(rnd.nextInt(20));
             System.out.println ("P1 N: " + homework1.n);
    }
}

class P4 extends Thread {

    int temp = 0;

    public void run ()  {
        Random rnd = new Random();
        //  Time.delay(rnd.nextInt(20));
        homework1.n = homework1.n + 1;
        System.out.println("Increment"  + homework1.n);
        //Time.delay(rnd.nextInt(2));
        homework1.n = homework1.n + 1;
        System.out.println("Increment"  + homework1.n);
    }
}


class Display1 extends Thread {
    public void run () {
        Time.delay(1000);
        System.out.println ("N = " + homework1.n);
    }
}