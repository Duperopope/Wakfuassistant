/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from baM
 */
public class bam_0
implements aeh_2 {
    public static final String hzm = "name";
    public static final String hzn = "rewards";
    public static final String hzo = "description";
    public static final String[] hzp = new String[]{"name", "rewards", "description"};
    private final String hzq;
    private final String hzr;
    private final ArrayList<bgv_2> hzs = new ArrayList();

    public bam_0(String string, String string2, int[] nArray) {
        this.hzq = string;
        this.hzr = string2;
        for (int n : nArray) {
            this.hzs.add((bgv_2)bEm.dSb().Vd(n));
        }
    }

    @Override
    public String[] bxk() {
        return hzp;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hzm)) {
            return this.hzq;
        }
        if (string.equals(hzn)) {
            return this.hzs.size() > 0 ? this.hzs : null;
        }
        if (string.equals(hzo)) {
            return this.hzr;
        }
        return null;
    }
}

