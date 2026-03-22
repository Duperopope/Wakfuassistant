/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkk
 */
public class bkk_1
extends bkb_0 {
    protected static final Logger iqw = Logger.getLogger(bkk_1.class);
    private final bDs iqx;
    private final eKR iqy;
    private final long iqz;
    private static final Runnable iqA = new bkl_1();

    public bkk_1(bDs bDs2, eKR eKR2, long l) {
        this.iqx = bDs2;
        this.iqy = eKR2;
        this.iqz = l;
    }

    @Override
    public short dsm() {
        return 8;
    }

    @Override
    public boolean dsn() {
        if (this.iqd.doP() || this.iqd.djT()) {
            iqw.warn((Object)("Le joueur " + String.valueOf(this.iqd) + " est mort ou en combat et ne peut utiliser de machine de craft"));
            return false;
        }
        if (!this.iqx.i(this.iqy.d(), this.iqy.aFW())) {
            iqw.warn((Object)("Le joueur " + String.valueOf(this.iqd) + " essaye d'utiliser la recette " + String.valueOf(this.iqy) + " du m\u00e9tier " + this.iqx.cms() + " sur la machine " + String.valueOf(this.iqx) + " alors qu'elle n'est pas autoris\u00e9e"));
            return false;
        }
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iqx.clf());
        if (!this.a(fqy_02)) {
            iqw.warn((Object)("Le joueur " + String.valueOf(this.iqd) + " essaye d'utiliser la recette " + String.valueOf(this.iqy) + " du m\u00e9tier " + this.iqx.cms() + " sur la machine " + String.valueOf(this.iqx) + " alors qu'il n'a pas l'objet requis dans le visuel"));
            return false;
        }
        if (!this.iqd.b(this.iqy)) {
            iqw.warn((Object)("Le joueur " + String.valueOf(this.iqd) + " essaye d'utiliser la recette " + String.valueOf(this.iqy) + " du m\u00e9tier " + this.iqx.cms() + " sur la machine " + String.valueOf(this.iqx) + " alors qu'il n'a pas les ingr\u00e9dients"));
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        iqw.info((Object)("[CRAFTOCC] Craft START id=" + this.iqx.cms()));
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iqx.clf());
        this.iqd.ddI().t(fqy_02.clf(), true);
        ctg_1.eQG().oo(this.iqz);
        abg_2.bUP().a(iqA, this.iqz, 1);
    }

    @Override
    public boolean dsd() {
        iqw.info((Object)("[CRAFTOCC] Craft FINISHED id=" + this.iqx.cms()));
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)2);
        cmo_02.cD((short)8);
        aue_0.cVJ().etu().d(cmo_02);
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iqx.clf());
        this.iqd.ddI().t(fqy_02.clf(), false);
        return true;
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqw.info((Object)"[CRAFTOCC] Craft CANCELED");
        abg_2.bUP().h(iqA);
        if (this.iqx == null) {
            return true;
        }
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iqx.clf());
        if (fqy_02 == null) {
            return true;
        }
        this.iqd.ddI().t(fqy_02.clf(), false);
        ctg_1.eQG().eQP();
        if (bl2) {
            this.dst();
        }
        return true;
    }

    public void dst() {
        iqw.info((Object)"[CRAFTOCC] Craft CANCEL request");
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)3);
        cmo_02.cD((short)8);
        aue_0.cVJ().etu().d(cmo_02);
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

