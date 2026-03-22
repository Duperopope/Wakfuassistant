/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from bnt
 */
public class bnt_2 {
    private static final bnt_2 iHN = new bnt_2();
    private final HashMap<Long, bnv_2> iHO = new HashMap();

    public static bnt_2 dyI() {
        return iHN;
    }

    public bnv_2 kf(long l) {
        return this.iHO.get(l);
    }

    public void eX(long l) {
        this.iHO.remove(l);
    }

    public void c(bnv_2 bnv_22) {
        this.iHO.put(bnv_22.Xi(), bnv_22);
    }
}

