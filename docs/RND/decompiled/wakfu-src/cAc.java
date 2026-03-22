/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public final class cAc
implements aaq_2<cvr_0> {
    private static final Logger mnu = Logger.getLogger(cAc.class);

    @Override
    public boolean a(cvr_0 cvr_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            return false;
        }
        if (!optional.get().tX(cvr_02.eCX())) {
            return false;
        }
        byte by = cvr_02.eCV();
        if (by == 7) {
            return false;
        }
        if (by == 4) {
            aPd.f("collect.error.resourceOccupied", new Object[0]);
            return false;
        }
        if (by != 5) {
            return false;
        }
        for (azx_1<Long, ffV> azx_12 : cvr_02.getItems()) {
            ffV ffV2 = azx_12.aHI();
            ffs_0 ffs_02 = bgt_02.dno().sY(azx_12.getFirst());
            if (ffs_02 == null || ffs_02.beR() == null || ffs_02.beR().a(ffs_02.fVb(), ffV2) < 0) continue;
            try {
                ffs_02.bp(ffV2);
                bgz_2.b(ffV2, null);
                if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljR)) continue;
                fhc_0 fhc_02 = ffV2.dOg();
                ArrayList<blg_2> arrayList = aue_0.cVJ().cVK().dlG().ia(false);
                boolean bl = false;
                for (blg_2 blg_22 : arrayList) {
                    ArrayList<blb_2> arrayList2 = blg_22.pd(fhc_02.d());
                    for (blb_2 blb_22 : arrayList2) {
                        if (blb_22.gih() != fqu_0.sTr) continue;
                        bl = true;
                        break;
                    }
                    if (!bl) continue;
                    break;
                }
                if (bl || !(fhc_02.fUZ() instanceof bfp_1)) continue;
                dcz dcz2 = new dcz();
                dcz2.aL(ffs_02.UH(fhc_02.d()));
                dcz2.NO(-1);
                dcz2.pz(-1);
                dcz2.cC(false);
                dcz2.lb(true);
                dcz2.lK(19934);
                aaw_1.bUq().h(dcz2);
            }
            catch (Exception exception) {
                mnu.error((Object)"Exception during ResourceSynchroMessageRunner.run", (Throwable)exception);
            }
        }
        if (bgt_02.dps() != null && bgt_02.dps().dsm() == 3) {
            bgt_02.dnY();
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12941;
    }
}

