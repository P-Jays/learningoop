import java.util.ArrayList;

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
