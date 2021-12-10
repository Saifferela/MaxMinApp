import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {

    List<Integer> numbers = List.of();

    @Test
    void getMax_IfListIsEmptyMustReturn_IntegerMaxValues() {
        int given = new NumberFilter(numbers).getMax();
        int expect = 2147483647;

        assertThat(given).isEqualTo(expect);
    }

    @Test
    void getMin_IfListIsEmptyMustReturn_IntegerMinValues() {
        int given = new NumberFilter(numbers).getMin();
        int expect = -2147483648;

        assertThat(given).isEqualTo(expect);
    }
}