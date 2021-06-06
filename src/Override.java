class Override {
    String name;

    Override(String name){
        this.name = name;
    }

    Override(){
        this.name= "hello baby";
    }  

    void show(){
        System.out.println("Hello override constructor: "+this.name);
    }

}


