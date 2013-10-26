import java.util.Arrays;

public class Purchase {

    private Item[] items;

    public Purchase(Item[] items) {

        this.items = items;
    }

    public String asString() {
        String out = "";

        for (Item item : items) {
            out += item.getName() + "\t" + item.getPrice() + "\n";
        }

      return out;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;

        Purchase purchase = (Purchase) o;

        if (!Arrays.equals(items, purchase.items)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(items);
    }
}
