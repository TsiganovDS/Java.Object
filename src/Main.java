package pro.sky;

public class Main {

    public static void main(String[] args) {
        String nameJonh = "Jonh";
        int ageJonh = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i<names.length; i++ ) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name - " + sarah.getName());
        System.out.println("sarah.age - " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge - " + sarah.getAge());

        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

    }
}