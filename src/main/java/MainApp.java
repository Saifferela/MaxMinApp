import java.util.List;

public class MainApp {
    public static void main(String[] args){
        List<Integer> numbers = List.of();

        NumberFilter numberFilter = new NumberFilter(numbers);

        int max = numberFilter.getMax();
        int min = numberFilter.getMin();

        System.out.println("Min value in the list: " + min);
        System.out.println("Max value in the list: " + max);
    }
}
