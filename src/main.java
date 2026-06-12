public class main {
    public static void main(String[] args){
        BinaryOctalConverter2 window = new BinaryOctalConverter2();
        WindowDestroyer MyListener = new WindowDestroyer();
        window.addWindowListener(MyListener);
        window.setVisible(true);
    }
}
