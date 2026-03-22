/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class buH {
    public static final int[] jqw = new int[]{255, 255, 255, 106, 106, 106, 255, 128, 128, 255, 0, 0, 255, 128, 192, 255, 0, 128, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128, 255, 128, 128, 255, 0, 0, 255, 0, 128, 255, 128, 192, 255, 128, 255, 255, 0, 255, 255, 0, 255, 128, 128, 255, 192, 128, 255, 128, 0, 255, 0, 128, 255, 0, 192, 255, 128, 255, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128};
    private static final buH jqx = new buH();
    private final ArrayList<axb_2> jqy = new ArrayList();

    private buH() {
        int n = jqw.length / 3;
        for (int i = 0; i < n; ++i) {
            awx_2 awx_22 = new awx_2(jqw[i * 3], jqw[i * 3 + 1], jqw[i * 3 + 2], 255);
            this.jqy.add(awx_22);
            for (float f2 = 0.8f; f2 >= 0.4f; f2 -= 0.2f) {
                awx_2 awx_23 = new awx_2(awx_22);
                awx_23.S(awx_23.bQi() * f2);
                this.jqy.add(awx_23);
            }
        }
    }

    public static buH dJn() {
        return jqx;
    }

    public int bQN() {
        return this.jqy.size();
    }

    public short j(axb_2 axb_22) {
        return (short)this.jqy.indexOf(axb_22);
    }

    public axb_2 Fz(int n) {
        return this.jqy.get(n);
    }

    public ArrayList<axb_2> dJo() {
        return this.jqy;
    }
}

