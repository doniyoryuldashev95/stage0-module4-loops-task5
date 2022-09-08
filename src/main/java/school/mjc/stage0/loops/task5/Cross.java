package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if ((sideLength/2)+1==i){
                    System.out.print("8");
                } else if ((sideLength/2)+1==j){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
