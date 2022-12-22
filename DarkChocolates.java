public class DarkChocolates extends Chocolates {
    String color="Black";

    public DarkChocolates(String name,int price)
    {
        super.price=price;
        super.name=name;
    }

    @Override
    void taste() {
        System.out.println("tastes little bitter");
    }
}
