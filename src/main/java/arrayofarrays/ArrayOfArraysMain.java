package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {

        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(4));
        System.out.println();
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(4));
        System.out.println();
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
        System.out.println();
        arrayOfArraysMain.printArrayOfArraysString(arrayOfArraysMain.spaceArray(3));


      /*  for (int i = 0; i < arrayOfArraysMain.multiplicationTable(4).length; i++) {
            for (int j = 0; j < arrayOfArraysMain.multiplicationTable(4)[i].length; j++) {
                System.out.print(arrayOfArraysMain.multiplicationTable(4)[i][j] + " ");
            }
            System.out.println();
        }*/

    }

    public int[][] multiplicationTable(int size) {

        int[][] multiplicationArray = new int[size][size];
        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationArray;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {
        int[][] triangularMatrix = new int[size][];
        for (int i = 0; i < triangularMatrix.length; i++) {
            triangularMatrix[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangularMatrix[i][j] = i;
            }
        }
        return triangularMatrix;
    }

    public int[][] getValues() {
        int[][] values = new int[12][];
        int[] numberOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < numberOfDays.length; i++) {
            values[i] = new int[numberOfDays[i]];
        }
        return values;
    }
    String[][] spaceArray(int size) {
        String[][] spaceArrayString = new String[size][size];
        int[][] spaceArrayInt = new int[size][size];
        for (int i = 0; i < spaceArrayInt.length; i++) {
            for (int j = 0; j < spaceArrayInt[i].length; j++) {
                spaceArrayInt[i][j] = (j + 1) * (int) (Math.pow(10, i));
                if (spaceArrayInt[i][j]<10){
                    spaceArrayString[i][j]="  "+spaceArrayInt[i][j]+" ";
                }else if ((spaceArrayInt[i][j]>=10) && (spaceArrayInt[i][j]<=99)){
                    spaceArrayString[i][j]=" "+spaceArrayInt[i][j]+" ";
                }else if ((spaceArrayInt[i][j]>=100) && (spaceArrayInt[i][j]<=999)){
                    spaceArrayString[i][j]=""+spaceArrayInt[i][j]+" ";
                }
            }
        }
        return spaceArrayString;
    }
    public void printArrayOfArraysString(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


}
