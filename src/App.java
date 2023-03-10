import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> j1 = new  ArrayList<>(){{
            add(192);
            add(168);
            add(1);
            add(1);
        }};
        List<Integer> j2 = new  ArrayList<>(){{
            add(255);
            add(255);
            add(255);
            add(0);
        }};
        
        Kalk prog = new Kalk(j1, j2);
        prog.outtest();
    }
}
