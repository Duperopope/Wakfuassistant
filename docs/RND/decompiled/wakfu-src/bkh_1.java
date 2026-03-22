/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkh
 */
public class bkh_1
extends bka_1 {
    protected static final Logger iqn = Logger.getLogger(bkh_1.class);
    private final bhx_0 iqo;

    public bkh_1(bmv_2 bmv_22, bhx_0 bhx_02) {
        super(bmv_22);
        this.iqo = bhx_02;
    }

    @Override
    public short dsm() {
        return 6;
    }

    @Override
    public boolean dsn() {
        if (this.iqb == null) {
            iqn.error((Object)"Tried to check the validity of a null CollectAction");
            return false;
        }
        ang_2 ang_22 = this.iqb.bdo();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        assert (bgt_02 == this.iqd);
        if (this.iqd == null) {
            return false;
        }
        if (this.iqd.dkG()) {
            iqn.error((Object)"[COLLECT] Unable to collect resource in Haven World");
            return false;
        }
        eki_0 eki_02 = bgt_02.dpK();
        if (!eki_02.tX(this.iqb.cms()) || ang_22 != null && !ang_22.b(bgt_02, this.iqo, null, null)) {
            iqn.error((Object)("le joueur ne poss\u00e8de pas ce skill " + this.iqb.cms()));
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        super.bIH();
        iqn.info((Object)"On d\u00e9marre l'occupation de collecte d'un monstre");
        this.iqd.i(false, true);
        this.iqd.l(this.iqo.ddI());
        this.iqd.a(this);
        this.iqd.dcM().a(this.iqb, this.iqc);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqn.info((Object)("Annulation de la collecte d'un monstre, relai au serveur " + bl2));
        super.k(bl, bl2);
        bkc_2.dsD().clear();
        return true;
    }

    @Override
    public boolean dsd() {
        iqn.info((Object)"Fin de l'occupation de collecte d'un monstre");
        return super.dsd();
    }
}

