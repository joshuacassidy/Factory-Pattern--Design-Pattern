import Factory.Tool;

public class Main {

    public static void main(String[] args) {
        ToolFactory shapeFactory = new ToolFactory();

        Tool tool1 = shapeFactory.createTool("saw");
        tool1.create();

        Tool tool2 = shapeFactory.createTool("hammer");
        tool2.create();

        Tool tool3 = shapeFactory.createTool("screwdriver");
        tool3.create();

    }


}
