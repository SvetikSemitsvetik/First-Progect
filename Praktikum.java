public class Practicum {
    public Double calculate (Double first, Integer second, String operation){
        switch (operation){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return Double.valueOf(first) / Double.valueOf(second);
            default:
                System.out.println("����� ������� �� ��������������!");
                return Double.valueOf(-1);

        }



    }




}
