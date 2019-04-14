public class Hamburger {
    private String[] toppings;
    private int topCount;
    private int maxToppings;

    public Hamburger(){
        maxToppings = 6;
        topCount = 0;
        toppings = new String[maxToppings];
        for (int i = 0; i<maxToppings; i++){
            toppings[i] = "";
        }
    }

    public int getCondimentCount() {
        return topCount;
    }

    public void addCondiment(String condiment) {
        if (topCount < maxToppings) {
            toppings[topCount] = condiment;
            topCount++;
        }
    }

    public void display() {
        System.out.println("\nBURGER WITH:");
        for (int i = 0; i < topCount; i++) {
            System.out.println("-- " + toppings[i]);
        }
    }
}
