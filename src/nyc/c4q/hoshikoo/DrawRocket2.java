package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/14/15.
 */
public class DrawRocket2 {


    public static void drawLine(int size){
        String line ="+";

        for (int i=0; i<size; i++){
            line +="*=*=";
        }
        line +="+";
        System.out.println(line);
    }

    public static void head(int size) {
        String top = "**";
        String left = "/", right = "\\";
        for (int a = (size * 2 - 1); a>0; a--) {
            top = left + top + right;
            for (int b = a; b>0; b--) {
                System.out.print(" ");
            }
            System.out.println(top);
        }
    }

    public static void drawbody(int size){
        for (int i=0; i<size; i++) {
            String line = "|";

            for (int j = 0; j < size * 2; j++) {
                line += "/\\";
            }

            line += "|";
            System.out.println(line);
        }
    }

    public static void drawbodyTwo(int size){
        for (int i=0; i<size; i++) {
            String line = "|";

            for (int j = 0; j < size * 2; j++) {
                line += "\\/";
            }

            line += "|";
            System.out.println(line);
        }
    }

    public static void main (String[] args){
        int size=2;
        head(size);
        drawLine(size);
        drawbody(size);
        drawbodyTwo(size);
        drawLine(size);
        drawbodyTwo(size);
        drawbody(size);
        drawLine(size);
        head(size);
    }

}
