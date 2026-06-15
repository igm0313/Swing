

public class main {
    public static void main(String[] args){
        int n = 1;
        assert n == 1;
        n *= 2;
        assert n<1 : "n은 1보다 큽니다";
    }
}
