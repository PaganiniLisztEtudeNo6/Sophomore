import java.util.ArrayList;

public class OBJ_petapp {
    public static void main(String args[]) {
        ArrayList<Pet> PetList = new ArrayList<Pet>();
        Pet p;
        Pet pet1 = new Pet("a", "M", 3);
        Pet pet2 = new Pet("b", "F", 2);
        Pet pet3 = new Pet("c", "F", 1);

        PetList.add(pet1);
        PetList.add(pet2);
        PetList.add(pet3);

        p = PetList.get(2);
        System.out.print(" = " + p.getPetName() + " " + p.getPetSex() + " " + p.getPetAge());
    }

}