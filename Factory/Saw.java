package Factory;

public class Saw implements Tool {

    @Override
    public void create() {
        System.out.println("Saw created");
    }

}
