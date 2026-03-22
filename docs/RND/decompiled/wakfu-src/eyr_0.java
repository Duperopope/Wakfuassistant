/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from eyR
 */
final class eyr_0 {
    private static final Logger pmV = Logger.getLogger(eyr_0.class);
    private final exP pmW;
    private final enm_0 pmX = new enm_0().RR(14);
    private final enm_0 pmY = new enm_0().RR(31);

    eyr_0(exP exP2) {
        this.pmW = exP2;
    }

    public void dlk() {
        this.pmW.fhn();
        this.fks();
        try {
            this.fkn();
            this.fkp();
            this.fkr();
            this.fkq();
            this.fko();
        }
        catch (Exception exception) {
            pmV.error((Object)("[Items] Error while reloading item effects of character " + String.valueOf(this.pmW)), (Throwable)exception);
        }
        finally {
            this.fkt();
        }
        this.pmW.fho();
    }

    private void fkn() {
        this.pmW.doc().oG(12).forEach(qD -> {
            if (!(qD instanceof erh_0)) {
                return;
            }
            Object EC = qD.bbf();
            if (!(EC instanceof ffV)) {
                return;
            }
            fhc_0 fhc_02 = ((ffV)EC).dOg();
            if (fhc_02 == null) {
                return;
            }
            if (!fhc_02.fbT()) {
                return;
            }
            ((ero_0)qD).fCn();
            this.pmW.doc().q((QD)qD);
        });
    }

