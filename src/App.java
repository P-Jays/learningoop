public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println("hello baby");
        // System.out.println("last push please");
        // System.out.println("ong");

        Kelas kelas1 = new Kelas();
        kelas1.nama = "PJ";
        kelas1.no_absen = 8;
        kelas1.target = "PJ will be great problem solver";

        Kelas kelas2 = new Kelas();
        kelas2.nama = "PeeJays";
        kelas2.no_absen = 18;
        kelas2.target = "PJ can go to Taipei";

        System.out.println(kelas1.nama);
        System.out.println(kelas2.target);
        System.out.println(kelas1.target);
    }
}

class Kelas{
    String nama;
    int no_absen;
    String target;
}
