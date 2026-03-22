/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bLN
 */
public final class bln_2 {
    private static final Logger kve = Logger.getLogger(bln_2.class);
    private bsj_0 kvf;

    public fqH a(exP exP2, fqE fqE2, acd_1 acd_12, boolean bl) {
        fqH fqH2;
        if (this.kvf == null) {
            kve.error((Object)"On ne check pas les critere si on a pas de combat associ\u00e9 dans le validateur");
            return fqH.sUS;
        }
        if (fqE2 == null) {
            return fqH.sUU;
        }
        Object Spell = fqE2.giP();
        List<Long> list = ewo_0.oBF.o(ewr_0.oDD);
        if (list.contains(((fqD)Spell).d())) {
            return fqH.sVq;
        }
        if (euk_1.b(Spell)) {
            return fqH.sVl;
        }
        if (!euk_1.a(exP2, Spell)) {
            return fqH.sVk;
        }
        if (bl) {
            if (!euk_1.c(exP2, fqE2, Spell)) {
                return fqH.sUY;
            }
            if (!euk_1.b(exP2, fqE2, Spell)) {
                return fqH.sUZ;
            }
            if (!euk_1.a(exP2, fqE2, Spell)) {
                return fqH.sVa;
            }
            if (!euk_1.a(exP2, exx_2.rGQ, fqE2, Spell)) {
                return fqH.sVb;
            }
            if (!euk_1.d(exP2, fqE2, Spell)) {
                return fqH.sVc;
            }
        }
        if (!(fqH2 = exP2.fgh().c(exP2, fqE2, this.kvf.dGQ().bhJ())).isValid()) {
            return fqH2;
        }
        if (!this.kvf.dGQ().eA(exP2.Sn())) {
            return fqH.sVn;
        }
        ang_2 ang_22 = ((fqD)Spell).giF();
        if (ang_22 != null) {
            if (ang_22.b(exP2, null, fqE2, this.kvf)) {
                return fqH.sUS;
            }
            if (!this.a(exP2, (bmx_0)fqE2, ang_22)) {
                return fqH.sVk;
            }
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return fqH.sUS;
    }

    private boolean a(exP exP2, bmx_0 bmx_02, ang_2 ang_22) {
        Object object;
        Iterator<qu_0> iterator2;
        Collection collection = this.kvf.dGs();
        for (Iterator<qu_0> iterator2 : collection) {
            if (!ang_22.b(exP2, ((exP)((Object)iterator2)).aZw(), bmx_02, this.kvf)) continue;
            return true;
        }
        Collection<QQ> collection2 = this.kvf.bdh();
        iterator2 = collection2.iterator();
        while (iterator2.hasNext()) {
            object = (QQ)iterator2.next();
            if (!ang_22.b(exP2, object, bmx_02, this.kvf)) continue;
            return true;
        }
        iterator2 = this.kvf.fJz();
        if (iterator2 != null) {
            while (iterator2.hasNext()) {
                object = iterator2.next();
                if (!ang_22.b(exP2, object, bmx_02, this.kvf)) continue;
                return true;
            }
        }
        object = exP2.aZw();
        acd_1 acd_12 = new acd_1((acd_1)object);
        int n = bmx_02.eeT();
        int n2 = bmx_02.eeU();
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n; ++j) {
                int n3 = i + j;
                if (n3 < n2 || n3 > n) continue;
                acd_12.ap(i, j);
                if (ang_22.b(exP2, acd_12, bmx_02, this.kvf)) {
                    return true;
                }
                acd_12.C((acd_1)object);
                if (i == j) continue;
                acd_12.ap(-i, j);
                if (ang_22.b(exP2, acd_12, bmx_02, this.kvf)) {
                    return true;
                }
                acd_12.C((acd_1)object);
                acd_12.ap(i, -j);
                if (ang_22.b(exP2, acd_12, bmx_02, this.kvf)) {
                    return true;
                }
                acd_12.C((acd_1)object);
                acd_12.ap(-i, -j);
                if (ang_22.b(exP2, acd_12, bmx_02, this.kvf)) {
                    return true;
                }
                acd_12.C((acd_1)object);
            }
        }
        return false;
    }

    public void l(bsj_0 bsj_02) {
        this.kvf = bsj_02;
    }

    public void clear() {
        this.kvf = null;
    }
}

