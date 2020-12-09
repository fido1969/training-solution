package week07d03;

import java.util.Arrays;
import java.util.List;

public class NumberList {
//Junior/ Mid-level csoport mai feladat:
//A week07d03 csomagban hozz létre egy NumberList osztályt. Ennek legyen egy metódusa isIncreasing(List<Integer>)
// mely egy számokból álló listát vár paraméterül és megnézi, hogy a listában a számok növekvő sorrendben
// szerepelnek-e és ennek megfelelően igaz vagy hamis értékkel tér vissza. Speciális eset ha
// két egymást követő szám egyenlő, ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük.

    public boolean isIncreasing(List<Integer>integerList){

        int min=integerList.get(0);

        for (int i=1;i<integerList.size();i++){
            if (integerList.get(i)>=min){
                min=integerList.get(i);
            }else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        List<Integer> integers = Arrays.asList(1,5,7,2,5,1);
        System.out.println( numberList.isIncreasing(integers));;
    }
}
