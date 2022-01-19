package java0119;

public class taxi implements  meter{
    int distance;

    public taxi(int distance) {
        this.distance = distance;
    }

    @Override
    public void start() {
        System.out.println("출발!");
    }

    @Override
    public int stop() {
        return distance*2;
    }

    public static void main(String[] args) {
        taxi p1 = new taxi(50);
        System.out.println("요금 : " + p1.stop());
    }
}


