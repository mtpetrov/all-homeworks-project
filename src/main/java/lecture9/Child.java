package lecture9;

public class Child extends Person{
    public Child(String name, String sex, String religion, String languageSpoken, String nationality, String egn, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, false , nationality, egn, countryOfResidence);
    }

    @Override
    public void isAdult() {
        System.out.println("You are a child");
    }

    @Override
    public void canTakeLoan() {
        System.out.println("Children cannot take out loans");
    }

    public void goToSchool(){
        System.out.println("You are going to school");
    }
}
