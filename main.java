import java.util.*;

//record for a team, storing country and leg numbers
class UniversalRelayTeam {
  String country;
  int leg1;
  int leg2;
  int leg3;
  int leg4;
}


class Main {

  //main function to be executed
  public static void main(String[] args) {
    question(); // runs all the code necessary 
  }//END of main

  //Depends the value of i the teamleg value is set to n
  public static UniversalRelayTeam setLeg (UniversalRelayTeam team, int n, int i)
  {
    switch (i) {
      case 1:
        setleg1(team, n);
        break;
      case 2:
        setleg2(team, n);
        break;
      case 3:
        setleg3(team, n);
        break;
      case 4:
        setleg4(team, n);
        break;
    }

    return team;
  }//END of setLeg

  //message about team and their legs
  public static String getLegs (UniversalRelayTeam team)
  {
    String x = "The " + getCountry(team) + " team is: Leg 1, T" + getleg1(team) + "; Leg 2, T" + getleg2(team) + "; Leg 3, T" + getleg3(team) + "; Leg 4, T" + getleg4(team);
    return x;
  }//END of getLegs


  //produces a message about each leg if legal or not
  public static String notLegalMessage (UniversalRelayTeam team) 
  {
    // declaring an empty string incase all are legal
    String letter = ""; 

    //if team leg value doesnt meet requirement, a string is added to the letter string variable making one big message
    if (getleg1(team) != 11 && getleg1(team) != 13) {
      letter = "Leg 1 (T" + getleg1(team) + ") is not legal.";
    }
    if (getleg2(team) != 61 && getleg2(team) != 62) {
      letter = letter + "\n Leg 2 (T" + getleg2(team) + ") is not legal.";
    }
    if (getleg3(team) != 35 && getleg3(team) != 36) {
      letter = letter + "\n Leg 3 (T" + getleg3(team) + ") is not legal.";
    }
    if (getleg4(team) != 51 && getleg4(team) != 52) {
      letter = letter + "\n Leg 4 (T" + getleg4(team) + ") is not legal.";
    }

    return letter;
  }//END notLegalMessage

  //asks the questions to update the details of the team
  public static void question()
  {
    Scanner scanner = new Scanner(System.in);

    //asks for the country and retrieves it from the user
    System.out.print("What country is the team representing? ");
    String country = scanner.next();

    //sets UniversalRelayTeam with country name but values as 0, as it gets updated later
    UniversalRelayTeam team = createTeam(country, 0, 0, 0, 0);

    //asks question in loop and uses setLeg method to update values
    for (int i=1; i<=4; i++) {
      System.out.print("What is the disability class for leg " + i +"? T ");
      int n = scanner.nextInt();
      team = setLeg(team, n, i);
    }

    //prints final messsages back to the user
    System.out.println(getLegs(team));
    System.out.println(notLegalMessage(team));
  }//END of question

  //ACCESSOR METHODS

  //GETTER methods

  //all methods get their perspective value in the UniversalRelayTeam
  public static int getleg1 (UniversalRelayTeam x)
  {
    return x.leg1;
  }//END of getLeg1

  public static int getleg2 (UniversalRelayTeam x)
  {
    return x.leg2;
  }//END of getLeg2

  public static int getleg3 (UniversalRelayTeam x)
  {
    return x.leg3;
  }//END of getLeg3

  public static int getleg4 (UniversalRelayTeam x)
  {
    return x.leg4;
  }//END of getLeg4

  public static String getCountry (UniversalRelayTeam x)
  {
    return x.country;
  }//END of getCountry

  //setter methods

  //all methods set their perspective value in the UniversalRelayTeam
  public static void setleg1 (UniversalRelayTeam x, int n)
  {
    x.leg1 = n;
  }//END of setLeg1

  public static void setleg2 (UniversalRelayTeam x, int n)
  {
    x.leg2 = n;
  }//END of setLeg2

  public static void setleg3 (UniversalRelayTeam x, int n)
  {
    x.leg3 = n;
  }//END of setLeg3
  
  public static void setleg4 (UniversalRelayTeam x, int n)
  {
    x.leg4 = n;
  }//END of setLeg4

  public static void setCountry(UniversalRelayTeam team, String country) 
  {
    team.country = country;
  }//END of setCountry

  //intialisation method

  //Creates a UniversalRelayTeam using setter methods
  public static UniversalRelayTeam createTeam (String country, int leg1, int leg2, int leg3, int leg4)
  {
    UniversalRelayTeam team = new UniversalRelayTeam();
    setCountry(team, country);
    setleg1(team, leg1);
    setleg2(team, leg2);
    setleg3(team, leg3);
    setleg4(team, leg4);
    return team;
  }
}
