package iterfaceExam.iExam2;
class Entry {
    String word;

    public Entry(String w) {
        this.word = w;
    }

    public void writeView() {
        System.out.println("약어 : " + this.word);
    }
}

class SubEntry extends Entry {
    String definition;
    int year;

    public SubEntry(String w, String d, int y) {
        super(w);
        this.definition = d;
        this.year = y;
    }

    public void printView() {
        System.out.println("원어 : " + this.definition);
        System.out.println("시기 : " + this.year);
    }
}

public class Test37 {

    public static void main(String[] args) {
        SubEntry class1 = new SubEntry("OOP","Object Oriented Programming", 1991);

        class1.printView();
        class1.writeView();

    }
}
