package Factory;

public class Hammer implements Tool {

    @Override
    public void create() {
        System.out.println("Hammer created");
    }

}
