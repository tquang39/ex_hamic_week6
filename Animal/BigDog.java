package Animal;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.print("Wooow");
    }

    public void greets(Dog another) {
        System.out.print("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.print("Wooooooooow");
    }
}
