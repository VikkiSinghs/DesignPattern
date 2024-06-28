package Builder;

public class main {
    public static void main(String[] args) {
        // Creating a Person object using the Builder pattern
        Build att = new Build.Attire("cap", "Tshirt")
                .hands("Gloves")
                .foot("Sneakers")
                .dress();

        System.out.println("head " + att.getHead());
        System.out.println("chest " + att.getChest());
        System.out.println("foot " + att.getFoot());
        System.out.println("hands " + att.getHands());

    }
}
