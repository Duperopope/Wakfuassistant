/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eBR
extends eak_0 {
    private static final int pyc = -1;
    private static final ArrayList<amz_1[]> pyd = new ArrayList();
    private amu_1 pye;

    @Override
    protected List<amz_1[]> bDC() {
        return pyd;
    }

    public eBR(List<amx_1> list) {
        if (this.r(list) == 0 && list.size() == 1) {
            this.pye = (amu_1)list.get(0);
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            throw new amf_2("Criterion user should be a " + exP.class.getSimpleName() + ", not a " + eyo_02.getClass().getSimpleName());
        }
        exP exP2 = (exP)eyo_02;
        short s = (short)this.pye.d(object, object2, object3, object4);
        fgd_0 fgd_02 = exP2.doC();
        if (fgd_02 != null) {
            ffV ffV2 = (ffV)fgd_02.ai(s);
            return ffV2 == null ? -1L : (long)ffV2.avr();
        }
        fhk fhk2 = object4 instanceof fhk ? (fhk)object4 : exP2.dmL();
        fhe fhe2 = exP2.dnP();
        if (fhk2 == null || fhe2 == null) {
            return -1L;
        }
        ffV ffV3 = fhk2.a(fhe2, ffS.gj((byte)s));
        return ffV3 == null ? -1L : (long)ffV3.avr();
    }

    @Override
    public double e(Object object, Object object2, Object object3, Object object4) {
        throw new amf_2("pas de double value sur un crit\u00e8re de type GetDistanceBetweenUsers ");
    }

    @Override
    public Enum<ehq_0> bDq() {
        return ehq_0.pGl;
    }

    public String toString() {
        return "GetEquipment{m_equipmentPosition=" + String.valueOf(this.pye) + "}";
    }

    static {
        pyd.add(new amz_1[]{amz_1.cJy});
    }
}

