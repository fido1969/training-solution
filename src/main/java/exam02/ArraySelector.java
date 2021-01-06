
package exam02;

public class ArraySelector {

    public String selectEvens0(int[] integerArray) {
        if (integerArray.length == 0) {
            return "";
        }
        String selectedItems = "[";
        for (int i = 0; i < integerArray.length; i++) {
            if (i % 2 == 0) {
                selectedItems += integerArray[i] + ", ";
            }
        }
        return selectedItems.substring(0, selectedItems.length() - 2) + "]";
    }



    public String selectEvens(int[] integerArray) {
        if (integerArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(integerArray[0]);

        for (int i = 1; i < integerArray.length; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(", ").append(integerArray[i]);
            }
        }
        return stringBuilder.append("]").toString();
    }
}