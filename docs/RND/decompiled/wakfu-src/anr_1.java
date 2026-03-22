/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anr
 */
public abstract class anr_1
implements anc_1 {
    protected final String cKk;
    protected final amr_2 cKl;
    protected int cKh;

    public anr_1(String string) {
        this.cKk = string;
        this.cKl = amr_2.cIc;
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
    public amr_2 bDM() {
        return this.cKl;
    }

    @Override
    public String bDO() {
        return this.cKk;
    }

    @Override
    public boolean bDl() {
        return true;
    }

    public abstract Object E(Object var1);

    public abstract anc_1 F(Object var1);
}

