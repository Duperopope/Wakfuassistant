/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcG
 */
public class dcg_0
extends dae_0 {
    private int jdu;
    private String cxT;
    private String jbB;
    private String keP;
    private int bIi;

    public dcg_0(String string, String string2, String string3, int n, int n2) {
        this(string, string2, string3, n);
        this.jdu = n2;
    }

    public dcg_0(String string, String string2, String string3, int n) {
        this.cxT = string;
        this.jbB = string2;
        this.keP = string3;
        this.bIi = n;
    }

    public String bAD() {
        return this.cxT;
    }

    public void eQ(String string) {
        this.cxT = string;
    }

    public String eGm() {
        return this.jbB;
    }

    public void oA(String string) {
        this.jbB = string;
    }

    public String dXz() {
        return this.keP;
    }

    public void rj(String string) {
        this.keP = string;
    }

    public int aeV() {
        return this.bIi;
    }

    public void tC(int n) {
        this.bIi = n;
    }

    public int egI() {
        return this.jdu;
    }

    @Override
    public int d() {
        return 19389;
    }
}