    private void fko() {
        this.doc().Se(31);
        fft_0 fft_02 = this.pmW.dod();
        if (fft_02 == null) {
            return;
        }
        TLongObjectIterator<ffs_0> tLongObjectIterator = fft_02.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            this.d(ffs_02);
        }
    }

    private void d(ffs_0 ffs_02) {
        Object r = fgD.fXh().Vd(ffs_02.avr());
        if (r == null) {
            return;
        }
        Iterator<enk_0> iterator = ((fhc_0)r).fYj();
        qm_0 qm_02 = this.bdV();
        int n = this.pmW.bcC();
        int n2 = this.pmW.bcD();
        short s = this.pmW.bcE();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            if (enk_02.aZG() != 0 || enk_02.fAt()) continue;
            enk_02.a(this.pmY.fBe(), this.pmW, qm_02, enf_0.fBb(), n, n2, s, this.pmW, null, false);
        }
    }

    private void fkp() {
        Optional<ffV> optional;
        Object object;
        THashSet tHashSet = new THashSet();
        if (this.pmW.a(eyp_0.pmO) && (object = this.pmW.dmL()) != null && ((fhk)object).al(this.pmW)) {
            for (Map.Entry object2 : ((fhk)object).fUd().entrySet()) {
                try {
                    ffV ffV2;
                    optional = fht.b(this.pmW, (ffS)object2.getKey());
                    if (optional.isEmpty() || !(ffV2 = optional.get()).apo()) continue;
                    if (ffV2.dOg().dpq() != 0) {
                        Object ItemSet = this.pmW.dlJ().bX(ffV2.dOg().dpq());
                        tHashSet.add(ItemSet);
                    }
                    this.bX(ffV2);
                    this.bZ(ffV2);
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    pmV.error((Object)("ConcurrentModificationException while applyingItemAndSetEffects for item " + String.valueOf(object2.getValue()) + " on breed " + this.pmW.aWP()));
                    throw concurrentModificationException;
                }
            }
        }
        object = this.fku();
        if (this.pmW.a(eyp_0.pmQ) && object != null) {
            Iterator<Object> iterator = ((RM)object).iterator();
            while (iterator.hasNext()) {
                ffV ffV3 = (ffV)iterator.next();
                try {
                    if (!ffV3.apo()) continue;
                    if (ffV3.dOg().dpq() != 0) {
                        optional = this.pmW.dlJ().bX(ffV3.dOg().dpq());
                        tHashSet.add(optional);
                    }
                    this.bX(ffV3);
                    this.bZ(ffV3);
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    pmV.error((Object)("ConcurrentModificationException while applyingItemAndSetEffects for item " + ffV3.avr() + " on breed " + this.pmW.aWP()));
                    throw concurrentModificationException;
                }
            }
        }
        for (ffa_0 ffa_02 : tHashSet) {
            this.a(ffa_02);
        }
    }

    private void fkq() {
        boolean bl;
        qm_0 qm_02 = this.bdV();
        HashSet<ffV> hashSet = new HashSet<ffV>();
        fhe fhe2 = this.pmW.dnP();
        eiz_0<? extends exP> eiz_02 = this.pmW.dnl();
        block0: do {
            Object object;
            bl = false;
            if (this.pmW.a(eyp_0.pmO) && (object = this.pmW.dmL()) != null && ((fhk)object).al(this.pmW)) {
                for (Map.Entry entry : ((fhk)object).fUd().entrySet()) {
                    ffV ffV2;
                    Optional<ffV> optional = fhe2.B((Long)entry.getValue());
                    if (optional.isEmpty() || !(ffV2 = optional.get()).apo() || hashSet.contains(ffV2)) continue;
                    if (ewo_0.oBF.o(ewr_0.oDC).contains(ffV2.avr())) {
                        this.a((ffS)entry.getKey(), hashSet, ffV2, eiz_02);
                        bl = true;
                        continue;
                    }
                    if (ffV2.adO() && this.pmW.djT() && !ffV2.ead().apo()) {
                        this.a((ffS)entry.getKey(), hashSet, ffV2, eiz_02);
                        bl = true;
                        continue;
                    }
                    if (ffq_0.fVK().a(ffV2, (qu_0)this.pmW, qm_02)) continue;
                    this.a((ffS)entry.getKey(), hashSet, ffV2, eiz_02);
                    bl = true;
                    break;
                }
            }
            object = this.fku();
            if (!this.pmW.a(eyp_0.pmQ) || object == null) continue;
            Iterator<Object> iterator = ((RM)object).iterator();
            while (iterator.hasNext()) {
                ffV ffV3 = (ffV)iterator.next();
                if (!ffV3.apo() || hashSet.contains(ffV3) || ffV3.adO() && this.pmW.djT() || ffq_0.fVK().a(ffV3, (qu_0)this.pmW, qm_02)) continue;
                bl = true;
                hashSet.add(ffV3);
                this.bX(ffV3);
                if (eiz_02 == null) continue block0;
                eiz_02.p(ffS.gj((byte)((RM)object).dK(ffV3.LV())));
                continue block0;
            }
        } while (bl);
    }

    private void a(ffS ffS2, Set<ffV> set, ffV ffV2, eiz_0<? extends exP> eiz_02) {
        set.add(ffV2);
        this.bX(ffV2);
        if (eiz_02 != null) {
            eiz_02.p(ffS2);
        }
    }

    private void fkr() {
        eiz_0<? extends exP> eiz_02 = this.pmW.dnl();
        if (eiz_02 == null) {
            return;
        }
        eiz_02.fwW();
        eiz_02.fwU();
        if (!this.pmW.a(eyp_0.pmO)) {
            fgd_0 fgd_02 = this.fku();
            if (fgd_02 == null) {
                return;
            }
            for (ffV ffV2 : fgd_02) {
                if (!ffV2.apo() || !ffV2.dXg()) continue;
                ffS ffS2 = ffS.gj((byte)fgd_02.e(ffV2));
                eiz_02.a(ffS2, ffV2.eAZ());
            }
            eiz_02.fwV();
            return;
        }
        fhk fhk2 = this.pmW.dmL();
        if (fhk2 == null || !fhk2.al(this.pmW)) {
            return;
        }
        fhe fhe2 = this.pmW.dnP();
        if (fhe2 == null) {
            return;
        }
        for (Map.Entry<ffS, Long> entry : fhk2.fUd().entrySet()) {
            ffV ffV3;
            Optional<ffV> optional = fhe2.B(entry.getValue());
            if (optional.isEmpty() || !(ffV3 = optional.get()).apo() || !ffV3.dXg()) continue;
            eiz_02.a(entry.getKey(), ffV3.eAZ());
        }
        eiz_02.fwV();
    }

    void bX(ffV ffV2) {
        this.doc().g(ffV2, true);
    }

    boolean bY(ffV ffV2) {
        qm_0 qm_02 = this.bdV();
        if (!ffq_0.fVK().a(ffV2, (qu_0)this.pmW, qm_02)) {
            return false;
        }
        return this.bZ(ffV2);
    }

    void e(fhk fhk2) {
        ffb_0 ffb_02 = this.pmW.dlJ();
        Map<ffS, Long> map = fhk2.fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            Optional<ffV> optional = fht.a(this.pmW, fhk2, entry.getKey());
            if (optional.isEmpty()) {
                pmV.warn((Object)("Impossible to remove item effects : Item Unknown " + String.valueOf(entry)));
                return;
            }
            ffV ffV2 = optional.get();
            short s = ffV2.dOg().dpq();
            if (s > 0 && ffb_02 != null) {
                Object ItemSet = ffb_02.bX(s);
                this.a(ffV2, (ffa_0)ItemSet);
                continue;
            }
            this.bX(ffV2);
        }
    }

    boolean bZ(ffV ffV2) {
        if (!ffV2.apo()) {
            return false;
        }
        qm_0 qm_02 = this.bdV();
        int n = this.pmW.bcC();
        int n2 = this.pmW.bcD();
        short s = this.pmW.bcE();
        for (enk_0 enk_02 : ffV2) {
            if (enk_02.aZG() != 0 || enk_02.fAt()) continue;
            enk_02.a(ffV2, this.pmW, qm_02, enf_0.fBb(), n, n2, s, this.pmW, null, false);
        }
        return true;
    }

    void a(ffV ffV2, ffa_0 ffa_02) {
        this.doc().g(ffV2, true);
        this.a(ffa_02);
    }

    private void a(ffa_0 ffa_02) {
        eNl eNl2 = this.pmX.qt(ffa_02.aIi()).fBe();
        this.doc().a(eNl2, true);
        short s = this.b(ffa_02);
        ArrayList<fgm_0> arrayList = ffa_02.UR(s);
        if (arrayList.isEmpty()) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            this.a(arrayList.get(i), this.pmW.bdV());
        }
    }

    private short b(ffa_0<? extends fhc_0> ffa_02) {
        fhk fhk2 = this.pmW.dmL();
        fgd_0 fgd_02 = this.fku();
        fhe fhe2 = this.pmW.dnP();
        short s = 0;
        for (fhc_0 fhc_02 : ffa_02) {
            Object object;
            if (fhk2 != null && fhe2 != null && fhk2.al(this.pmW)) {
                object = fhk2.fUd().entrySet().iterator();
                while (object.hasNext()) {
                    ffV ffV2;
                    Map.Entry entry = (Map.Entry)object.next();
                    Optional<ffV> optional = fhe2.B((Long)entry.getValue());
                    if (!optional.isPresent() || (ffV2 = optional.get()).avr() != fhc_02.d() || !fgt.a(this.pmW, fhk2, ffV2, fhk2.tz(ffV2.LV()), this.bdV(), false)) continue;
                    s = (short)(s + 1);
                }
            }
            if (fgd_02 == null || !this.pmW.a(eyp_0.pmQ) || (object = (ffV)fgd_02.pc(fhc_02.d())) == null || !ffq_0.fVK().a((ffV)object, (qu_0)this.pmW, this.bdV())) continue;
            s = (short)(s + 1);
        }
        return s;
    }

    private void a(fgm_0 fgm_02, qm_0 qm_02) {
        int n = this.pmW.bcC();
        int n2 = this.pmW.bcD();
        short s = this.pmW.bcE();
        for (enk_0 enk_02 : fgm_02) {
            enk_02.a(fgm_02, this.pmW, qm_02, enf_0.fBb(), n, n2, s, this.pmW, null, false);
        }
    }

    private void fks() {
        this.d(this.e(exx_2.rGj));
        this.d(this.e(exx_2.rGk));
        this.d(this.e(exx_2.rGl));
        this.d(this.e(exx_2.rGi));
    }

    private void d(exf_2 exf_22) {
        if (exf_22 != null) {
            exf_22.fOA();
        }
    }

    private void fkt() {
        this.e(this.e(exx_2.rGj));
        this.e(this.e(exx_2.rGk));
        this.e(this.e(exx_2.rGl));
        this.e(this.e(exx_2.rGi));
    }

    private void e(exf_2 exf_22) {
        if (exf_22 != null) {
            exf_22.fOB();
        }
    }

    private fgd_0 fku() {
        fgd_0 fgd_02 = this.pmW.doC();
        Optional<eIi> optional = eJW.as(this.pmW);
        if (optional.isEmpty()) {
            return fgd_02;
        }
        fgd_0 fgd_03 = new fgd_0();
        fhs fhs2 = fhs.eW(optional.get().cmL());
        Map<ffS, Integer> map = fhs2.fXL();
        for (Map.Entry<ffS, Integer> entry : map.entrySet()) {
            try {
                Integer n = entry.getValue();
                ffS ffS2 = entry.getKey();
                fgd_03.a(eJW.d(ffS2, n), ffS2.aJr());
            }
            catch (Sz sz) {
                pmV.error((Object)("Unable to generate fake EquipmentSheet for " + String.valueOf(this.pmW)), (Throwable)sz);
            }
            catch (SD sD) {
                pmV.error((Object)("Unable to generate fake EquipmentSheet for " + String.valueOf(this.pmW)), (Throwable)sD);
            }
            catch (sa_0 sa_02) {
                pmV.error((Object)("Unable to generate fake EquipmentSheet for " + String.valueOf(this.pmW)), (Throwable)sa_02);
            }
        }
        return fgd_03;
    }

    public ers_0 doc() {
        return this.pmW.doc();
    }

    public qm_0 bdV() {
        return this.pmW.bdV();
    }

    public exf_2 e(pt_0 pt_02) {
        return this.pmW.e(pt_02);
    }
}

