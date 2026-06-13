public class main {
    public static void main(String[] args){
        BinaryOctalConverter3 window = new BinaryOctalConverter3();
        WindowDestroyer MyListener = new WindowDestroyer();
        window.addWindowListener(MyListener);
        window.setVisible(true);
    }
}
