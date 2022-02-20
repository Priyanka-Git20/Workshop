public abstract class Bird {
    enum Color {
        GREEN, RED, BLACK, BLACK_WHITE, WHITE, YELLOW;
    }

    enum Gender {
        FEMALE, MALE, OTHER;
    }

    String name;
    Color color;
    Gender gender;

     void eat() {
         System.out.println(getClass().getSimpleName() + "can eat");
     }

    boolean doesMakesNest() {
         return false;
    }
}
