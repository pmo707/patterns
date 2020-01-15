package pihnastyi.creational.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        product.setX1(1);
        product.setX2(2);
        Product cloneProduct = new Product(product);
        Product cloneCloneProduct = cloneProduct.clone();

        System.out.println(product);
        System.out.println(cloneProduct);
        System.out.println(cloneCloneProduct);
        System.out.println(product == cloneProduct);
        System.out.println(cloneCloneProduct == cloneProduct);
    }
}
