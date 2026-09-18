class Product {
    private String _name;
    private int _price;

    public Product(String name, int price) {
        _name = name;
        _price = price;
    }
    public String getName() {
        return _name;
    }
    public int getPrice() {
        return _price;
    }
    public void work() {
        System.out.println("機能を実行します。");
    }
}

class PrinterProduct extends Product{
    public PrinterProduct(String name, int price) {
        super(name, price);
    }
    public void work() {
        System.out.println("印刷します。");
    }
}

class CameraPruduct extends Product{
    public CameraPruduct (String name, int price) {
        super(name, price);
    }
    public void work() {
        System.out.println("撮影します。");
    }
}

class Executer {
    public void doProduct(Product p) {
        p.work();
    }
}

class Test09162{
    public static void main(String[] args) {
        PrinterProduct p1 = new PrinterProduct("AAA", 15000);
        CameraPruduct p2 = new CameraPruduct("BBB", 30000);
        Executer e = new Executer();
        e.doProduct(p1);
        e.doProduct(p2);
    }
}