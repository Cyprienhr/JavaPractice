public class Functions {
    public static void main(String [] args){
        Animal ani = new Animal();
      ani.makeSounds();
        Animal.Kill();

    }
}

class Animal {
     void makeSounds(){
        System.out.println("Animal makes sound");
    }
    static void Kill(){
        System.out.println("Animal can kill you");
    }
}
