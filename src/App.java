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

        for(int i = 0 ; i<=20; i++){
            System.out.print("=");
            
        }
        System.out.println("");

        System.out.println("This is obj and class");
        System.out.println(obj1.nama);
        System.out.println(obj2.target);
        System.out.println(obj1.target);

        for(int i = 0 ; i<=20; i++){
            System.out.print("=");
            
        }
        System.out.println("");

        System.out.println("This is constuctor");

        CstrctrKlas constructor1 = new CstrctrKlas("Kelvin", 8, "salary above 80,000 is possible if i can help people");

        for(int i = 0 ; i<=20; i++){
            System.out.print("=");
            
        }
        System.out.println("");

        System.out.println("This is method");
       
    }
}

// class for creating obj
class Kelas{
    String nama;
    int no_absen;
    String target;
  
}

// creating class with constructor
class CstrctrKlas{
    String nama;
    int no_absen;
    String target;

    // constructor
    CstrctrKlas(String inputName, int inputNo_absen, String inputTarget){
        // this method will be called when the object first time been created
        System.out.println("Constructor created");

        nama = inputName;
        no_absen = inputNo_absen;
        target = inputTarget;
    }
  
}
