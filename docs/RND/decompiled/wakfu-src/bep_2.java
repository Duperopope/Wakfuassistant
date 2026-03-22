/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beP
 */
public class bep_2
extends ehw_0 {
    private final int hOg;

    public bep_2(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.hOg = n4;
    }

    public bep_2(int n, int n2, int n3) {
        super(n, n2);
        this.hOg = n3;
    }

    public int aVt() {
        return this.hOg;
    }

    @Override
    public String toString() {
        return "ClientAptitudeBonusModel{m_gfxId=" + this.hOg + "}";
    }
}

