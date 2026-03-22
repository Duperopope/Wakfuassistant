/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eSv
 */
public final class esv_0 {
    private boolean rkr = false;
    private final List<acd_1> rks = new ArrayList<acd_1>();
    private int rkt = 0;
    private int rdJ = 0;
    private rj_0 rdM = null;

    public void mq(boolean bl) {
        this.rkr = bl;
    }

    public boolean fIc() {
        return this.rkr;
    }

    public acd_1 fEt() {
        if (this.rks.isEmpty()) {
            return null;
        }
        return this.rks.get(this.rks.size() - 1);
    }

    public List<acd_1> fId() {
        return this.rks;
    }

    public void ao(int n, int n2, short s) {
        this.rks.add(new acd_1(n, n2, s));
    }

    public void Sm(int n) {
        this.rkt = n;
    }

    public int fIe() {
        return this.rkt;
    }

    public void Sn(int n) {
        this.rdJ = n;
    }

    public int fEu() {
        return this.rdJ;
    }

    public void l(rj_0 rj_02) {
        this.rdM = rj_02;
    }

    public rj_0 fIb() {
        return this.rdM;
    }
}

