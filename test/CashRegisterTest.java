import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/25/13
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class CashRegisterTest {

    private Purchase purchase;
    private Printer printer;
    private CashRegister cashRegister;

    @Before
    public void setUp() {
        purchase = mock(Purchase.class);
        printer = mock(Printer.class);
        cashRegister = new CashRegister(printer);
    }

    @Test
    public void shouldCallPrintFunction() {
        cashRegister.process(purchase);
        verify(printer).print(any(String.class));
    }

}
