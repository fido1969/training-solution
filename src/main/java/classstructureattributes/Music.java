package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Song mySong=new Song();

        System.out.println("Who is you favourite band?");
        mySong.band=scanner.nextLine();
        System.out.println("What is the title of your favourite song?");
        mySong.title=scanner.nextLine();
        System.out.println("How long it is?");
        mySong.length=scanner.nextInt();

        System.out.println(mySong.band+" - "+mySong.title+" ("+mySong.length+" perc)"+"!");
    }
}
