package lecture9;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, boolean job, String egn, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", egn, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Salve!");
    }

    @Override
    public void isAdult() {
        super.isAdult();
    }
    public void makePasta(){
        System.out.println("You are making delicious pasta");
    }
}
