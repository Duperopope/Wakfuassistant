/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGN
 */
public class bgn_1 {
    private static final bgn_1 jWv = new bgn_1();
    private final Runnable jWw = this::dUn;
    private final Map<Integer, long[]> jWx = new HashMap<Integer, long[]>();

    public static bgn_1 dUk() {
        return jWv;
    }

    private bgn_1() {
    }

    public void x(Map<Integer, long[]> map) {
        this.jWx.putAll(map);
    }

    @Nullable
    public Long GC(int n) {
        return this.dG(n, 0);
    }

    public long a(bgv_2 bgv_22, long l) {
        Long l2 = this.dG(bgv_22.d(), 0);
        return l2 != null && l2 > 0L ? l2 : l;
    }

    @Nullable
    public Long bc(ffV ffV2) {
        return this.dG(ffV2.avr(), ffV2.fVX());
    }

    public long a(ffV ffV2, long l) {
        Long l2 = this.dG(ffV2.avr(), ffV2.fVX());
        return l2 != null && l2 > 0L ? l2 : l;
    }

    @Nullable
    public Long dG(int n, int n2) {
        long[] lArray = this.jWx.get(n);
        if (lArray == null || n2 >= lArray.length) {
            return null;
        }
        return lArray[n2];
    }

    public void dUl() {
        this.jWx.clear();
        abg_2.bUP().h(this.jWw);
    }

    public void dUm() {
        if (this.jWx.isEmpty()) {
            this.dUn();
            abg_2.bUP().h(this.jWw);
            abg_2.bUP().a(this.jWw, fiw_0.suj, 1);
        }
    }

    private void dUn() {
        if (!aue_0.cVJ().etp()) {
            return;
        }
        if (this.jWx.isEmpty()) {
            aue_0.cVJ().etu().d(new cym());
        }
    }
}

