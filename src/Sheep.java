import java.util.List;


public class Sheep {

   enum Animal {
      sheep, goat
   };

   public static void main(String[] param) {
//        Animal[] animals = new Animal [4];
//        animals[0] = Animal.goat;
//        animals[1] = Animal.sheep;
//        animals[2] = Animal.goat;
//        animals[3] = Animal.sheep;
//        reorder(animals);
   }

   public static void reorder(Animal[] animals) {
      int count = 0;

      for (Animal animal : animals) {
         if (animal == Animal.goat) {
            count++;
         }
      }
      // loop fills the arr with goats until count
      for (int i = 0; i < count; i++) {
         animals[i] = Animal.goat;
      }

      // loop fills remaining arr space with sheep
      for (int i = count; i < animals.length; i++) {
         animals[i] = Animal.sheep;
      }
   }
}



