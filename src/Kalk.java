public class Kalk {
    private String[] ip_bin;
    private String[] mask_bin;
    private int[] ip_dec;
    private int[] mask_dec;

    public Kalk(int[] ip_dec, int[] mask_dec) {
        this.ip_dec = ip_dec;
        this.mask_dec = mask_dec;
        for (int i=0;i < 4;i++) {
            while (ip_dec[i] >= 0) {
                if (ip_dec[i]%2 == 1) {
                    this.ip_bin
                }
            }
        }
    }
}