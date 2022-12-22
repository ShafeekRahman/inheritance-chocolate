public class WhiteChocolates extends Chocolates{
    String colour="white";

    public WhiteChocolates(String name,int price)
    {
        super.price=price;
        super.name=name;
    }

    @Override
    void taste() {

        System.out.println("milky sweet");
    }
}
