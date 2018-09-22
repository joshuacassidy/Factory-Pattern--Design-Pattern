import Factory.Hammer;
import Factory.Saw;
import Factory.Screwdriver;
import Factory.Tool;

public class ToolFactory {

    public Tool createTool(String tool) {

        if(tool == null){
            return null;
        } else {
            if (tool.equalsIgnoreCase("saw")) {
                return new Saw();

            } else if (tool.equalsIgnoreCase("screwdriver")) {
                return new Screwdriver();

            } else if (tool.equalsIgnoreCase("hammer")) {
                return new Hammer();
            } else {
                return null;
            }
        }
    }
}
