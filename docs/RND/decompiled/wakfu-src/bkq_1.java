/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkQ
 */
public final class bkq_1
implements adi_1 {
    public static final bkq_1 isa = new bkq_1();
    private static final Logger isb = Logger.getLogger(bkq_1.class);
    private boolean isc;
    private alx_2 ikv;

    private bkq_1() {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().f("deathView", new bkp_2());
        this.ikv = string -> {
            if (!string.equals("deathDialog")) {
                return;
            }
            bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
            if (bkb_02 != null && bkb_02.dsm() == 4) {
                return;
            }
            if (aue_0.cVJ().c(isa)) {
                aue_0.cVJ().b(isa);
            }
        };
        fyw_0.gqw().a(this.ikv);
        fyw_0.gqw().d("wakfu.death", cej_1.class);
        this.isc = false;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().tc("wakfu.death");
        fyw_0.gqw().b(this.ikv);
        if (fyw_0.gqw().to("deathDialog")) {
            fyw_0.gqw().tl("deathDialog");
        }
        fse_1.gFu().f("deathView", (Object)null);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18766: {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                crk_1 crk_12 = new crk_1();
                crk_12.aH(bgt_02);
                crk_12.run();
                return false;
            }
            case 16777: {
                aue_0.cVJ().etu().d(new cjc_0());
                this.isc = true;
                return false;
            }
            case 16355: {
                if (fyw_0.gqw().to("deathDialog")) {
                    fyw_0.gqw().tl("deathDialog");
                }
                return false;
            }
            case 18105: {
                boolean bl;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                int[] nArray = aue_0.cVJ().cVO().cWq();
                boolean bl2 = bl = !evm_2.c(nArray, evm_2.osZ);
                if (!bl) {
                    isb.error((Object)("[DEATH] A non admin player tried to send an admin revival request. Character id" + bgt_03.Sn() + ", account id : " + bgt_03.aZj()));
                    return false;
                }
                new asg_0(bgt_03.getName()).bGy();
                this.isc = false;
                return false;
            }
            case 16902: {
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                bkb_0 bkb_02 = bgt_04.dps();
                if (bkb_02 != null && bkb_02.dsm() == 4 && !fyw_0.gqw().to("deathDialog")) {
                    ccj_2.g("deathDialog", 256L);
                }
                return false;
            }
        }
        return true;
    }

    public boolean dsW() {
        return this.isc;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

