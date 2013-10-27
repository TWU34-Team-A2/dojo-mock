import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseTest {

    private Purchase purchase;
    private Item[] items;

    @Test
    public void shouldDisplayItemInProperFormat() {
        items = new Item[1];
        items[0] = new Item("name1", 1.43);
        purchase = new Purchase(items);
        assertThat(purchase.asString(), is("name1\t1.43\n"));
    }

}
