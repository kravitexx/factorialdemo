public class Factorial {
public static void main(String[] args) {
int num = (args.length == 0) ? 5 : Integer.parseInt(args[0]); //
Default to 5 if no input
long factorial = 1;
for (int i = 1; i <= num; i++) {
factorial *= i;
}
System.out.printf("Factorial of %d is: %d", num, factorial);
}
}
