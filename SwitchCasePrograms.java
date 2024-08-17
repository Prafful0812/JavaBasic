package BasicProgramming;

public class SwitchCasePrograms {
    public static void main(String[] args) {
        int number = 42;
        String Shirtsize;
        switch (number){

            case 28:
                Shirtsize = "Small";
                break;
            case 32:
                Shirtsize = "large";
                break;
            case 36:
                Shirtsize = "extra large";
                break;
            case 42:
                Shirtsize = "Double extra large";
                break;
            default:
                Shirtsize = "Unknown";
                break;
        }
        System.out.println("SIze: " + Shirtsize);
    }
}

class programswitchcase{
    public static void main(String[] args) {
        int number = 53;
        String Shirtsize = "";

        if (number == 28){
            System.out.println("Shirt size Extra small");
        }else if(number == 30){
            System.out.println("Shirt size small");
        }else if(number == 32){
            System.out.println("Shirt size medium");
        }else if(number == 36){
            System.out.println("Shirt size large");
        }else if(number == 40){
            System.out.println("Shirt size extra large");
        }else
            System.out.println("Kindly provide the correct number");
        }
    }
