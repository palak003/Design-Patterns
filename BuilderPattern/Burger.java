package BuilderPattern;

public class Burger {
    private String size;
    private boolean cheese;
    private boolean lettuce;
    private boolean onion;
    private boolean tomato;

    private Burger(BurgerBuilder burgerBuilder){
        this.size=burgerBuilder.size;
        this.cheese=burgerBuilder.cheese;
        this.lettuce=burgerBuilder.lettuce;
        this.onion=burgerBuilder.onion;
        this.tomato=burgerBuilder.tomato;
    }

    public void showIngredients() {
        System.out.println("Burger Size: " + size);
        System.out.println("Cheese: " + cheese);
        System.out.println("Lettuce: " + lettuce);
        System.out.println("Onion: " + onion);
        System.out.println("Tomato: " + tomato);
    }

    public static class BurgerBuilder{
        private String size;
        private boolean cheese;
        private boolean lettuce;
        private boolean onion;
        private boolean tomato;


        public BurgerBuilder(String size){ //mandatory
            this.size=size;
        }

        public BurgerBuilder addCheese(){
            this.cheese=true;
            return this;
        }

        public BurgerBuilder addLettuce(){
            this.lettuce=true;
            return this;
        }

        public BurgerBuilder addOnion(){
            this.onion=true;
            return this;
        }

        public BurgerBuilder addTomato(){
            this.tomato=true;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
