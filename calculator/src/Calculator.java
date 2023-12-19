import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String[] action = {"+", "-", "/", "*"};
        String[] regexAction = {"\\+", "-", "/", "\\*"};
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression;
        expression = enter.nextLine();
        int actionIndex=-1;
        for (int i = 0; i < action.length; i++) {
            if(expression.contains(action[i])){
                actionIndex = i;
                break;
            }
        }
        if(actionIndex==-1){
            System.out.println("Неверное выражение!");
            return;
        }


        String[] data = expression.split(regexAction[actionIndex]);
            int first = Integer.parseInt(data[0]),second = Integer.parseInt(data[1]);

            int result;
            switch (action[actionIndex]){
                case "+":
                    result = first+second;
                    break;
                case "-":
                    result = first-second;
                    break;
                case "*":
                    result = first*second;
                    break;
                default:
                    result = first/second;
                    break;
            }

                System.out.println(result);
            }

        }




