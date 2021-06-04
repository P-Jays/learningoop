import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // creating an obj call obj
        Kelas obj1 = new Kelas();
        obj1.nama = "PJ";
        obj1.no_absen = 8;
        obj1.target = "PJ will be great problem solver";

        Kelas obj2 = new Kelas();
        obj2.nama = "PeeJays";
        obj2.no_absen = 18;
        obj2.target = "PJ can go to Taipei";

        blankSpace();

        System.out.println("This is obj and class");
        System.out.println(obj1.nama);
        System.out.println(obj2.target);
        System.out.println(obj1.target);

        blankSpace();

        System.out.println("This is constuctor");

        CstrctrKlas constructor1 = new CstrctrKlas("Kelvin", 8, "salary above 80,000 is possible if i can help people");

        blankSpace();

        System.out.println("This is method");

        Methode metode1 = new Methode("Metta", "10643039");
        metode1.show();
        metode1.setName("My love");
        metode1.show();
        String testParNReturn = metode1.sayHi("PJ");

        System.out.println(testParNReturn);

        blankSpace();

        System.out.println("This is setter n getter");

        Circle lingkaran = new Circle(7);
        lingkaran.setJari(7);
        System.out.println(lingkaran.getJari() + " this is getter from jari2");

        blankSpace();
        
        System.out.println("ini adalah static variable");

        Statik statik1 = new Statik("PJ");
        Statik statik2 = new Statik("PJ2");
        Statik statik3 = new Statik("PJ3");

        statik1.show();
        statik2.show();

        statik3.show();
        System.out.println("ini adalah statik");
        // Statik.type = "Hello"; // kita bsa lansung memanggil statik variable di luar
        // obj , karena statik variable milik class bukan obj
        // tapi ada cara lebih baik menggunakan statik, yg ini tidak di anjurkan

        statik1.showStatik("Hellooo");
        System.out.println("Display type: " + statik1.type);
        System.out.println("Display type: " + statik2.type);
        System.out.println("Display type: " + statik3.type);

        blankSpace();
        System.out.println("ini adalah statik method");
        HeroStatik player1 = new HeroStatik("KelvinP");
        HeroStatik player2 = new HeroStatik("Pj the Great");
        HeroStatik player3 = new HeroStatik("PJ's Queen");
        HeroStatik player4 = new HeroStatik("PJ's Princess");

        HeroStatik.showTotal();
        HeroStatik.showHeroes();
        player1.showHeroes(); // hasilnya akan sama karena static


    }


    static void blankSpace(){
        for (int i = 0; i <= 20; i++) {
            System.out.print("=");

        }
        System.out.println("");

    }
}

// class for creating obj
class Kelas {
    String nama;
    int no_absen;
    String target;

}

// creating class with constructor
class CstrctrKlas {
    String nama;
    int no_absen;
    String target;

    // constructor
    CstrctrKlas(String inputName, int inputNo_absen, String inputTarget) {
        // this method will be called when the object first time been created
        System.out.println("Constructor created");

        nama = inputName;
        no_absen = inputNo_absen;
        target = inputTarget;
    }

}

// learning setter n getter
class Circle {
    private double jari;
    private double luas;

    // circle constructor
    Circle(double jari) {
        this.luas = jari * jari;
        System.out.println("Luas: " + this.luas + " with jari2:" + jari);
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return this.jari;
    }
}

class Methode {
    String name;
    String student_id;

    Methode(String name, String student_id) {
        this.name = name;
        this.student_id = student_id;
    }

    // method without return n parameter
    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.student_id);
    }

    // method with parameter no return
    void setName(String name) {
        this.name = name;
    }

    void setStudentID(String student_id) {
        this.student_id = student_id;
    }

    // method with return without parameter
    String getName() {
        return this.name;
    }

    String getStudentID() {
        return this.student_id;
    }

    // method with return with parameter
    String sayHi(String name) {
        return "Hello " + name;
    }
}

class Statik {
    static String type;
    // tujuan statik adalah 2 , tidak perlu membuat obj utk memanggil variable nya
    // pada saat di rubah maka yg lain juga ikut terubah
    private String nama;

    Statik(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    void show() {
        System.out.println("Display nama: " + this.nama);

    }

    void showStatik(String type) {
        Statik.type = type;
    }
}

class HeroStatik {
    private String name;
    private static int heroTotal;
    private static ArrayList<String> heroList = new ArrayList<String>();

    HeroStatik(String name) {
        this.name = name;
        HeroStatik.addHero();
        heroList.add(this.name);
    }

    void display() {
        System.out.println("My name is " + this.name);
    }

    static void showTotal() {
        System.out.println("Hero total" + HeroStatik.heroTotal);
    }

    private static void addHero() {
        HeroStatik.heroTotal++;
    }

     static void showHeroes(){
        System.out.println("the list of heroes :"+HeroStatik.heroList);
    }

}
