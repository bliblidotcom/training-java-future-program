public class Scoring{

  public static void main(String[] args) {
    if(args.length != 1){
      System.out.println("Usage :");
      System.out.println("javac <score(0-100)>");
      return;
    }

    int score = Integer.parseInt(args[0]);
    if(score > 100 || score < 0){
      System.out.println("Usage :");
      System.out.println("javac <score(0-100)>");
      return;
    }
    if(score > 85){
      System.out.println("A");
    }
    else if(score > 75){
      System.out.println("B");
    }
    else if(score > 65){
      System.out.println("C");
    }
    else if(score > 55){
      System.out.println("D");
    }
    else{
      System.out.println("E");
    }

  }

}
