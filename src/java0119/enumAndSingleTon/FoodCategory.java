package java0119.enumAndSingleTon;

enum FoodCategory {
    HAMBURGER("햄버거", 5000), CHICKEN("치킨", 15000), PIZZA("피자", 20000);

    int price;
    String name;

    FoodCategory(String name, int price) {
        this.price = price;
        this.name = name;
    }
}

