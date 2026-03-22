/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from anq
 */
public abstract class anq_1
implements anc_1 {
    protected final String cKf;
    protected final amr_2 cKg;
    protected int cKh;
    protected final boolean cKi;
    protected final ArrayList<amq_1> cKj;

    public anq_1(String string) {
        this.cKf = string;
        this.cKg = amr_2.cId;
        this.cKj = new ArrayList();
        this.cKi = true;
    }

    @Override
    public amr_2 bDM() {
        return this.cKg;
    }

    @Override
    public void ti(int n) {
        this.cKh = n;
    }

    @Override
    public int bDN() {
        return this.cKh;
    }

    @Override
    public String bDO() {
        return this.cKf;
    }

    public void e(amq_1 amq_12) {
        this.cKj.add(amq_12);
    }

    public ArrayList<amq_1> bDP() {
        return this.cKj;
    }

    @Override
    public boolean bDl() {
        if (this.cKj.size() != 0) {
            for (amq_1 amq_12 : this.cKj) {
                if (amq_12.aJG() || !amq_12.bDl()) continue;
                return true;
            }
        }
        return this.cKi;
    }

    public abstract Object c(Object var1, Object var2, Object var3, Object var4);

    public anc_1 bDQ() {
        return this;
    }
}

