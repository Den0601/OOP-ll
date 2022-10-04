
class ticketclass implements Runnable {
    static int ticket = 10000;
    int sticket;
    Thread t;

    ticketclass(String name) {
        sticket = 0;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        int A = grabticket();
        while (A != 0) {
            sticket = sticket + A;
            A = grabticket();
        }
        System.out.println(t.getName() + "總共發售" + sticket + "票券");
    }

    private synchronized static int grabticket() {

        int a = (int) (Math.random() * 4) + 1;
        if (ticket >= a) {
            ticket = ticket - a;
            // System.out.println(ticket);
            return a;
        } else {
            return 0;
        }

    }
}

public class w3homework {
    public static void main(String[] args) {
        ticketclass a1 = new ticketclass("機台A");
        ticketclass a2 = new ticketclass("機台B");
        ticketclass a3 = new ticketclass("機台C");
        ticketclass a4 = new ticketclass("機台D");

    }

}
