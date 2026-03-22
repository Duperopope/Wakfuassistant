/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acI
 */
public class aci_0 {
    final int chm;
    final int chn;
    final int cho;
    final int chp;

    public aci_0(int n, int n2, int n3, int n4) {
        this.chm = n * 18;
        this.chn = n2 * 18;
        this.cho = n3;
        this.chp = n4;
    }

    public final int v(int n, int n2, int n3) {
        return n - this.chm + (n2 - this.chn + n3 * this.chp) * this.cho;
    }
}

