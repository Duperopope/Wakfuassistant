/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcc
 */
public final class bcc_1
implements PP {
    private final int hDl;
    private final bcc_1 hDm;
    private final String hDn;
    private final String hDo;
    private ArrayList<bcc_1> aXA;
    private ArrayList<bbu_2> hDp;

    bcc_1(int n, bcc_1 bcc_12, String string, String string2) {
        this.hDl = n;
        this.hDo = string != null ? string.intern() : null;
        this.hDm = bcc_12;
        this.hDn = string2;
    }

    @Override
    public int d() {
        return this.hDl;
    }

    public String getName() {
        return this.hDo;
    }

    public bcc_1 daD() {
        return this.hDm;
    }

    public ArrayList<bcc_1> getChildren() {
        return this.aXA;
    }

    public ArrayList<bbu_2> aYz() {
        return this.hDp;
    }

    void a(bcc_1 bcc_12) {
        if (this.aXA == null) {
            this.aXA = new ArrayList();
        }
        if (!this.aXA.contains(bcc_12)) {
            this.aXA.add(bcc_12);
        }
    }

    void e(bbu_2 bbu_22) {
        if (this.hDp == null) {
            this.hDp = new ArrayList();
        }
        if (!this.hDp.contains(bbu_22)) {
            this.hDp.add(bbu_22);
        }
    }

    public boolean AQ(int n) {
        if (n == this.hDl) {
            return true;
        }
        return this.hDm != null && this.hDm.AQ(n);
    }

    @Override
    public /* synthetic */ PP aYy() {
        return this.daD();
    }
}

