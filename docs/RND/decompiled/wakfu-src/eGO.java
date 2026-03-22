/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

abstract class eGO
extends eak_0 {
    private static final ArrayList<amz_1[]> pEQ = new ArrayList();
    protected boolean pER = true;
    protected String pvH;

    @Override
    protected List<amz_1[]> bDC() {
        return pEQ;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    eGO() {
    }

    eGO(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pER = true;
        }
        if (s == 1) {
            this.pER = false;
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        etu_0<?> etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            etu_02 = eAs.m(object, object4);
        }
        if (etu_02 == null) {
            throw new amf_2("On essaie de compter les pi\u00e8ges en dehors d'un combat...");
        }
        eyo_0 eyo_02 = null;
        if (!this.pER) {
            if (this.pvH == null || this.pvH.equalsIgnoreCase("caster")) {
                eyo_02 = eAs.b(false, object, object2, object4, object3);
            } else if (this.pvH.equalsIgnoreCase("target")) {
                eyo_02 = eAs.b(true, object, object2, object4, object3);
            } else if (this.pvH.equalsIgnoreCase("triggeringCaster")) {
                var7_7 = eAs.aS(object3);
                if (var7_7 instanceof eyo_0) {
                    eyo_02 = (eyo_0)var7_7;
                }
            } else if (this.pvH.equalsIgnoreCase("triggeringTarget")) {
                var7_7 = eAs.aR(object3);
                if (var7_7 instanceof eyo_0) {
                    eyo_02 = (eyo_0)var7_7;
                }
            } else if (this.pvH.equalsIgnoreCase("casterController")) {
                var7_7 = eAs.b(false, object, object2, object4, object3);
                eyo_02 = etu_02.qJ(var7_7.dOo());
            }
        }
        long l = 0L;
        for (QQ qQ : etu_02.bai().bdh()) {
            if (!this.pER && !this.d(eyo_02, qQ) || !this.x(qQ)) continue;
            ++l;
        }
        return super.fny() * l;
    }

    private boolean d(eyo_0 eyo_02, QQ qQ) {
        return eyo_02 != null && qQ.bci() != null && qQ.bci().Sn() == eyo_02.Sn();
    }

    protected boolean x(QQ qQ) {
        return qQ.aeV() == this.foe();
    }

    protected abstract int foe();

    static {
        pEQ.add(eAC.pwq);
        pEQ.add(eAC.pwr);
    }
}

