public class CommisionEmployee {
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;
    public CommisionEmployee()
    {
        FirstName="Nagina";
        LastName="Nazar";
        SSN="S003";
        grossSales=1234.1;
        commonRate=12.5;
    }
    public CommisionEmployee(String a,String e, String b, double c, double d){
        FirstName=a;
        LastName=e;
        SSN=b;
        grossSales=c;
        commonRate=d;
    }
    public void setFN(String a){
        FirstName=a;
    }
    public void setLN(String e){
        LastName=e;
    }
    public void setSSN(String b){
        SSN=b;
    }
    public void setGS(double c){
        grossSales=c;
    }
    public void setCR(double d){
        commonRate=d;
    }
    public String getFN(){
        return FirstName;
    }
    public String getSSN(){
        return SSN;
    }
    public double getGS(){
        return grossSales;
    }
    public double getCR(){
        return commonRate;
    }
    public double earnings() {
        return grossSales * commonRate;
    }
    public void display(){
        System.out.println("First Name: "+ FirstName + "\nLast Name "+ LastName + "\nSSN: "+ SSN + "\nGross Sale: "+ grossSales
        + "\nCommon Rate "+ commonRate);
    }
}
