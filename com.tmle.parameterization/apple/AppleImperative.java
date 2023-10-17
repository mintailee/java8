import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleImperative {
    // We want to make an application for farmer to collect his apples
    // This class is following the knowledge that I learn from school


    public static void main(String[] args) {
        List<Apple> apples = getApples();

        // get green
        List<Apple> greens = filterGreenApples(apples);

        // hmmm, farmer want to get red, blue and ect color as well.
        List<Apple> colors = filterAppleParameterizedColor(apples, "blue");

        // easy right? =))) software always change. Farmer cares about weight apple
        // so how many traversing that we need when farmer want to something?
        // we can combine all the filter in one loop, but too terrible isn't it
        // -> Let's find a better level of abstraction.

    }


    /**
     * Filter apples by color
     * @param apples
     * @param color
     * @return list of apple based on color param
     */
    public static List<Apple> filterAppleParameterizedColor(List<Apple> apples, String color) {
        List<Apple> rs = new ArrayList<>();
        for (Apple apple : apples) {
            if(color.equals(apple.getColor())) {
                rs.add(apple);
            }
        }
        return rs;
    }

    /**
     * Farmer want filter all the apple which has green color
     *
     * @param apples {@link Apple}
     * @return a list apples after filter
     */
    public static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> rs = new ArrayList<>();
        for (Apple apple : apples) {
            if("green".equals(apple.getColor())) {
                rs.add(apple);
            }
        }
        return rs;
    }


    /**
     * Create a List Apple collect on the farm
     *
     * @return a List Apple;
     */
    public static List<Apple> getApples() {
        return new ArrayList<Apple>(Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 250),
                new Apple("blue", 300),
                new Apple("red", 230),
                new Apple("green", 500),
                new Apple("red", 400),
                new Apple("green", 280),
                new Apple("blue", 360)
        )
        );
    }
}