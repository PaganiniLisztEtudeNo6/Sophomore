public class Pet {
    private String name;
    private String sex;
    private int age;

    public Pet(String pname, String s, int a) {
        name = pname;
        sex = s;
        age = a;
    }

    public String getPetName() {
        return name;
    }

    public String getPetSex() {
        return sex;
    }

    public int getPetAge() {
        return age;
    }

}