public class MiniDesafio2 {
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci(){
        int a = 1;
        int b = 0;
        int c;
    for(int i = 0; i < 50; i++){
        System.out.println(a);
        c = a;
        a = a + b;
        b = c;
    }
    }
}
