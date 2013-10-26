class CashRegister {

    public void process(Purchase purchase, Printer pr) {
        pr.print(purchase.asString());
    }
}
