/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eBH
extends eak_0 {
    private static final ArrayList<amz_1[]> pxN = new ArrayList();
    private amu_1 pxO;
    private eBI pxP;

    @Override
    protected List<amz_1[]> bDC() {
        return pxN;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eBH(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        String string = ((anh_2)arrayList.get(0)).getValue().toLowerCase();
        if (string.equals("mine")) {
            this.pxP = eBI.pxQ;
        } else if (string.equals("allies")) {
            this.pxP = eBI.pxR;
        } else if (string.equals("ennemies")) {
            this.pxP = eBI.pxS;
        } else if (string.equals("all")) {
            this.pxP = eBI.pxT;
        } else {
            throw new amf_2("param\u00e8tre invalude dans une " + this.getClass().getSimpleName() + " : '" + string + "'");
        }
        this.pxO = (amu_1)arrayList.get(1);
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
            pwx.error((Object)("CriterionContent attendu, mais il est de type <" + String.valueOf(object3.getClass()) + "> au lieu de RunningEffect. Ce crit\u00e8re ne peut s'utiliser que comme crit\u00e8re sur un effet."));
            return 0L;
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            pwx.error((Object)"Unable to compute target position");
            return 0L;
        }
        eyo_0 eyo_02 = eAs.b(false, object, object2, object3, object4);
        if (eyo_02 == null && this.pxP != eBI.pxT) {
            return 0L;
        }
        acd_1 acd_13 = eAs.d(false, object, object2, object4, object3);
        if (acd_13 == null) {
            pwx.error((Object)"Unable to compute caster position");
            return 0L;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            throw new amf_2("On essaie de compter les zones d'effet en dehors d'un combat...");
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
        long l = this.pxO.d(object, object2, object3, object4);
        int n = 0;
        for (QQ qQ : etu_02.bai().bdh()) {
            if (qQ == null || qQ.bcw() != l) continue;
            boolean bl = false;
            switch (this.pxP.ordinal()) {
                case 2: {
                    bl = qQ.bcP() != eyo_02.bcP();
                    break;
                }
                case 1: {
                    bl = qQ.bcP() == eyo_02.bcP();
                    break;
                }
                case 0: {
                    bl = qQ.bci() == eyo_02;
                    break;
                }
                case 3: {
                    bl = true;
                }
            }
            if (!bl) continue;
            acd_1 acd_14 = qQ.aZw();
            boolean bl2 = aoh_12.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), acd_13.getX(), acd_13.getY(), acd_13.bdi(), acd_14.getX(), acd_14.getY(), acd_14.bdi());
            if (!bl2) continue;
            ++n;
        }
        return super.fny() * (long)n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKd;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy};
        pxN.add(amz_1Array);
    }
}

