/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ant
 */
public abstract class ant_2
implements anc_1 {
    protected final String cKo;
    protected amr_2 cKg;
    protected int cKh;
    protected final boolean cKp;

    public ant_2(String string) {
        this.cKo = string;
        this.cKp = false;
    }

    @Override
    public amr_2 bDM() {
        return this.cKg;
    }

    @Override
    public int bDN() {
        return this.cKh;
    }

    @Override
    public void ti(int n) {
        this.cKh = n;
    }

    @Override
    public String bDO() {
        return this.cKo;
    }

    @Override
    public boolean bDl() {
        return this.cKp;
    }

    @Override
    public abstract Object getValue();
}

