/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bNc
 */
public class bnc_1
implements adi_1 {
    public static final bnc_1 kAp = new bnc_1();
    private static final Logger kAq = Logger.getLogger(bnc_1.class);

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13046: {
                cvu_0 cvu_02 = (cvu_0)aam_22;
                zu_2 zu_22 = cvu_02.eEw();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (bgt_02.fhv() == 34) {
                    this.e(zu_22);
                } else {
                    this.d(zu_22);
                }
                return false;
            }
        }
        return true;
    }

    private void d(zu_2 zu_22) {
        int n = zu_22.ayQ();
        fdK fdK2 = (fdK)fda_0.rWI.a(fdv_0.rZv, n);
        if (fdK2 == null) {
            kAq.error((Object)String.format("[STELE] Received unknown stele identifier to display preview : %s", n));
            return;
        }
        cyr_1.eXT().b(fdK2, zu_22);
        if (aue_0.cVJ().c(cyr_1.eXT())) {
            ((fey_2)fyw_0.gqw().th("steleDialog")).gvm();
        } else {
            aue_0.cVJ().a(cyr_1.eXT());
        }
    }

    private void e(zu_2 zu_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 34) {
            kAq.warn((Object)"Received stele content while having another occupation. Something is not adding up");
            return;
        }
        bkg_1 bkg_12 = (bkg_1)bkb_02;
        cyr_1.eXT().a(bkg_12.dso(), zu_22);
        if (!aue_0.cVJ().c(cyr_1.eXT())) {
            aue_0.cVJ().a(cyr_1.eXT());
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
    }
}

