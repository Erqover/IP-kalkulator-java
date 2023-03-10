import java.util.ArrayList;
import java.util.List;

public class Kalk {
    private List<String> ip_bin = new ArrayList<>();
    private List<String> mask_bin = new ArrayList<>();
    private List<Integer> ip_dec = new ArrayList<>();
    private List<Integer> mask_dec = new ArrayList<>();

    public Kalk(List<Integer> ip_dec, List<Integer> mask_dec) {
        this.ip_dec = ip_dec;
        this.mask_dec = mask_dec;
        String temp = "";
        for (int i=0;i<4;i++) {
            while (ip_dec.get(i) >= 0) {
                if (ip_dec.get(i) % 2 == 1) {
                    temp.concat("1");
                }
                else {
                    temp.concat("0");
                }
            }
            ip_bin.set(i, temp);
        }
    }

    public void outtest() {
        System.out.println(ip_dec.toString());
        System.out.println(mask_dec.toString());
    }
}