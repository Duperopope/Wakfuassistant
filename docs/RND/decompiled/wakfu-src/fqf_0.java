/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqf
 */
public final class fqf_0 {
    private final short sSa;
    private int sSb;
    private int sSc;
    private short sSd;
    private byte krf;
    private boolean krg;
    private boolean sSe;

    public fqf_0(short s) {
        this.sSa = s;
    }

    public fqf_0(short s, int n, int n2, short s2, byte by, boolean bl, boolean bl2) {
        this.sSa = s;
        this.sSb = n;
        this.sSc = n2;
        this.sSd = s2;
        this.krf = by;
        this.krg = bl;
        this.sSe = bl2;
    }

    public short ghK() {
        return this.sSa;
    }

    public int ghL() {
        return this.sSb;
    }

    public int ghM() {
        return this.sSc;
    }

    public short ghN() {
        return this.sSd;
    }

    public byte ecj() {
        return this.krf;
    }

    public boolean eck() {
        return this.krg;
    }

    public boolean ghO() {
        return this.sSe;
    }

    int af(short s, short s2) {
        int n = this.sSb - s * 18;
        int n2 = this.sSc - s2 * 18;
        if (n < 0 || n >= 18) {
            throw new RuntimeException("relativeX invalide: " + n + ", " + String.valueOf(this));
        }
        if (n2 < 0 || n2 >= 18) {
            throw new RuntimeException("relativeY invalide: " + n2 + ", " + String.valueOf(this));
        }
        int n3 = n * 18 + n2;
        assert ((n3 & 0x1FF) == n3) : "relativeXY invalide: " + n3;
        int n4 = this.sSd & 0xFFFF;
        int n5 = this.krf & 0x1F;
        if ((this.krf & 0x1F) != this.krf) {
            throw new RuntimeException("EvolutionStep trop grand: " + this.krf + ", " + String.valueOf(this));
        }
        int n6 = this.krg ? 1 : 0;
        int n7 = this.sSe ? 1 : 0;
        return n7 << 31 | n6 << 30 | n5 << 25 | n4 << 9 | n3;
    }

    void c(int n, short s, short s2) {
        int n2 = n & 0x1FF;
        this.sSb = s * 18 + n2 / 18;
        this.sSc = s2 * 18 + n2 % 18;
        this.sSd = (short)(n >>> 9 & 0xFFFF);
        this.krf = (byte)(n >>> 25 & 0x1F);
        this.krg = (n >>> 30 & 1) == 1;
        this.sSe = n >>> 31 == 1;
    }

    public String toString() {
        return "ResourceInfo{m_refId=" + this.sSa + ", m_resourceX=" + this.sSb + ", m_resourceY=" + this.sSc + ", m_resourceZ=" + this.sSd + ", m_evolutionStep=" + this.krf + ", m_autoRespawn=" + this.krg + ", m_justGrowth=" + this.sSe + "}";
    }
}

