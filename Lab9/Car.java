package Lab9;

public class Car {//class
    private String model;
    private String make;
    private int carYears;
    private int latestYears;

    public Car(){//Constructor
        model = null;
        make = null;
        latestYears = 2022;
        carYears = 1915;
    }

    //Model
    public String getModel(){//Method
        return model;
    }

    //Brand
    public String getMake(){//Method
        return make;
    }

    //Years
    public int getYears(){//Method
        return carYears;
    }

    //Brand
    public void setMake(String Mk){
        make = Mk;
    }

    //Years
    public void setYears(int Y){//Method
        carYears = Y;
    }

    
    public void setModel(String M){//Method
        model = M;
    }

    public void tostring(){//Method
        System.out.print("Is " + getMake() + " Car and model is " + getModel() + " made in " + getYears());
    }

    public void isAntique(){
        int antiquecheck = latestYears - carYears;
        if(antiquecheck >= 45){
            System.out.println("This car is antique is " + antiquecheck + " years old.");
        }else{
            System.out.println("This car isn't antique is " + antiquecheck + " years old.");
        }
    }
}
