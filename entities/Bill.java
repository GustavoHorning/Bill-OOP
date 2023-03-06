package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double feeding() {
        return (beer * 5) + (softDrink * 3) + (barbecue * 7);

    }

    public double cover() {
        double tax;
        if (feeding() > 30.0) {
            tax = 0.0;
        } else {
            tax = 4.0;
        }
        return tax;
    }

    public double ticket() {
        double ticket;
        if (gender == 'M') {
            ticket = 10.0;
        } else {
            ticket = 8.0;
        }
        return ticket;
    }

    public double total() {
        return feeding() + cover() + ticket();
    }


}
