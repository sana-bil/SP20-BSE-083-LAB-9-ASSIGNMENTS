import java.util.StringTokenizer;
public class StringTokenizerDemo {
    private String s;
    static int tokenCount=0;
    public StringTokenizerDemo(){

    }
    public StringTokenizerDemo(String s){
        this.s=s;
    }
    public int countTokens(String s){
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                tokenCount--;
            }
            else if (s.charAt(i)==' '){
                tokenCount--;
            }
            else tokenCount++;
        }
        return tokenCount;
    }
}
