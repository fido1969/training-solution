package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqualName(Product p) {
        return getName().equals(p.getName());
    }

    public boolean areTheyEqualNamAndCode(Product p) {
        return getName().equals(p.getName()) && Math.abs(getCode().length() - p.getCode().length()) <= 1;
    }

    public static void main(String[] args) {

        Product p1 = new Product("Alma", "12");
        Product p2 = new Product("Körte", "144");
        Product p3 = new Product("Alma", "133");

        System.out.println(p1.areTheyEqualName(p2));
        System.out.println(p1.areTheyEqualName(p3));

        System.out.println();

        System.out.println(p1.areTheyEqualNamAndCode(p2));
        System.out.println(p1.areTheyEqualNamAndCode(p3));
    }

}
