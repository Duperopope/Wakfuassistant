/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cSB
 */
public class csb_2
implements adi_1 {
    protected static final Logger nFV = Logger.getLogger(csb_2.class);
    private static final csb_2 nFW = new csb_2();
    private final bNL nFX = new bNL();
    private bco_0 nFY;
    private alx_2 ikv;

    public static csb_2 eOl() {
        return nFW;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (czb_2.o(aam_22)) {
            return false;
        }
        switch (aam_22.d()) {
            case 18667: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                this.nFX.ke(string);
                return false;
            }
            case 17094: {
                dae_0 dae_03 = (dae_0)aam_22;
                String string = dae_03.bCt();
                this.nFX.ke(string);
                List<bNK> list = this.nFX.egr();
                if (list == null || list.size() != 1) {
                    return false;
                }
                bNK bNK2 = list.get(0);
                ArrayList<bNJ> arrayList = bNK2.egq();
                if (arrayList.size() != 1) {
                    return false;
                }
                bNJ bNJ2 = arrayList.get(0);
                if (bNJ2 == null) {
                    return false;
                }
                this.oh(bNJ2.Sn());
                return false;
            }
            case 18468: {
                dae_0 dae_04 = (dae_0)aam_22;
                long l = dae_04.bCp();
                this.oh(l);
                return false;
            }
        }
        return true;
    }

    public void oh(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bNV bNV2 = (bNV)frz.a(fre_0.sZc);
        bNV2.c(bgt_02, this.nFY, l);
        aue_0.cVJ().b(this);
    }

    public void c(bco_0 bco_02) {
        this.nFY = bco_02;
        this.nFX.a(bco_02.Sn(), bco_02);
        aue_0.cVJ().a(this);
    }

    public bco_0 eOm() {
        return this.nFY;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bNL.kIG = "";
            this.ikv = new csc_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("ticketOffice", this.nFX);
            fse_1.gFu().f("boatTicketOffice", true);
            ccj_2.pd("zaapDialog");
            fyw_0.gqw().d("wakfu.zaap", chh_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("zaapDialog");
            fse_1.gFu().vX("ticketOffice");
            fse_1.gFu().vX("boatTicketOffice");
            fyw_0.gqw().tc("wakfu.zaap");
            this.nFY = null;
        }
    }
}

