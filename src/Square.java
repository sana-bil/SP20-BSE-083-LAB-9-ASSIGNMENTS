public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("         SQUARE      ");
        System.out.println();
        for (int i=0; i<7; i++){
            System.out.print("*");
        }
        for (int i=0; i<7; i++){
            System.out.println("*      *");
        }
        for (int i=0; i<7; i++){
            System.out.print("*");
        }


    }
}
