import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {

    private List<Integer> numbers;

    public NumberFilter(List<Integer> numbers){
        if (numbers != null && !numbers.isEmpty()){
            this.numbers = numbers;
            sorter();
        }
        else
            this.numbers = List.of(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int getMin(){
        return numbers.get(0);
    }

    public int getMax(){
        return numbers.get(numbers.size()-1);
    }

    private void sorter(){
        numbers = numbers.stream().sorted().collect(Collectors.toList());
    }
}
