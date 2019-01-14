public class Order {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 15.60;
        drink.alkohol = true;
        drink.ingredientsNo1 = new AlcoholIngredientsNo1();
        drink.ingredientsNo1.alcoholType = "rum";
        drink.ingredientsNo1.weightMl = 20;
        drink.ingredientsNo2 = new SugarIngredientsNo2();
        drink.ingredientsNo2.sugarType = "brown sugar";
        drink.ingredientsNo2.spoon = 1;
        drink.ingredientsNo3 = new HerbsIngredientsNo3();
        drink.ingredientsNo3.herbType = "mint";
        drink.ingredientsNo3.leaves = 3;
        drink.ingredientsNo4 = new FruitsIngredientsNo4();
        drink.ingredientsNo4.fruitType = "lemon";
        drink.ingredientsNo4.slice = 4;
        drink.ingredientsNo5 = new LiquidIngredientsNo5();
        drink.ingredientsNo5.waterType = "spring water";
        drink.ingredientsNo5.ml = 40;

        double weightOfDrink = drink.ingredientsNo1.weightMl + drink.ingredientsNo5.ml;
        double numberOfIngredients = drink.ingredientsNo2.spoon + drink.ingredientsNo4.slice + drink.ingredientsNo3.leaves;

        System.out.println("I would like to order: " + drink.name);
        System.out.println("What is the price? " + drink.price + " zł.");
        System.out.println("Is it a drink with alcohol? " + drink.alkohol);
        System.out.println("Pls, give me the ingredients: " + drink.ingredientsNo1.alcoholType + ", " + drink.ingredientsNo2.sugarType + ", " + drink.ingredientsNo3.herbType + ", " + drink.ingredientsNo4.fruitType + " and " + drink.ingredientsNo5.waterType);
        System.out.println("The total weight of drink in ml is: " + weightOfDrink + " and total number of ingredients is: " + numberOfIngredients);
    }
}
