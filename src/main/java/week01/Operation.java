package week01;

public class Operation {

    private int left;
    private int right;

    public Operation(String str) {
        left = Integer.parseInt((str.substring(0, str.indexOf("+"))));
        right = Integer.parseInt(str.substring(str.indexOf("+") + 1));
    }
    // metódust megnézni (ctr + click)   visszatérni-->(Alt + <- nyíl)
    public int getResult() {
        return left + right;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("123+45");
        System.out.println(operation.getResult());
    }
}
