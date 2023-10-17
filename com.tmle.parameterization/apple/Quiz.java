import java.util.List;

public class Quiz {
    public static void main(String[] args) {
        List<Apple> apples = AppleImperative.getApples();
        // inject class(behavior) what we want to
        // but we need to create too many class
        // hmmm how can I tackle verbosity
        filterPrint(apples, new PrintColorApple());
    }

    static void filterPrint(List<Apple> apples, PrintPredicate p) {
        for (Apple a : apples) {
            System.out.println(p.print(a));
        }
    }
}

class PrintColorApple implements PrintPredicate {

    @Override
    public String print(Apple apple) {
        return "This is print Apple with color: " + apple.getColor();
    }
}

class PrintWeightApple implements PrintPredicate {
    @Override
    public String print(Apple apple) {
        return "This is print Apple with weight: " + apple.getWeight();
    }
}

class PrintAllApple implements PrintPredicate {
    @Override
    public String print(Apple apple) {
        return apple.toString();
    }
}

interface PrintPredicate {
    String print(Apple apple);
}
