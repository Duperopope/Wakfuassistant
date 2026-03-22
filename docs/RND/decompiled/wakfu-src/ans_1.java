/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ans
 */
public abstract class ans_1
implements anc_1 {
    protected final String cKm;
    protected final amr_2 cKn;
    protected int cKh;

    public ans_1(String string) {
        this.cKm = string;
        this.cKn = amr_2.cIb;
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
        return this.cKn;
    }

    @Override
    public String bDO() {
        return this.cKm;
    }

    @Override
    public boolean bDl() {
        return true;
    }

    public abstract Object b(Object var1, Object var2);

    public abstract anc_1 c(Object var1, Object var2);
}

