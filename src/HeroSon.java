// sub class , child class, derived class
public class HeroSon extends HeroDad {
    String name = "Hero Son";
    // empty

    // override method, krn di parent class sudah ada, tapi bisa di override dari
    // child class.
    // jika memanggil override method inheritance , maka akan di prioritaskan method
    // dari child
    // parent class tidak bisa menggunakan method dari child class
    void show() {
        System.out.println("This is overriding method from subclass" + this.name);
        
    }

    void display(){
        System.out.println(" this is sub class " +super.name);
        // super adalah memanggil method atau parameter yg berada di superclass atau parent class
        super.display();
        
    }
}
