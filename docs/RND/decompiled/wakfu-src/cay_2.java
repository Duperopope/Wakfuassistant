/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cay
 */
public class cay_2 {
    private final byte lGE;
    private final byte lGF;
    private acG[] chk;
    private final ArrayList<acG> lGG = new ArrayList(10);

    public cay_2(byte by, byte by2) {
        this.lGE = by;
        this.lGF = by2;
    }

    public cay_2(cay_2 cay_22) {
        this.lGE = cay_22.lGE;
        this.lGF = cay_22.lGF;
        for (acG acG2 : cay_22.lGG) {
            this.lGG.add(new acG(acG2));
        }
        this.chk = cay_22.chk;
    }

    public int ert() {
        return this.chk.length / (this.lGE * this.lGF);
    }

    public byte eru() {
        return this.lGE;
    }

    public byte bcN() {
        return this.lGF;
    }

    ArrayList<acG> erv() {
        return this.lGG;
    }

    acG ac(int n, int n2, int n3) {
        int n4 = n + (n2 + n3 * this.lGF) * this.lGE;
        return this.chk[n4];
    }

    public void r(apl_1 apl_12) {
        int n = this.lGE * this.lGF;
        this.chk = ach_0.a(this.lGG, n, apl_12);
    }
}

