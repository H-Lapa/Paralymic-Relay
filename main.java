import java.util.*;

class UniversalRelayTeam {
  String country;
  int leg1;
  int leg2;
  int leg3;
  int leg4;
}


class Main {
  public static void main(String[] args) {
    question();
  }

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
  }

  public static String getLegs (UniversalRelayTeam team)
  {
    String x = "The " + getCountry(team) + " team is: Leg 1, T" + getleg1(team) + "; Leg 2, T" + getleg2(team) + "; Leg 3, T" + getleg3(team) + "; Leg 4, T" + getleg4(team);
    return x;
  }

  public static String notLegalMessage (UniversalRelayTeam team) 
  {
    String letter = "";

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
  }

  public static void question()
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What country is the team representing? ");
    String country = scanner.next();
    UniversalRelayTeam team = createTeam(country, 0, 0, 0, 0);

    for (int i=1; i<=4; i++) {
      System.out.print("What is the disability class for leg " + i +"? T ");
      int n = scanner.nextInt();
      team = setLeg(team, n, i);
    }

    System.out.println(getLegs(team));
    System.out.println(notLegalMessage(team));
  }

  //accessor methods

  //getter methods
  public static int getleg1 (UniversalRelayTeam x)
  {
    return x.leg1;
  }

  public static int getleg2 (UniversalRelayTeam x)
  {
    return x.leg2;
  }

  public static int getleg3 (UniversalRelayTeam x)
  {
    return x.leg3;
  }

  public static int getleg4 (UniversalRelayTeam x)
  {
    return x.leg4;
  }

  public static String getCountry (UniversalRelayTeam x)
  {
    return x.country;
  }

  //setter methods
  public static void setleg1 (UniversalRelayTeam x, int n)
  {
    x.leg1 = n;
  }

  public static void setleg2 (UniversalRelayTeam x, int n)
  {
    x.leg2 = n;
  }

  public static void setleg3 (UniversalRelayTeam x, int n)
  {
    x.leg3 = n;
  }
  
  public static void setleg4 (UniversalRelayTeam x, int n)
  {
    x.leg4 = n;
  }

  public static void setCountry(UniversalRelayTeam team, String country) 
  {
    team.country = country;
  }

  //intialisation methods
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
