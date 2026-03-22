/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wp
 */
public class wp_0
implements ayx_2 {
    private int o = 0;
    private String bNk = "<undefined>";
    private String bNl = "<undefined>";
    private boolean bNm = false;

    @Override
    public void aVI() {
        this.o = 0;
        this.bNk = "<undefined>";
        this.bNl = "<undefined>";
        this.bNm = false;
    }

    @Override
    public void aVH() {
    }

    public boolean blS() {
        return this.bNm;
    }

    public void bs(boolean bl) {
        this.bNm = bl;
    }

    public int d() {
        return this.o;
    }

    public String blT() {
        return this.bNk;
    }

    public void dD(String string) {
        this.bNk = string;
        this.o = this.bNk.hashCode();
    }

    public String blU() {
        return this.bNl;
    }

    public void dE(String string) {
        this.bNl = string;
    }
}

