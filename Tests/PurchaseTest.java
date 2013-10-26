import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/25/13
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseTest {
    @Test
    public void asStringShouldReturnEmptyWhenNoItems()
    {
        Item[] items = new Item[0];
        Purchase purchase = new Purchase(items);
        assertEquals("",purchase.asString());
    }

    @Test
    public void asStringShouldReturnNameAndPriceForItems()
    {
        Item[] items = new Item[1];
        items[0] = new Item("Item1",10.0);
        Purchase purchase = new Purchase(items);
        assertEquals("Item1\t10.0\n", purchase.asString());
    }
}
