package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {8, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {5, 2, 1, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 2, 3, 5};
        assertThat(result).containsExactly(expected);
    }

}