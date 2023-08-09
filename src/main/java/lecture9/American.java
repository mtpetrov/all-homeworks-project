package lecture9;

public class American extends Person{
    public American(String name, String sex, String religion, boolean job, String egn, String countryOfResidence) {
        super(name, sex, religion, "English", job, "USA", egn, countryOfResidence);
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void isAdult() {
        super.isAdult();
    }

    public void playBaseball(){
        System.out.println("You are playing baseball");
    }
}
