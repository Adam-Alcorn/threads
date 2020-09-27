import java.util.Random;

class Time {
    public static void delay( int msec ) {
        // Pause thread for specified number of milliseconds
        try {
            Thread.sleep( msec );
        } catch( InterruptedException e ) {
            Thread.currentThread().interrupt();
        }
    }
}

public class homework {
 public static int n = 0;
 public static int k =59;
    public static void main (String[] args) {

        Thread p1 = new P1 () ;
        Thread p2 = new P2 () ;
        Thread display = new Display ();


        p1.start ();
        p2.start ();
        display.start();
    }
}

class P1 extends Thread {

    int temp = 0;

    public void run ()  {
        Random rnd = new Random();
        for(int i= 0; i < homework.k ; i++){
        // Time.delay(rnd.nextInt(20));
            temp = homework.n;
            homework.n = temp + 1;
            System.out.println("run P1 n = " + homework.n);
        }
        System.out.println ("P1 finished");
    }
}

class P2 extends Thread {

    int temp = 0;

    public void run ()  {
        Random rnd = new Random();
        for(int i= 0; i < homework.k ; i++) {

        //  Time.delay(rnd.nextInt(20));
            temp = homework.n;
            homework.n = temp - 1;
            System.out.println("run P2 n = " + homework.n);
        }
        System.out.println ("P2 finished");
    }
}


class Display extends Thread {
    public void run () {
        Time.delay(3000);
        System.out.println ("N = " + homework.n);
        System.out.println ("k = " + homework.k);
    }
}