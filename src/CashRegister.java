class CashRegister {

    private Printer printer;

    CashRegister(Printer printer) {
        this.printer = printer;
    }

    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }

}
