public class B extends A{
    int k;
    public B(int a, int b, int c){
        super(a, b);
        k=c;
    }

    @Override
    public void show() {
        System.out.println("k= "+ k);
    }
}
