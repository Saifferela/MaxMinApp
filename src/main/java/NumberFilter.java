import java.util.List;

public class NumberFilter {

    private final List<Integer> numbers;


    public NumberFilter(List<Integer> numbers){
        if(numbers.isEmpty())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        this.numbers = numbers;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (int number:numbers) {
           if(min>number)
               min = number;
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;

        for (int number:numbers) {
            if(max<number)
                max = number;
        }
        return max;
    }
}
