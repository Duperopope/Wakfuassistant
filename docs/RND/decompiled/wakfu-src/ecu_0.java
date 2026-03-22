/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCu
 */
public class ecu_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyY = new ArrayList();
    private amu_1 pyZ;
    private amu_1 pza;

    @Override
    protected List<amz_1[]> bDC() {
        return pyY;
    }

    public ecu_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pza = (amu_1)arrayList.get(0);
            this.pyZ = null;
        }
        if (s == 1) {
            this.pyZ = null;
            this.pza = null;
        }
        if (s == 2) {
            this.pyZ = (amu_1)arrayList.get(1);
            this.pza = (amu_1)arrayList.get(0);
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            throw new amf_2("On compte les monstres hors combat");
        }
        short s = (short)(this.pyZ == null ? -1L : this.pyZ.d(object, object2, object3, object4));
        byte by = (byte)(this.pza == null ? -1L : this.pza.d(object, object2, object3, object4));
        long l = etu_02.e(s, by);
        return this.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFE;
    }

    static {
        pyY.add(eAC.pwt);
        pyY.add(eAC.pwq);
        pyY.add(new amz_1[]{amz_1.cJy, amz_1.cJy});
    }
}

