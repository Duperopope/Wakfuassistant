/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class bGN {
    private static final bGN jWv = new bGN();
    private final Runnable jWw = this::dUn;
    private final Map<Integer, long[]> jWx = new HashMap<Integer, long[]>();

    public static bGN dUk() {
        return jWv;
    }

    private bGN() {
    }

    public void x(Map<Integer, long[]> map) {
        this.jWx.putAll(map);
    }

    @Nullable
    public Long GC(int n) {
        return this.dG(n, 0);
    }

    public long a(bGV bGV2, long l) {
        Long l2 = this.dG(bGV2.d(), 0);
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
        aBg.bUP().h(this.jWw);
    }

    public void dUm() {
        if (this.jWx.isEmpty()) {
            this.dUn();
            aBg.bUP().h(this.jWw);
            aBg.bUP().a(this.jWw, fiW.suj, 1);
        }
    }

    private void dUn() {
        if (!aUE.cVJ().etp()) {
            return;
        }
        if (this.jWx.isEmpty()) {
            aUE.cVJ().etu().d(new cym());
        }
    }
}
