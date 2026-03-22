/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from bki
 */
public class bki_1
extends bka_1 {
    protected static final Logger iqq = Logger.getLogger(bki_1.class);
    private final bKV iqr;
    private boolean iqs;
    private byte iqt;
    ZG iqu;

    public bki_1(bmv_2 bmv_22, bKV bKV2) {
        super(bmv_22);
        this.iqr = bKV2;
    }

    @Override
    public short dsm() {
        return 3;
    }

    @Override
    public boolean dsn() {
        if (this.iqb == null) {
            iqq.error((Object)"Tried to check the validity of a null CollectAction");
            return false;
        }
        if (this.iqd == null) {
            return false;
        }
        if (this.iqd.dkG()) {
            iqq.error((Object)"[COLLECT] Unable to collect resource in Haven World");
            return false;
        }
        eki_0 eki_02 = this.iqd.dpK();
        if (this.iqb.cms() != 0 && !eki_02.tX(this.iqb.cms())) {
            iqq.error((Object)("le joueur ne poss\u00e8de pas ce skill " + String.valueOf(this.iqb)));
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        this.U(0.0);
    }

    public void U(double d2) {
        super.bIH();
        if (this.iqd.dps() != this) {
            iqq.info((Object)("On d\u00e9marre l'occupation de collecte sur la ressource " + String.valueOf(this.iqr)));
            this.iqd.i(false, true);
            this.iqd.l(this.iqr);
            bmt_1 bmt_12 = (bmt_1)this.iqb.fyS();
            if (bmt_12.dwr()) {
                this.dsp();
            }
            this.iqd.a(this);
        } else {
            iqq.info((Object)("[COLLECT_DEBUG] On red\u00e9marre une occupation de collecte plut\u00f4t que de la mettre \u00e0 jour. " + adu_1.xg(6)));
        }
        this.V(d2);
    }

    private void dsp() {
        try {
            bmt_1 bmt_12 = (bmt_1)this.iqb.fyS();
            this.iqu = new ZG(aym_2.bSE(), this.iqr.bcC(), this.iqr.bcD(), this.iqr.bcE());
            if (this.dsr()) {
                this.iqu.k(String.format(auc_0.cVq().bS("ANMEquipmentPath"), "AnimHamecon"), true);
                Anm anm = arq_1.bHF().u(String.format(auc_0.cVq().bS("ANMEquipmentPath"), bmt_12.dws()), true);
                this.iqu.a(anm, "Accessoire".hashCode());
            } else {
                this.iqu.k(String.format(auc_0.cVq().bS("ANMEquipmentPath"), bmt_12.dws()), true);
            }
            this.iqu.qR(this.iqr.bpv() + 1);
            this.iqu.dP(String.valueOf(bmt_12.dws()));
            this.iqu.dT("AnimStatique-Debut");
            ZM.bqw().c(this.iqu);
        }
        catch (IOException iOException) {
            iqq.error((Object)"Impossible de charger le fichier d'animation", (Throwable)iOException);
        }
        catch (fu_0 fu_02) {
            iqq.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 pour le chargement d'animation", (Throwable)fu_02);
        }
    }

    private void dsq() {
        this.iqu.dT("AnimStatique-Fin");
        this.iqu.a(new bkj_1(this));
    }

    public void V(double d2) {
        this.iqd.dcM().a(this.iqr, this.iqb, this.iqc, this.iqt, this.iqs, d2);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqq.info((Object)("Annulation de la collecte, relai au serveur " + bl2));
        super.k(bl, bl2);
        if (this.iqu != null) {
            this.dsq();
        }
        bkc_2.dsD().clear();
        return true;
    }

    @Override
    public boolean dsd() {
        iqq.info((Object)"Fin de l'occupation de collecte");
        super.dsd();
        if (this.iqu != null) {
            this.dsq();
        }
        return true;
    }

    public void go(boolean bl) {
        this.iqs = bl;
    }

    public void br(byte by) {
        this.iqt = by;
    }

    private boolean dsr() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iqb.clf());
        if (fqy_02 == null) {
            return false;
        }
        return fqy_02.giu().contains("AnimMetier-Peche");
    }

    public bKV dss() {
        return this.iqr;
    }
}

