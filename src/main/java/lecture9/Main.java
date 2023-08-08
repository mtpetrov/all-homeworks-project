package lecture9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marin Petrov", "Male", "Islam", "English", true, "Bulgarian", "8305434031" , "Bulgaria");
        Bulgarian bulgarian = new Bulgarian("Petko Grozdanov", "Male", "Orthodox", true, "9711234093", "Bulgaria");
        Italian italian = new Italian("Giuseppe Forza", "Male", "Catholic", false, "9905134603", "Italy");
        American american = new American("Amanda Smith", "Female", "Islam", false, "9603139532", "USA");
        Child child = new Child("Kristina", "Female", "Orthodox", "English", "American", "9904031343", "USA");

        bulgarian.isAdult();
        bulgarian.sayHello();
        bulgarian.danceHoro();
        bulgarian.celebrateEaster();
        bulgarian.canTakeLoan();

        italian.isAdult();
        italian.makePasta();
        italian.sayHello();
        italian.canTakeLoan();
        italian.celebrateEaster();

        american.sayHello();
        american.isAdult();
        american.playBaseball();
        american.celebrateEaster();
        american.canTakeLoan();

        child.goToSchool();
        child.sayHello();
        child.celebrateEaster();
        child.isAdult();
        child.canTakeLoan();
    }
}
