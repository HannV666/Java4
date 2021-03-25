public class Toys extends Product {
    public Products type = Products.FOR_CHILDREN;
    @Override
    public Products getType(){
        return type;
    }
    @Override
    public void out(){
        System.out.println("id: "+ type.id + " '"+ type.description+"'");
        System.out.println(type);
        System.out.println("Toys");
    }
}
