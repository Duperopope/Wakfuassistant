/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eUE
 */
final class eue_1 {
    private static final Logger rxf = Logger.getLogger(eul_1.class);
    private final etu_0 rxg;
    private final eug_1 rxh;

    eue_1(etu_0 etu_02) {
        this.rxg = etu_02;
        this.rxh = new eug_1(etu_02);
    }

    public fqH a(exP exP2, ffV ffV2, acd_1 acd_12, boolean bl) {
        if (ffV2 == null || !ffV2.isUsable()) {
            rxf.error((Object)this.rxg.sq("cast d'un item null ou non utilisable ou cass\u00e9"));
            return fqH.sUU;
        }
        if (exP2.fha()) {
            return fqH.sVo;
        }
        if (exP2.a(exe_1.rDP)) {
            return fqH.sVp;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        if (bl) {
            byte by = fhc_02.fYi();
            if (by > 0 && exP2.a(exe_1.rDY)) {
                return fqH.sUY;
            }
            if (by > exP2.e(exx_2.rGj).aYB()) {
                return fqH.sUY;
            }
            if (fhc_02.fYk() > exP2.e(exx_2.rGl).aYB()) {
                return fqH.sUZ;
            }
            if (fhc_02.fYl() > exP2.e(exx_2.rGk).aYB()) {
                return fqH.sVa;
            }
        }
        if (!ffq_0.fVK().a(ffV2, exP2)) {
            return fqH.sVk;
        }
        if (fhc_02.fYq() && acd_12 != null && acd_12.getX() != exP2.aZw().getX() && acd_12.getY() != exP2.aZw().getY()) {
            return fqH.sVj;
        }
        if (fhc_02.d() != 2145 && fhc_02.fbT() && exP2.dmL().tz(ffV2.LV()) == null) {
            return fqH.sVp;
        }
        ang_2 ang_22 = fhc_02.a(ffj_0.sgd);
        return this.rxh.a(exP2, ffV2, acd_12, false, fhc_02.cpn(), fhc_02.cpo(), fhc_02.fYn(), fhc_02.fYm(), fhc_02.fYo(), false, ang_22);
    }
}

