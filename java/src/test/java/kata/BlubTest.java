package kata;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class BlubTest {

    @Test
    void test() {
        assertThat(true).isTrue();
    }

    @Test
    void canMock() {
        var mock = Mockito.mock(List.class);

        when(mock.isEmpty()).thenReturn(true);

        assertThat(mock.isEmpty()).isTrue();
    }
}