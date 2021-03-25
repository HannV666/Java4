/*
Создать класс Магазин, содержащий методы интерфейса + дополнительный метод,
который позволяет по переданному параметру - вывести продукты определеннго типа
 */
public class Score implements ProductionOutput {
    @Override
    public void outPut(Products products){
        switch (products) {
            case ELECTRONICS:{
                System.out.println("Electronics");
                break;
            }
            case BOOKS:{
                System.out.println("Books");
                break;
            }
            case HOUSEHOLD_GOODS: {
                System.out.println("Household goods");
                break;
            }
            case COSMETIC:{
                System.out.println("Cosmetic");
                break;
            }
            case FOR_CHILDREN:{
                System.out.println("For children");
                break;
            }
            case FOR_HOME_USE:{
                System.out.println("For home use");
                break;
            }
        }
        System.out.println("Error");
    }
    public void printProducts(Products products, Product[] mass){
        for(int i = 0; i < mass.length; i++){
            if(products == mass[i].getType())
                mass[i].out();
        }
    }
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Smartphone();
        products[1] = new Detective();
        products[2] = new Powder();
        products[3] = new Toys();
        products[4] = new Concealer();
        products[5] = new Towel();
        Score score = new Score();
        score.printProducts(Products.BOOKS, products);

    }
}
