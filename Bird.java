public abstract class Bird {
     void eat(){
         System.out.println(getClass().getSimpleName() + "can eat");

     }
    boolean doesMakesNest(){
        return false;
    }
}
