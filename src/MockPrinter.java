public class MockPrinter extends Printer {
    private boolean called = false;
    private String printing;

    public void print(String printThis) {
        this.printing = printThis;
        called = true;
    }

    public String printed() {
        return printing;
    }
}
