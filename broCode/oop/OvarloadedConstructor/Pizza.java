public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza() {
        
    }

    Pizza( String bread) {
        this.bread = bread;
    }

    Pizza( String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza( String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza( String bread, String sauce, String cheese, String toppings) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }
}