/*
 * Decompiled with CFR 0.152.
 */
public class bgp {
    private final int iaf;
    private final byte iag;
    private final boolean iah;

    public bgp(int n, byte by, boolean bl) {
        this.iaf = n;
        this.iag = by;
        this.iah = bl;
    }

    public int d() {
        return this.iaf;
    }

    public byte djg() {
        return this.iag;
    }

    public boolean cak() {
        return this.iah;
    }

    public String toString() {
        return "ScenarioInputData{m_id=" + this.iaf + ", m_varId=" + this.iag + ", m_global=" + this.iah + "}";
    }
}

