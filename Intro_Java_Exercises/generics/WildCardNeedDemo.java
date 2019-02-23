/**
 * WildCardNeedDemo
 */
public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        System.out.println(max(intStack));
        /**
         * because intStack is not an instance of GenericStack<Number>. Thus, you cannot invoke max(intStack).
The fact is Integer is a subtype of Number, but GenericStack<Integer> is not a sub- type of GenericStack<Number>. 
         */
    }

    public static double max(GenericStack<? extends Number> stack) {
        //<? extends Number>isawildcardtypethatrepresentsNumberorasubtypeofNumber, so it is legal to invoke max(new GenericStack<Integer>()) or max(new GenericStack<Double>()).
        double max = stack.pop().doubleValue(); // initial max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;
    }
}