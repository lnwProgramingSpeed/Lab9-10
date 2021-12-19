package Lab9;

public class DOG {
    public String dogName;
    public int dogAge;
    public int dogAgeInHuman;

    public DOG() {
        dogName = null;
        dogAge = 0;
        dogAgeInHuman = dogAge * 7;
    }

    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public int getDogAgeHuman() {
        return dogAgeInHuman;
    }

    public void setDogName(String Name) {
        dogName = Name;
    }

    public void setAge(int Age) {
        dogAgeInHuman = Age * 7;
    }

    public void tostring() {
        System.out.print("Your Dog name is " + dogName + " Age: " + dogAgeInHuman);
    }
}
