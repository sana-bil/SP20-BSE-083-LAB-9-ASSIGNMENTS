public class ClockChild extends Clock{
    public ClockChild(int h, int m, int s){
        super(h,m,s);
    }

    @Override
    public void display() {
        if (getHours()>=1&&getHours()<=12){
            System.out.println(getHours()+ ":"+ getMinutes()+":"+ getSeconds()+ " AM");
        }
        else if (getHours()>=13&&getHours()<=24){
            System.out.println(getHours()+ ":"+ getMinutes()+":"+ getSeconds()+ " PM");
        }
    }
}
