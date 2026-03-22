/*
 * Decompiled with CFR 0.152.
 */
public class abW
extends abb_0 {
    private asn_1 cfo;
    protected final asl_1 cfp;
    private final String cfq;
    private final String cfr;
    private boolean cfs;

    public abW(String string, String string2) {
        this(string, string2, new asl_1(new ase_1("gStrength", asf_1.cZr)));
    }

    public abW(String string, String string2, asl_1 asl_12) {
        this.cfp = asl_12;
        this.cfq = string;
        this.cfr = string2;
    }

    public void bY(boolean bl) {
        this.cfs = bl;
    }

    @Override
    public void bX(boolean bl) {
        super.bX(bl);
        if (bl) {
            if (this.cfo == null) {
                this.cfo = new asn_1(this.cfq, this.cfr, this.cfp);
                this.cfo.bY(this.cfs);
                ast_1.bJG().a(this.cfo);
            }
        } else if (this.cfo != null) {
            ast_1.bJG().b(this.cfo);
            this.cfo = null;
        }
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        this.cfp.c("gStrength", this.bnY());
    }

    @Override
    public void clear() {
    }

    @Override
    public void b(art_1 art_12) {
    }
}

