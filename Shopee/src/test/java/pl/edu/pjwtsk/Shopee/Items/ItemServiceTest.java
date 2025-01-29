package pl.edu.pjwtsk.Shopee.Items;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @Mock
    private ItemsStorage itemsStorage;
    @InjectMocks
    private ItemsService itemsService;

    @Test
    void shouldGetItem() {
        //given
        int idExpected = 1;
        Item item = new Item(1, "Mleko", 20);
        itemsStorage.items.add(item);
        //when

        //given
        assertThat(item).isEqualTo(idExpected);

    }
}
