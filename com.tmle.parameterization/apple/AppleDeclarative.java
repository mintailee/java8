import java.util.List;

public class AppleDeclarative {
    public static void main(String[] args) {

    }

    /**
     * We pass the way we want to filter not value
     *
     * @param apples {@link List<Apple>}
     * @param p {@link ApplePredicate}
     * @return List filter apples
     */
    static List<Apple> filterApples(List<Apple> apples, ApplePredicate p) {
        return null;
    }
}

interface ApplePredicate {

    /**
     * TRUE: add into result
     * FALSE: reject it
     * @param apple {@link  Apple}
     * @return boolean
     */
    boolean test(Apple apple);
}

/**
 * This class related to Strategies design pattern
 *
 */
class AppleGreenColorPredict implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}