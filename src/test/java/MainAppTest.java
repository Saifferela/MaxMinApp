import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainAppTest {

    List<Integer> numbers = List.of();

    @Test
    void getMin_IfListIsEmptyMustReturn_IndexOutOfBoundsException() {

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> new NumberFilter(numbers).getMin());

        assertEquals("IndexOutOfBoundsException", exception.getMessage());
    }

    @Test
    void getMax_IfListIsEmptyMustReturn_IndexOutOfBoundsException() {

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> new NumberFilter(numbers).getMax());

        assertEquals("IndexOutOfBoundsException", exception.getMessage());
    }
}