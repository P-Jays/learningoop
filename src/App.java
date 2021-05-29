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
       

        Methode metode1 = new Methode("Metta","10643039");
        metode1.show();
        metode1.setName("My love");
        metode1.show();
        String testParNReturn =  metode1.sayHi("PJ");
        
        System.out.println(testParNReturn);

        for(int i = 0 ; i<=20; i++){
            System.out.print("=");
            
        }
        System.out.println("");

        System.out.println("This is setter n getter");

        Circle lingkaran = new Circle(7);
        lingkaran.setJari(7);
        System.out.println(lingkaran.getJari()+" this is getter from jari2");
        
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

// learning setter n getter
class Circle{
    private double jari;
    private double luas;
    // circle constructor
    Circle(double jari){
        this.luas = jari * jari; 
        System.out.println("Luas: "+this.luas +" with jari2:"+jari);
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getJari(){
        return this.jari;
    }
}

class Methode{
    String name ;
    String student_id;


    Methode(String name ,String student_id){
        this.name = name;
        this.student_id = student_id;
    }

    //  method without return n parameter
    void show(){
        System.out.println("Name: "+this.name);
        System.out.println("Student ID: "+this.student_id);
    }

    // method with parameter no return
    void setName(String name){
        this.name = name;                 
    }

    void setStudentID(String student_id){
        this.student_id = student_id;
    }

    // method with return without parameter
    String getName(){
        return this.name;
    }

    String getStudentID(){
        return this.student_id;
    }


    // method with return with parameter
    String sayHi(String name){
        return "Hello "+name;
    }
}
