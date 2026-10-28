
public class ActivityOne {

    void main(String[] Args) {

        //Formulary of the Dog
        String name = IO.readln("What is the name of the Dog? ");
        var size = Integer.parseInt(IO.readln("What is the size of the Dog? "));
        int age = Integer.parseInt(IO.readln("What is the age of the Dog? "));
        var sex = IO.readln("What is the sex of the dog? (H/M): ");
        
        //If statement to determine if the dog is tall or short
        String answer1;
        if (size > 15) {
            answer1 = "Tall";
        } else {
            answer1 = "Short";
        }

        //If statement to determine if the dog is old or young
        String answer2;
        if (age >= 7) {
            answer2 = "Old";
        } else {
            answer2 = "Young";
        }

        //If statement to determine if the dog is male or female
        String answer3;
        if (sex.equalsIgnoreCase("H")) {
            answer3 = "Male";
        } else if (sex.equalsIgnoreCase("M")) {
            answer3 = "Female";
        } else {
            answer3 = "Invalid";
        }

        String heOrShe;
        if (answer3 == "Male") {
            heOrShe = "He";
        } else {
            heOrShe = "She";
        }

        //Output
        IO.println("The " + name + "'s an " + answer2 + " Dog, " + heOrShe + "'s a " + answer3 + " and " + heOrShe + "'s a " + answer1 + " Dog.");
    }

}

