/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCY
 */
public class ecy_0
extends eak_0 {
    private amu_1 pvz;
    protected String pvH;
    private static final ArrayList<amz_1[]> pzF = new ArrayList();

    public int axA() {
        return this.pvz != null && this.pvz.bDp() && this.pvz.bDo() ? (int)this.pvz.d(null, null, null, null) : -1;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzF;
    }

    public ecy_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 0) {
            this.pvz = (amu_1)arrayList.get(0);
        }
        if (by == 1) {
            this.pvz = (amu_1)arrayList.get(0);
            this.pvH = ((anh_2)arrayList.get(1)).getValue();
        }
        if (by == 2) {
            this.pvz = null;
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        fqP<? extends fqE> fqP2;
        fqE fqE2 = null;
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (this.pvz == null && object3 instanceof fqE) {
            fqE2 = (fqE)object3;
        } else {
            if (!(eyo_02 instanceof exP)) {
                throw new amf_2("Le user du crit\u00e8re n'est pas un personnage ou l'id n'est pas un entier");
            }
            fqP2 = ((exP)eyo_02).dkB();
            if (fqP2 == null) {
                return 0L;
            }
            fqE2 = (fqE)fqP2.pc((int)this.pvz.d(object, object2, object3, object4));
        }
        if (eyo_02 instanceof exP && eyo_02.a(eyp_0.pmO) && fqE2 != null) {
            fqP2 = (exP)eyo_02;
            return frh.a(fqE2.avr(), ((exP)((Object)fqP2)).dnM(), (exP)((Object)fqP2));
        }
        return fqE2 != null ? super.fny() * (long)fqE2.cmL() : 0L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFG;
    }

    static {
        pzF.add(eAC.pwt);
        pzF.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
        pzF.add(eAC.pwq);
    }
}

