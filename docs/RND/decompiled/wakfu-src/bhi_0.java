/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortByteIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TShortByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TShortByteIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TShortByteHashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bhI
 */
final class bhi_0 {
    private static final Logger ihi = Logger.getLogger(bhi_0.class);
    private final bhJ ihj;
    private final enm_0 ihk = new enm_0();

    bhi_0(@NotNull bhJ bhJ2) {
        this.ihj = bhJ2;
    }

    void doY() {
        TByteIntHashMap tByteIntHashMap = this.ihj.dpw();
        if (tByteIntHashMap == null) {
            return;
        }
        this.ihk.RR(12);
        int[] nArray = tByteIntHashMap.values();
        TShortByteHashMap tShortByteHashMap = new TShortByteHashMap();
        this.ihj.doc().Sd(12);
        for (int i = 0; i < nArray.length; ++i) {
            this.a(tShortByteHashMap, nArray[i]);
        }
        this.a(tShortByteHashMap, this.ihj.doZ());
        this.a(tShortByteHashMap);
    }

    private void a(TShortByteHashMap tShortByteHashMap, int n) {
        Iterator<enk_0> iterator;
        if (n <= 0) {
            return;
        }
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            ihi.warn((Object)("L'item " + n + " n'existe pas"));
            return;
        }
        if (((fhc_0)r).dpq() > 0) {
            tShortByteHashMap.adjustOrPutValue(((fhc_0)r).dpq(), (byte)1, (byte)1);
        }
        if (!(iterator = ((fhc_0)r).fYj()).hasNext()) {
            return;
        }
        this.a(n, iterator);
    }

    private void a(TShortByteHashMap tShortByteHashMap) {
        this.ihj.doc().Se(14);
        this.ihk.RR(14);
        TShortByteIterator tShortByteIterator = tShortByteHashMap.iterator();
        while (tShortByteIterator.hasNext()) {
            fgm_0 fgm_02;
            tShortByteIterator.advance();
            bEq bEq2 = bEr.dSi().bW(tShortByteIterator.key());
            if (bEq2 == null || (fgm_02 = bEq2.UQ(tShortByteIterator.value())) == null) continue;
            Iterator<enk_0> iterator = fgm_02.iterator();
            this.a(bEq2.aIi(), iterator);
        }
    }

    private void a(int n, Iterator<enk_0> iterator) {
        this.ihk.qt(n);
        eNl eNl2 = this.ihk.fBe();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            this.a(n, eNl2, enk_02);
        }
    }

    private void a(int n, eNl eNl2, enk_0 enk_02) {
        if (this.a(eNl2, enk_02)) {
            return;
        }
        if (enk_02.avZ() != enf_0.qVv.d() && bhi_0.h(enk_02)) {
            ihi.warn((Object)("HMI is not set on a NullEffect on the item " + n));
        }
    }

    private boolean a(eNl eNl2, enk_0 enk_02) {
        if (!this.g(enk_02)) {
            return false;
        }
        if (enk_02.avZ() == enf_0.qVv.d()) {
            if (bhi_0.h(enk_02)) {
                enk_02.a(eNl2, this.ihj, this.ihj.fgg(), enf_0.fBb(), this.ihj.bcC(), this.ihj.bcD(), this.ihj.bcE(), this.ihj, null, false);
            }
            return true;
        }
        if (enk_02.avZ() == enf_0.qUR.d()) {
            return this.c(eNl2, enk_02);
        }
        if (enh_0.qWn.contains(enk_02.avZ())) {
            return this.b(eNl2, enk_02);
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean g(enk_0 enk_02) {
        boolean bl;
        ang_2 ang_22 = enk_02.fAx();
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        if (ero_02 == null) {
            return false;
        }
        QD qD = ero_02.bbo();
        try {
            bl = ang_22 == null || ang_22.b(this.ihj, this.ihj, qD, this.ihj.bdV());
        }
        catch (RuntimeException runtimeException) {
            ihi.error((Object)"Exception levee", (Throwable)runtimeException);
            bl = false;
        }
        finally {
            qD.aZp();
        }
        return bl;
    }

    private boolean b(eNl eNl2, enk_0 enk_02) {
        if (enk_02.aZQ()) {
            return true;
        }
        fqB fqB2 = fqC.giD().Za(enk_02.aZH());
        if (fqB2 != null) {
            for (enk_0 enk_03 : fqB2) {
                this.a(eNl2, enk_03);
            }
        } else {
            ihi.error((Object)("Group d'effet inconnu:" + enk_02.aZH()));
        }
        return true;
    }

    private boolean c(eNl eNl2, enk_0 enk_02) {
        if (enk_02.aZQ()) {
            return true;
        }
        bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(enk_02.a(0, (short)0, ene_0.qPu));
        if (bmq_02 != null) {
            for (enk_0 enk_03 : bmq_02) {
                this.a(eNl2, enk_03);
            }
        } else {
            ihi.error((Object)("etat inconnu:" + enk_02.Rz(0)));
        }
        return true;
    }

    private static boolean h(enk_0 enk_02) {
        return enk_02.fAz().hasNext() || enk_02.fAA().hasNext();
    }
}

