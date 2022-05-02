import java.util.ArrayList;
import java.util.Arrays;

class Calculator{

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        String removedColor = colors.remove(0);
        System.out.println("Removed color is " + removedColor);

        colors.remove("White");
        System.out.println(colors);

        colors.clear();
        System.out.println(colors);
    }
}