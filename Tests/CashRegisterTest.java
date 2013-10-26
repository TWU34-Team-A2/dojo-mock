import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

import static org.mockito.Mockito.verify;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/25/13
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashRegisterTest {

    @Mock
    Printer printer;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void processShouldPrintPurchase()
    {
      PrinterMock printer = new PrinterMock();

      CashRegister cashRegister = new CashRegister(printer);

      Item[] items = new Item[1];

      items[0] = new Item("item1",10.0);

      cashRegister.process(new Purchase(items));

      assert printer.isCalled();

    }

    @Test
    public void printedResultShouldBeFromPurchase() {
        PrinterMock printer = new PrinterMock();

        CashRegister cashRegister = new CashRegister(printer);

        Item[] items = new Item[1];

        items[0] = new Item("item1",10.0);

        Purchase purchase = new Purchase(items);
        cashRegister.process(purchase);

        assertEquals(purchase.asString(),printer.getPrintedInfo());
    }


    // --------------------------- using Mockito ------------------------
    @Test
    public void processShouldPrintPurchaseMockito()
    {
        CashRegister cashRegister = new CashRegister(printer);

        Item[] items = new Item[1];
        items[0] = new Item("item1",10.0);

        Purchase purchase =  new Purchase(items);
        cashRegister.process(purchase);

        verify(printer).print(purchase.asString());
    }

}
