package Factory;

public class Screwdriver implements Tool {

    @Override
    public void create() {
        System.out.println("Screwdriver created");
    }

}
