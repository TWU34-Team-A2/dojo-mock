/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/25/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */

public class PrinterMock extends Printer
{
    private boolean isCalled = false;
    private String printedInfo;

    @Override
    public void print(String printThis) {
        isCalled = true;
        printedInfo = printThis;
    }

    public boolean isCalled()
    {
        return isCalled;
    }

    public String getPrintedInfo() {
        return printedInfo;
    }
}
