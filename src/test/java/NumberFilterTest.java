import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumberFilterTest {

    List<Integer> numbers = List.of(64,85,644,43,1,0,-100,-41,543,0, 4321,-5555, 12312);

    @Test
    void getMax_MustReturn_Plus12312() {
        int given = new NumberFilter(numbers).getMax();
        int expect = 12312;

        assertThat(given).isEqualTo(expect);
    }


    @Test
    void getMin_MustReturn_Minus5555() {
        int given = new NumberFilter(numbers).getMin();
        int expect = -5555;

        assertThat(given).isEqualTo(expect);
    }

}