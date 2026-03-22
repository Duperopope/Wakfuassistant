/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Kj
 */
public class kj_1 {
    private JI aLf;
    private int aLg;

    public JI aPr() {
        return this.aLf;
    }

    public void a(JI jI) {
        this.aLf = jI;
    }

    public int aPs() {
        return this.aLg;
    }

    public void ng(int n) {
        this.aLg = n;
    }

    public String toString() {
        return "EpsTagHeader{m_type=" + String.valueOf((Object)this.aLf) + ", m_length=" + this.aLg + "}";
    }
}

