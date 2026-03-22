/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ffQ
 */
public class ffq_0
implements RU<ffV> {
    private static final ffq_0 sgz = new ffq_0();

    private ffq_0() {
    }

    public static ffq_0 fVK() {
        return sgz;
    }

    @Override
    public int a(RS rS, ffV ffV2) {
        return -8;
    }

    @Override
    public int a(RS rS, ffV ffV2, short s) {
        if (!(rS instanceof fgd_0)) {
            return -6;
        }
        fgd_0 fgd_02 = (fgd_0)rS;
        if (!fgd_02.ah(s)) {
            return -9;
        }
        if (ewo_0.oBF.o(ewr_0.oDC).contains(ffV2.avr())) {
            return -4;
        }
        if (!ffV2.dOg().dGh().v(ffS.gj((byte)s))) {
            return -5;
        }
        if (fgd_02.gk((byte)s)) {
            return -8;
        }
        if (!ffq_0.cC(ffV2)) {
            return -8;
        }
        if (ffV2.fWt()) {
            return -11;
        }
        if (!ffq_0.a(fgd_02, null, ffV2)) {
            return -7;
        }
        ffS[] ffSArray = ffV2.dOg().dGh().fZs();
        if (ffSArray != null) {
            for (ffS ffS2 : ffSArray) {
                ffV ffV3;
                if (fgd_02.ah(ffS2.aJr()) || (ffV3 = (ffV)fgd_02.ai(ffS2.aJr())) == null) continue;
                return -9;
            }
        }
        return 0;
    }

    @Override
    public int a(RS rS, ffV ffV2, ffV ffV3) {
        if (!(rS instanceof fgd_0)) {
            return -6;
        }
        fgd_0 fgd_02 = (fgd_0)rS;
        short s = fgd_02.e(ffV2);
        if (!ffV3.dOg().dGh().v(ffS.gj((byte)s))) {
            return -5;
        }
        if (fgd_02.gk((byte)s)) {
            return -8;
        }
        if (!ffq_0.cC(ffV3)) {
            return -8;
        }
        if (ffV3.fWt()) {
            return -11;
        }
        if (!ffq_0.a(fgd_02, ffV2, ffV3)) {
            return -7;
        }
        ffS[] ffSArray = ffV3.dOg().dGh().fZs();
        if (ffSArray != null) {
            for (ffS ffS2 : ffSArray) {
                ffV ffV4;
                if (fgd_02.ah(ffS2.aJr()) || (ffV4 = (ffV)fgd_02.ai(ffS2.aJr())) == null || !ffV4.apo() || this.b((RS)fgd_02, ffV4) >= 0) continue;
                return -9;
            }
        }
        return 0;
    }

    @Override
    public int b(RS rS, ffV ffV2) {
        if (!(rS instanceof fgd_0)) {
            return -6;
        }
        fgd_0 fgd_02 = (fgd_0)rS;
        short s = fgd_02.e(ffV2);
        if (fgd_02.gk((byte)s)) {
            return -8;
        }
        return ffV2.apo() ? 0 : -8;
    }

    @Override
    public boolean a(ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        if (!ffq_0.e(ffV2, (exP)qu_02)) {
            return false;
        }
        if (!ffq_0.cC(ffV2)) {
            return false;
        }
        if (!this.b(ffV2, qu_02)) {
            return false;
        }
        return ffV2.dOg().a(ffj_0.sge) == null || ffV2.dOg().a(ffj_0.sge).b(qu_02, qu_02, ffV2, qm_02);
    }

    public boolean a(ffV ffV2, qu_0 qu_02) {
        if (!ffq_0.e(ffV2, (exP)qu_02)) {
            return false;
        }
        if (!ffq_0.cC(ffV2)) {
            return false;
        }
        return this.b(ffV2, qu_02);
    }

    private boolean b(ffV ffV2, qu_0 qu_02) {
        if (qu_02.Sn() != 0L) {
            return true;
        }
        if (!ffV2.adZ()) {
            return true;
        }
        return !ffV2.fUY().fXu().fXx();
    }

    @Override
    public boolean a(RS<ffV> rS, qu_0 qu_02, qm_0 qm_02) {
        for (ffV ffV2 : rS) {
            if (!ffV2.apo()) continue;
            if (!ffq_0.e(ffV2, (exP)qu_02)) {
                return false;
            }
            if (!ffq_0.cC(ffV2)) {
                return false;
            }
            if (ffV2.dOg().a(ffj_0.sge) == null || ffV2.dOg().a(ffj_0.sge).b(qu_02, qu_02, ffV2, qm_02)) continue;
            return false;
        }
        return true;
    }

    public static boolean e(ffV ffV2, exP exP2) {
        fhc_0 fhc_02 = ffV2.dOg();
        if (fhc_02.adO() || fhc_02.c(fgg_0.sij)) {
            return true;
        }
        short s = exP2.a(eyp_0.pmO) ? (short)exP2.dmL().cmL() : (short)-1;
        short s2 = s <= 0 ? (short)exP2.cmL() : s;
        return ffV2.cmL() <= s2;
    }

    public static boolean cC(ffV ffV2) {
        if (!ffV2.adO()) {
            return true;
        }
        fnl_0 fnl_02 = ffV2.ead();
        return fnl_02.apo() && fnl_02.agM() > 0;
    }

    public static boolean a(fgd_0 fgd_02, ffV ffV2, ffV ffV3) {
        return !ffq_0.a(fgd_02, ffV2, ffV3, fgg_0.sig) && !ffq_0.a(fgd_02, ffV2, ffV3, fgg_0.sik);
    }

    private static boolean a(fgd_0 fgd_02, ffV ffV2, ffV ffV3, fgg_0 fgg_02) {
        if (ffV3.dOg().c(fgg_02)) {
            for (ffV ffV4 : fgd_02) {
                if (ffV3 == ffV4 || ffV2 == ffV4 || !ffV4.dOg().c(fgg_02)) continue;
                return true;
            }
        }
        return false;
    }

    public fhc b(ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        if (!ffq_0.e(ffV2, (exP)qu_02)) {
            return fhc.snw;
        }
        if (!ffq_0.cC(ffV2)) {
            return fhc.snM;
        }
        if (!this.b(ffV2, qu_02)) {
            return fhc.snv;
        }
        boolean bl = ffV2.dOg().a(ffj_0.sge) == null || ffV2.dOg().a(ffj_0.sge).b(qu_02, qu_02, ffV2, qm_02);
        return bl ? fhc.snm : fhc.snv;
    }
}

