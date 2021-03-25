public class Smartphone extends Product {
    public Products type = Products.ELECTRONICS;
    @Override
    public Products getType(){
        return type;
    }
    @Override
    public void out(){
        System.out.println("id: "+ type.id + " '"+ type.description+"'");
        System.out.println(type);
        System.out.println("Smartphone");
    }
}
