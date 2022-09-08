package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        int height = 5;
        StringBuilder s;
        for (int i = 0; i < height; i++) {
            int m = (height/2 > i)? i:height-i-1;
            s = new StringBuilder();
            for (int j = 1; j <= m; j++) {
                s.append(" ");
            }
            for (int j = 1; j <= height-2*m; j++) {
                s.append("8");
            }
            for (int j = 1; j <= m; j++) {
                s.append(" ");
            }
            System.out.println(s);
        }
    }
    public void printHourglassOfGivenSize(int height) {
        StringBuilder s;
        for (int i = 0; i < height; i++) {
            int m = (height/2 > i)? i:height-i-1;
            s = new StringBuilder();
            for (int j = 1; j <= m; j++) {
                s.append(" ");
            }
            for (int j = 1; j <= height-2*m; j++) {
                s.append("8");
            }
            for (int j = 1; j <= m; j++) {
                s.append(" ");
            }
            System.out.println(s);
        }
    }
}
