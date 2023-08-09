package lecture9;

import java.time.LocalDate;

public class Person {
    private final String name;
    private String sex;
    private final String religion;
    private final String languageSpoken;
    private boolean job;
    private final String nationality;
    private String egn;

    private String birthDate;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, boolean job, String nationality, String egn, String countryOfResidence) {
        this.name = name;
        setSex(sex);
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        setEgn(egn);
        setBirthDate(egn);
        setAge(egn);
        this.countryOfResidence = countryOfResidence;
    }

    private void setEgn(String egn) {

        if (egn.length() == 10 && containsOnlyDigits(egn)) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not valid");
        }

    }

    private boolean containsOnlyDigits(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void setSex(String sex) {
        if (sex.equals("Male") || sex.equals("Female") ) {
            this.sex = sex;
        } else {
            throw new RuntimeException("There are only two genders");
        }
    }
    private void setBirthDate(String egn){
        String month = egn.substring(2,4);
        String dateOfBirth = egn.substring(4,6);
        this.birthDate = month + "-" + dateOfBirth;
    }

    private void setAge(String egn){
        String year = "19" + egn.substring(0,2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(year);
    }

    public void sayHello(){
        switch(languageSpoken){
            case "Bulgarian":
                System.out.println("Здравейте!");
                break;
            case "Italian":
                System.out.println("Salve!");
                break;
            default:
                System.out.println("Hello!");
        }
    }
    public void celebrateEaster(){
        if(religion.equals("Orthodox") || religion.equals("Catholic")) {
            System.out.println("Christ has risen!");
        } else {
            System.out.println("Only Christians can celebrate Easter!");
        }
    }
    public void isAdult(){
        if(age < 18){
            System.out.println("You are not an adult");
        } else if (age < 21 && countryOfResidence == "USA") {
            System.out.println("You are underage");
        } else {
            System.out.println("You are an adult");
        }
    }

    public void canTakeLoan(){
        if(job == true){
            System.out.println("You are eligible for a loan");
        } else {
            System.out.println("You are not eligible for a loan");
        }
    }
    public void setHasJob(boolean hasJob) {
        this.job = hasJob;
    }

    public void setCountry(String country) {
        this.countryOfResidence = country;
    }

}