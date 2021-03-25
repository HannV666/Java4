/*(
Создать перечисление, содержащее типы продукции (для дома, для детей, хозтовары, фармация...).                           ***
Перечисление содержит метод getDescription, возвращающий информацию о типе продукции.                                    ***
У каждого типа продукции должен быть свой идентификатор - уникальный код, который определяет                             ***
Создать интерфейс - выпуск продукции, один из методов которого -
вывод продукции в зависимости от типа, указанного в параметре                                                            ???
Создать абстрактный класс - Продукт, который имеет методы для понимания того, что это за продукт (придумываете сами).    *?*
Создать массив продуктов (создать свои классы, одно из полей класса - перечисление, которое определяет,
к какому типу продукции относится товар).                                                                                ***
Создать класс Магазин, содержащий методы интерфейса + дополнительный метод,
который позволяет по переданному параметру - вывести продукты определеннго типа
 */
public enum Products {
    ELECTRONICS ("0001e", "Electronics"),
    BOOKS ("0002b", "Books"),
    HOUSEHOLD_GOODS ("0003hg", "Household goods"),
    FOR_CHILDREN ("0005fch", "For children"),
    COSMETIC ("0006c", "Cosmetic"),
    FOR_HOME_USE ("0007fhu", "For home use");

    public String id;
    public String description;
    Products(String id, String description){
        this.id = id;
        this.description = description;
    }
    public String getDescription() {
        System.out.println("id: "+id);
        return description;
    }
/*
    public static void main(String[] args) {

        System.out.println(Products.);
    }

 */
}
