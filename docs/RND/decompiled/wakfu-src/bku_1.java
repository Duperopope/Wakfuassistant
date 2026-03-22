/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bku
 */
public class bku_1
extends bkb_0
implements bkx_0 {
    protected static final Logger iqX = Logger.getLogger(bku_1.class);
    private final bap_0 iqY;

    public bku_1(bap_0 bap_02) {
        this.iqY = bap_02;
    }

    @Override
    public bap_0 dsy() {
        return this.iqY;
    }

    @Override
    public short dsm() {
        return 7;
    }

    @Override
    public boolean dsn() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        return !this.iqY.aVP() && this.iqY.T(bdj_22.bqg()) || this.iqY.aVP() && bdj_22.bqg().L(this.iqY.bcC(), this.iqY.bcD(), this.iqY.bcE());
    }

    @Override
    public void bIH() {
        iqX.info((Object)("Lancement de l'occupation MANAGE_FLEA sur la vitrine uid=" + this.iqY.dPv()));
        this.iqd.i(false, true);
        bnv_2 bnv_22 = this.iqd.dnx();
        cro_2.d(bnv_22);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = this.iqY.bcC() - bgt_02.bcC();
        int n2 = this.iqY.bcD() - bgt_02.bcD();
        bgt_02.ddI().a(abi_1.cB(n, n2));
        this.iqY.a(rw_0.bkX, aue_0.cVJ().cVK());
        if (aue_0.cVJ().c(cwe_1.eVh())) {
            aue_0.cVJ().b(cwe_1.eVh());
        }
        cwe_1.eVh().a(this.iqY);
        aue_0.cVJ().a(cwe_1.eVh());
        this.iqd.a(this);
        bon.dAK().a(bor.iPf, "dimensionalBagFleaDialog");
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqX.info((Object)("On arrete l'occupation MANAGE_FLEA sur la vitrine uid=" + this.iqY.dPv() + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        aue_0.cVJ().b(cwe_1.eVh());
        cro_2.d(null);
        if (bl2) {
            this.iqY.a(rw_0.bkY, aue_0.cVJ().cVK());
        }
        bon.dAK().a(bor.iPe, null);
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }

    @Override
    public boolean dsd() {
        return true;
    }
}

