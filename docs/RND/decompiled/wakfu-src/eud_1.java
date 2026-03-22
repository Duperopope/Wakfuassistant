/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eUD
 */
final class eud_1 {
    private static final Logger rxb = Logger.getLogger(eud_1.class);
    private final etu_0 rxc;
    private final eug_1 rxd;
    private final eue_1 rxe;

    eud_1(etu_0 etu_02) {
        this.rxc = etu_02;
        this.rxd = new eug_1(etu_02);
        this.rxe = new eue_1(etu_02);
    }

    public fqH a(exP exP2, ffV ffV2, fqE fqE2, acd_1 acd_12) {
        Object object;
        if (ffV2 == null || !ffV2.isUsable()) {
            rxb.error((Object)this.rxc.sq("utilisation d'un objet null, inutilisable ou cass\u00e9"));
            return fqH.sUU;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        if (fqE2 == null) {
            rxb.error((Object)this.rxc.sq("cast d'un spell null"));
            return fqH.sUU;
        }
        Object Spell = fqE2.giP();
        List<Long> list = ewo_0.oBF.o(ewr_0.oDD);
        if (list.contains(((fqD)Spell).d())) {
            return fqH.sVq;
        }
        if (((fqD)Spell).eeY()) {
            return fqH.sVl;
        }
        fqO fqO2 = ((fqD)Spell).g(fqE2, exP2, (Object)acd_12, exP2.fgg());
        if (fhc_02.fYi() + fqO2.r(exx_2.rGj) > exP2.e(exx_2.rGj).aYB()) {
            return fqH.sUY;
        }
        if (fhc_02.fYk() + fqO2.r(exx_2.rGl) > exP2.e(exx_2.rGl).aYB()) {
            return fqH.sUZ;
        }
        if (fhc_02.fYl() + fqO2.r(exx_2.rGk) > exP2.e(exx_2.rGk).aYB()) {
            return fqH.sVa;
        }
        if (acd_12 == null) {
            var9_9 = exP2.fgh().c(exP2, fqE2, this.rxc.dHf().bhJ());
            if (!((fqH)((Object)var9_9)).isValid()) {
                return var9_9;
            }
        } else {
            var9_9 = this.rxc.dy(acd_12.getX(), acd_12.getY());
            object = this.rxc.bag();
            if (!eug_1.a(exP2, acd_12, fqE2, (exP)var9_9, this.rxc)) {
                return fqH.sVj;
            }
            fqH fqH2 = exP2.fgh().a(exP2, fqE2, (int)this.rxc.dHf().bhJ(), (anu_1)var9_9);
            if (!fqH2.isValid()) {
                return fqH2;
            }
        }
        boolean bl = ((fqD)Spell).l(fqE2, exP2, acd_12, exP2.bdV());
        object = this.rxd.a(exP2, fqE2, acd_12, true, fhc_02.cpn(), fhc_02.cpo(), fhc_02.fYn(), fhc_02.fYm(), fhc_02.fYo(), bl, ((fqD)Spell).giF());
        if (!((fqH)((Object)object)).isValid()) {
            return object;
        }
        return this.rxe.a(exP2, ffV2, acd_12, false);
    }
}

