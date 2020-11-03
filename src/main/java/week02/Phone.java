package week02;

import javax.sound.midi.Soundbank;

public class Phone {
    private String type;
    private int meme;

    public Phone(String type, int meme) {
        this.type = type;
        this.meme = meme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMeme() {
        return meme;
    }

    public void setMeme(int meme) {
        this.meme = meme;
    }

    public static void main(String[] args) {

        Phone phone1=new Phone("Android",2);
        Phone phone2=new Phone("Apple",4);
    }
}
