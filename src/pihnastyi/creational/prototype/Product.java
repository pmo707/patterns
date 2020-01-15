package pihnastyi.creational.prototype;

public class Product implements Cloneable {
    private int x1;
    private int x2;

    public Product() {
    }

    public Product(Product product) {
        if (product != null) {
            this.x1 = product.x1;
            this.x2 = product.x2;
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
