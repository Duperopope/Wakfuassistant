/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class cBy
extends cba_0<agu_1> {
    private boolean mxG = false;
    private agn_1 mxH;
    private int czq;

    @Override
    protected cba_0 eIs() {
        return new cBy();
    }

    @Override
    protected void b(cBt cBt2) {
        super.b(cBt2);
        cBy cBy2 = (cBy)cBt2;
        cBy2.mxG = this.mxG;
        cBy2.czq = this.czq;
        cBy2.mxH = this.mxH;
    }

    public agn_1 eIu() {
        return this.mxH;
    }

    @Override
    public void a(agn_1 agn_12) {
        this.mxH = agn_12;
    }

    public int bBw() {
        return this.czq;
    }

    public void sy(int n) {
        this.czq = n;
    }

    public boolean eIv() {
        return this.mxG;
    }

    public void jG(boolean bl) {
        this.mxG = bl;
    }

    @Override
    protected void c(cCz cCz2) {
        super.c(cCz2);
        cCz2.cDx = this.czq;
    }

    @Override
    protected ahk_1 t(long l, boolean bl) {
        agw_1 agw_12;
        agn_1 agn_12;
        ahz_1 ahz_12;
        if (!((agu_1)this.dPo).cbO()) {
            return null;
        }
        try {
            if (((agu_1)this.dPo).cbI() == null) {
                return null;
            }
            ahz_12 = ((agu_1)this.dPo).cbI().hE(l);
        }
        catch (IOException iOException) {
            return null;
        }
        if (ahz_12 == null) {
            return null;
        }
        if (this.mxG) {
            float f2 = GC.q(6, 9) * (GC.aNI() ? -1 : 1);
            float f3 = GC.q(6, 9) * (GC.aNI() ? -1 : 1);
            agn_12 = new aha_2(f2, f3, 0.0f, true, 0);
        } else {
            agn_12 = this.mxH;
            if (agn_12 == null) {
                mxI.error((Object)("On essaye de cr\u00e9er une source audio sans avoir d'ObservedSource dans le container " + this.getName() + " (" + this.d() + "). V\u00e9rifier le param\u00e9trage du container"));
                return null;
            }
        }
        agz_1 agz_12 = null;
        if (this.czq >= 0) {
            agz_12 = ((agu_1)this.dPo).cbH().yl(this.czq);
        }
        if (agz_12 == null) {
            agz_12 = agz_1.dNB;
        }
        if ((agw_12 = ((agu_1)this.dPo).a(ahz_12, 1.0f, 1.0f, agn_12, agz_12.bwI(), agz_12.bwF(), agz_12.bwH(), 0, 0, bl, false, false, 0.0f, l, -1L)) == null) {
            return null;
        }
        return agw_12.ccc();
    }
}

