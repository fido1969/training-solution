//Írj egy Operation osztályt, mely konstruktorban kap egy összeadást, pl. 68+12! A getResult() metódus
// visszaadja a művelet eredményét. Egy belső leftOperand és rightOperand attribútumba dolgozz!
package week01;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String str) {
        leftOperand = Integer.parseInt((str.substring(0, str.indexOf("+"))));
        rightOperand = Integer.parseInt(str.substring(str.indexOf("+") + 1));
    }
    // metódust megnézni (ctr + click)   visszatérni-->(Alt + <- nyíl)
    public int getResult() {
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("123+45");
        System.out.println(operation.getResult());

    }
}
