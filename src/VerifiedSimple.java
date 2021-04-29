public class VerifiedSimple extends Simple{
    public VerifiedSimple(int num1, int num2){
        super(num1,num2);
    }

    @Override
    public void add() {
        if (num1>0&&num2>0){
            super.add();
        }
        else{
            System.out.println("invalid numbers for addition");
        }
    }

    @Override
    public void sub() {
        if (num1>0&&num2>0){
            super.sub();
        }
        else System.out.println("invalid numbers for subtraction");
    }

    @Override
    public void mul() {
        if (num1>0&&num2>0){
            super.mul();
        }
        else System.out.println("invalid numbers for multiplications");
    }

    @Override
    public void div() {
        if (num1>0&&num2>0){
            super.div();
        }
        else System.out.println("invalid numbers for division ");
    }
    }

