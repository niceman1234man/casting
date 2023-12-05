public class Main {
    public  static void main(String [] args){
        //up casting
        Cat cat= new Cat();
        Animal animal=cat;
        cat.hungry();
        //down casting
        Animal animal1=new Cat();
        ( (Cat)animal).meow();


    }
}
