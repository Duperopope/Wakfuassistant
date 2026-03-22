/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from cVm
 */
public class cvm_1
extends crw_2 {
    protected static final Logger nOP = Logger.getLogger(cvm_1.class);
    private static final cvm_1 nOQ = new cvm_1();
    private bnn_0 nOR;
    private alx_2 ikv;

    public static cvm_1 eTF() {
        return nOQ;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (!bl) {
            Object object;
            this.ikv = string -> {
                if (string.equals("storageBoxDialog") || string.equals("inventoryDialog")) {
                    aue_0.cVJ().b(cvm_1.eTF());
                }
            };
            fyw_0.gqw().a(this.ikv);
            aue_0.cVJ().b(czi_2.eYU());
            if (this.nOR != null && this.nOR.bDw() > 0) {
                object = new dae_0();
                ((ama_1)object).lK(18892);
                ((ama_1)object).ay((byte)0);
                aaw_1.bUq().h((aam_2)object);
            }
            object = (fey_2)ccj_2.g("storageBoxDialog", 16L);
            this.bB((fey_2)object);
            fse_1.gFu().f("storageBox", this.nOR);
            fyw_0.gqw().d("wakfu.storageBox", chi_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (!bl) {
            bgt_0 bgt_02;
            chi_2.setDraggedItemId(-1L);
            if (this.nOR != null) {
                this.nOR.clear();
                this.nOR = null;
            }
            if ((bgt_02 = aue_0.cVJ().cVK()) != null && bgt_02.dps() != null) {
                bgt_02.i(false, true);
            }
            fyw_0.gqw().tc("wakfu.collectMachine");
            fyw_0.gqw().b(this.ikv);
            if (fyw_0.gqw().to("storageBoxDialog")) {
                fyw_0.gqw().tl("storageBoxDialog");
            }
            aue_0.cVJ().a(czi_2.eYU());
            fse_1.gFu().vX("storageBox");
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16044: {
                dbl_0 dbl_02 = (dbl_0)aam_22;
                byte by = (byte)dbl_02.getDestinationPosition();
                long l = dbl_02.bCp();
                bnl_0 bnl_02 = this.nOR.efZ();
                if (bnl_02 == null) {
                    nOP.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9 !");
                    return false;
                }
                bnl_02.b(l, by);
                return false;
            }
            case 17635: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                long l = dbl_03.bCp();
                byte by = (byte)dbl_03.getDestinationPosition();
                bnl_0 bnl_03 = this.nOR.efZ();
                if (bnl_03 == null) {
                    nOP.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9, impossible de r\u00e9aliser l'action de drop !!!");
                    return false;
                }
                ffV ffV2 = aue_0.cVJ().cVK().dno().tb(l);
                bnu_1 bnu_12 = bnl_03.a(ffV2, dbl_03.bCq(), by);
                switch (bnu_12) {
                    case kCo: {
                        nOP.warn((Object)"Error while dropping item to storage box, user does not have the rights");
                        aPd.e("storageBox.addItem.unauthorized", new Object[0]);
                        return false;
                    }
                    case kCp: {
                        nOP.warn((Object)"Inventory error occurred while dropping item to storage box");
                        aPd.e("storageBox.addItem.unauthorized", new Object[0]);
                        return false;
                    }
                }
                return false;
            }
            case 17100: {
                dbl_0 dbl_04 = (dbl_0)aam_22;
                long l = dbl_04.getDestinationUniqueId();
                bnl_0 bnl_04 = this.nOR.efZ();
                if (bnl_04 == null) {
                    nOP.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9, impossible de r\u00e9aliser l'action de drop !!!");
                    return false;
                }
                ffV ffV3 = dbl_04.getItem();
                bnl_04.a(ffV3.LV(), ffV3.avr(), dbl_04.bfd(), l, (byte)dbl_04.getDestinationPosition());
                chi_2.setDraggedItemId(-1L);
                return false;
            }
            case 19021: {
                dae_0 dae_02 = (dae_0)aam_22;
                byte by = dae_02.bCn();
                bnl_0 bnl_05 = this.nOR.efZ();
                if (bnl_05 == null) {
                    nOP.error((Object)("impossible de retrouver le compartiment d'index=" + by));
                    return false;
                }
                bnl_05.efT();
                return false;
            }
            case 18892: {
                dae_0 dae_03 = (dae_0)aam_22;
                byte by = dae_03.bCn();
                if (this.nOR == null) {
                    return false;
                }
                bnl_0 bnl_06 = this.nOR.cx(by);
                if (bnl_06 == null) {
                    nOP.error((Object)("impossible de retrouver le compartiment d'index=" + by));
                    return false;
                }
                this.b(bnl_06);
                return false;
            }
            case 17597: {
                dae_0 dae_04 = (dae_0)aam_22;
                long l = dae_04.bCp();
                if (this.nOR.efY() < l) {
                    fiq_2.gCw().d(fik_2.gBZ().l("error.storage.notEnoughMoneyInBox", new Object[0]));
                    return false;
                }
                String string2 = aum_0.cWf().cQ(l);
                fiq_2.gCw().d(fik_2.a(string -> this.nOR.lU(l)).l("question.storage.withdrawConfirm", string2));
                return false;
            }
            case 19140: {
                dae_0 dae_05 = (dae_0)aam_22;
                long l = dae_05.bCp();
                if (aue_0.cVJ().cVK().cWp().exS() < l) {
                    fiq_2.gCw().d(fik_2.gBZ().l("error.storage.notEnoughMoneyInPlayer", new Object[0]));
                    return false;
                }
                String string3 = aum_0.cWf().cQ(l);
                fiq_2.gCw().d(fik_2.a(string -> this.nOR.lT(l)).l("question.storage.depositConfirm", string3));
                return false;
            }
        }
        return true;
    }

    public void b(bnl_0 bnl_02) {
        if (bnl_02.efO() || bnl_02.efP()) {
            bnl_02.efS();
        }
        this.nOR.a(bnl_02);
        this.nOR.eaj();
    }

    @Override
    public long Sn() {
        return 12L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(Map<Integer, Boolean> map, fam fam2, long l) {
        this.nOR = new bnn_0(map, fam2, l);
        fse_1.gFu().f("storageBox", this.nOR);
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18892);
        dae_02.ay((byte)0);
        aaw_1.bUq().h(dae_02);
    }

    public bnn_0 eTG() {
        return this.nOR;
    }

    public void oq(long l) {
        this.nOR.lV(l);
    }

    public void eTH() {
        bnl_0 bnl_02 = this.nOR.efZ();
        bnl_02.efQ();
    }

    public void b(feq feq2) {
        bnl_0 bnl_02 = this.nOR.efZ();
        bnl_02.a(feq2);
        bnl_02.eaj();
    }

    public void f(kg_0 kg_02) {
        bnn_0 bnn_02 = this.nOR;
        fam fam2 = new fam();
        fam2.g(kg_02);
        bnn_02.a(fam2);
    }
}

