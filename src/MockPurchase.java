public class MockPurchase extends Purchase {
    public MockPurchase(Item[] items) {
        super(items);
    }
    private String shouldreturn;

    public void stubAsStringAndReturn(String shouldReturn) {
        shouldreturn = shouldReturn;
    }

    public String asString() {
        return shouldreturn;
    }
}
