package com.src.tuto;

public class Statik {

        public static String type;
        // tujuan statik adalah 2 , tidak perlu membuat obj utk memanggil variable nya
        // pada saat di rubah maka yg lain juga ikut terubah
        private String nama;
    
        public Statik(String nama) {
            this.nama = nama;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void show() {
            System.out.println("Display nama: " + this.nama);
    
        }
    
        public void showStatik(String type) {
            Statik.type = type;
        }
    
}
