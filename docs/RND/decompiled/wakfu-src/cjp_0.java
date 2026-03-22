/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cjP
 */
public class cjp_0
extends nv_0 {
    private final long lXq;
    private final Map<Integer, eKM> lXr = new HashMap<Integer, eKM>();

    public cjp_0(long l) {
        this.lXq = l;
    }

    public void et(int n, int n2) {
        if (this.lXr.containsKey(n)) {
            this.lXr.get(n).QU(n2);
            return;
        }
        eKM eKM2 = new eKM();
        eKM2.QU(n2);
        this.lXr.put(n, eKM2);
    }

    public void E(int n, boolean bl) {
        if (this.lXr.containsKey(n)) {
            this.lXr.get(n).lI(bl);
            return;
        }
        eKM eKM2 = new eKM();
        eKM2.lI(bl);
        this.lXr.put(n, eKM2);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lXq);
        this.lXr.forEach((n, eKM2) -> {
            azg_12.vC((int)n);
            azg_12.dH(eKM.a(eKM2));
        });
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13226;
    }
}

