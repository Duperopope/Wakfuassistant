/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdg
 */
public class bdg_1
implements adm_0 {
    protected static final Logger hKb = Logger.getLogger(bdg_1.class);
    protected static final boolean hKc = false;
    protected final bgy hKd;
    protected final int hKe;
    protected final int hKf;
    protected final int hKg;

    public bdg_1(bgy bgy2, int n, int n2, int n3) {
        this.hKd = bgy2;
        this.hKe = n;
        this.hKf = n2;
        this.hKg = n3;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        acd_1 acd_12 = this.hKd.eap();
        int n3 = this.hKf - acd_12.getX();
        int n4 = this.hKg - acd_12.getY();
        if (n3 != 0 || n4 != 0) {
            ads_02.a(acq_1.bp(n3, n4));
        }
        if (this.hKe < 0) {
            ads_02.dT("AnimStatique");
        } else {
            fqy_0 fqy_02 = fqz_0.giz().YY(this.hKe);
            if (fqy_02 != null) {
                bKV bKV2 = bLe.ecw().dQ(this.hKf, this.hKg);
                this.hKd.l(bKV2);
                blq_0.a(ads_02, fqy_02);
            }
        }
        ads_02.c(this);
    }
}

