package coffee;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");
        board.add("John Snow");

        board.draw();

        System.out.println("\nDeliver first:");
        board.deliver();

        System.out.println("\nDeliver by number 3:");
        board.deliver(3);

        System.out.println("\nAfter deliveries:");
        board.draw();
    }
}