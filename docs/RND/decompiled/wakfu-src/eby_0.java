/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eBY
 */
public abstract class eby_0
extends eak_0 {
    private static final List<amz_1[]> pyq = Collections.singletonList(amz_1.cJI);

    public eby_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        if (object3 == null) {
            return 0L;
        }
        if (!(object3 instanceof QD)) {
            pwx.error((Object)"CriterionContent attendu, mais pas de type RunningEffect. Ce crit\u00e8re ne peut s'utiliser que comme crit\u00e8re sur un effet.");
            return 0L;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            throw new amf_2("On essaie de compter les combattants en dehors d'un combat...");
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            pwx.error((Object)"Unable to compute target position");
            return 0L;
        }
        acd_1 acd_13 = eAs.d(false, object, object2, object4, object3);
        if (acd_13 == null) {
            pwx.error((Object)"Unable to compute caster position");
            return 0L;
        }
        Object FX = ((QD)object3).bba();
        if (FX == null) {
            return 0L;
        }
        aoh_1 aoh_12 = FX.aZS();
        if (aoh_12 == null) {
            pwx.error((Object)("Unable to compute effect areas in effet AOE : effect doesn't have one. EffectIf : " + FX.aZH()));
            return 0L;
        }
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        Collection<? extends qu_0> collection = this.a(etu_02, eyo_02);
        int n = 0;
        for (qu_0 qu_02 : collection) {
            acd_1 acd_14 = qu_02.aZw();
            boolean bl = aoh_12.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), acd_13.getX(), acd_13.getY(), acd_13.bdi(), acd_14.getX(), acd_14.getY(), acd_14.bdi());
            if (!bl) continue;
            ++n;
        }
        return n;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyq;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMU;
    }

    protected abstract Collection<? extends qu_0> a(etu_0<?> var1, eyo_0 var2);
}

