public class HeroDaughter extends HeroDad {
    // kosong boss

    // override method, krn di parent class sudah ada, tapi bisa di override dari
    // child class.
    // jika memanggil override method inheritance , maka akan di prioritaskan method
    // dari child
    // parent class tidak bisa menggunakan method dari child class
    void show() {
        System.out.println("This is overriding method from subclass" + this.name);
        super.display();
    }

    void display(){
        System.out.println(" this is sub class");
    }
}
