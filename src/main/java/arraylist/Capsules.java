package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String > capsulesColours = new ArrayList<>();

    public void addLast(String capsulesColour){
        capsulesColours.add(capsulesColour);
    }

    public void addFirst(String capsulesColour){
        capsulesColours.add(0,capsulesColour);
    }

    public List<String >getCapsulesColours(){
        return capsulesColours;
    }

    public void removeFirst(){
        capsulesColours.remove(0);
    }

    public void removeLast(){
        capsulesColours.remove(capsulesColours.size()-1);
    }

    public int listSize(){
        return capsulesColours.size();
    }

    public List<String> listCopy(List<String>capsulesColours) {
        List<String> newCapsulesColours = new ArrayList<>();
        for (int i = 0; i < capsulesColours.size(); i++) {
            newCapsulesColours.add(capsulesColours.get(i));
        }
        return newCapsulesColours;
    }


    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addLast("blue");
        capsules.addFirst("red");
        capsules.addFirst("green");
        capsules.addFirst("red");

        System.out.println(capsules.getCapsulesColours());
        System.out.println(capsules.listSize());
        capsules.removeFirst();
        System.out.println(capsules.getCapsulesColours());
        System.out.println(capsules.listSize());
        capsules.removeLast();
        System.out.println(capsules.getCapsulesColours());
        System.out.println(capsules.listSize());

        List<String > clearList = new ArrayList<>();
        clearList=capsules.getCapsulesColours();
        clearList.clear();
        System.out.println(capsules.getCapsulesColours());
        System.out.println(clearList);
    }

}

