import java.util.List;

public class MainApp {
    public static void main(String[] args){
        List<Integer> numbers = List.of(64,85,644,43,1,0,-100,-41,543,0, 4321,-5555, 12312);

        NumberFilter numberFilter = new NumberFilter(numbers);

        int max = numberFilter.getMin();
        int min = numberFilter.getMax();

        System.out.println("Min value in the list: " + min);
        System.out.println("Max value in the list: " + max);
    }
}
