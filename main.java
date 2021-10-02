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

  public static UniversalRelayTeam setCountry(UniversalRelayTeam team, String country) 
  {
    team.country = country;
    return team;

  }

  public static UniversalRelayTeam setLeg (UniversalRelayTeam team, int n, int i)
  {
    switch (i) {
      case 1:
        team.leg1 = n;
        break;
      case 2:
        team.leg2 = n;
        break;
      case 3:
        team.leg3 = n;
        break;
      case 4:
        team.leg4 = n;
        break;
    }

    return team;
  }

  public static String getLegs (UniversalRelayTeam team)
  {
    String x = "The " + team.country + " team is: Leg 1, T" + team.leg1 + "; Leg 2, T" + team.leg2 + "; Leg 3, T" + team.leg3 + "; Leg 4, T" + team.leg4;
    return x;
  }

  public static String notLegalMessage (UniversalRelayTeam team) 
  {
    //issue here
    //its the only part thats not working this whole thing
    String final;

    if (team.leg1 != 11 || team.leg1 != 13) {
      final = "Leg 1 (T" + team.leg1 + ") is not legal.";
    }
    if (team.leg2 != 61 || team.leg2 != 62) {
      final = final + "\n Leg 2 (T" + team.leg2 + ") is not legal.";
    }
    if (team.leg3 != 35 || team.leg3 != 36) {
      final = final + "\n Leg 3 (T" + team.leg3 + ") is not legal.";
    }
    if (team.leg4 != 51 || team.leg4 != 52) {
      final = final + "\n Leg 4 (T" + team.leg4 + ") is not legal.";
    }

    return final;
  }

  public static void question()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is the classification (maximum points) of this relay event? ");
    int max = scanner.nextInt();

    UniversalRelayTeam team = new UniversalRelayTeam();

    System.out.print("What country is the team representing? ");
    String country = scanner.next();
    team = setCountry(team, country);

    for (int i=1; i<=4; i++) {
      System.out.print("What is the disability class for leg " + i +"? T ");
      int n = scanner.nextInt();
      team = setLeg(team, n, i);
    }

    System.out.println(getLegs(team));
    System.our.println(notLegalMessage(team));



  }
}
