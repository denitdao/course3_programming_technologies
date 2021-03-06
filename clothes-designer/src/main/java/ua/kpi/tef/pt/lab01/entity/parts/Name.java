package ua.kpi.tef.pt.lab01.entity.parts;

// divide into upper and lower names
public enum Name {
    COAT("Coat"), JACKET("Jacket"), SHIRT("Shirt"), T_SHIRT("T-shirt"), SWEATER("Sweater"),
    PANTS("Pants"), JEANS("Jeans"), SHORTS("Shorts");

    private final String title;

    Name(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
