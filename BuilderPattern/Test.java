package BuilderPattern;

public class Test {

    public static void main(String[] args){
        Burger burgerForPalak= new Burger.BurgerBuilder("Large")
                .addCheese()
                .addLettuce()
                .addOnion()
                .build();
        burgerForPalak.showIngredients();
    }
}
