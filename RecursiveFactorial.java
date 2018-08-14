public class RecursiveFactorial{


  private int factorial(int num){
    if(num == 0)return 1;
    return num * factorial(num-1);
  }

  public static void main(String[] args) {
    if(args.length != 1){
      System.out.println("Usage :");
      System.out.println("javac RecursiveFactorial <number>");
      return;
    }
    int number = Integer.parseInt(args[0]);

    System.out.println("hasil: "+new RecursiveFactorial().factorial(number));

  }

}
