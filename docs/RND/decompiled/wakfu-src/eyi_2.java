/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYI
 */
public class eyi_2 {
    private long aXv;
    private String p;
    private long mlq;
    private short bok;

    public eyi_2 rK(long l) {
        this.aXv = l;
        return this;
    }

    public eyi_2 sB(String string) {
        this.p = BH.b(string, 16);
        return this;
    }

    public eyi_2 rL(long l) {
        this.mlq = l;
        return this;
    }

    public eyi_2 ez(short s) {
        this.bok = s;
        return this;
    }

    public short bfE() {
        return this.bok;
    }

    public long Sn() {
        return this.aXv;
    }

    public fab fQj() {
        eyj_2 eyj_22 = new eyj_2(this.aXv);
        eyj_22.setName(this.p);
        eyj_22.rN(this.mlq);
        eyj_22.cX(this.bok);
        return eyj_22;
    }
}

