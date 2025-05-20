package TemplatePattern;

abstract class Recipe{

    public final void make(){
        getIngredients();
        prepare();
        bake();
        decorate();
    }

    public abstract void getIngredients();
    public abstract void prepare();

    //common to all hence not abstract
    public void bake(){
        System.out.println("Baking is common step");
    }

    public abstract void decorate();
}

class CakeRecipe extends Recipe{

    @Override
    public void getIngredients(){
        System.out.println("getting ingredients for cake");
    }

    @Override
    public void prepare(){
        System.out.println("perparing cake");
    }

    @Override
    public void decorate(){
        System.out.println("decorating cake");
    }
}


class CookieRecipe extends Recipe{

    @Override
    public void getIngredients(){
        System.out.println("getting ingredients for Cookie");
    }

    @Override
    public void prepare(){
        System.out.println("perparing Cookie");
    }

    @Override
    public void decorate(){
        System.out.println("decorating Cookie");
    }
}

public class BakingDemo {
    public static void main(String[] args) {
        Recipe cakeRecipe = new CakeRecipe();
        cakeRecipe.make();
        Recipe cookieRecipe = new CookieRecipe();
        cookieRecipe.make();
    }
}
