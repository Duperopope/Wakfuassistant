/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCr
 */
public class ecr_0
extends eak_0 {
    private boolean pvJ;
    private boolean pyU;
    private static final ArrayList<amz_1[]> pyV = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pyV;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecr_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s != 1) {
            return;
        }
        String string = ((anh_2)arrayList.get(0)).getValue();
        this.pvJ = string.equalsIgnoreCase("target");
        if (string.equals("eventTarget")) {
            this.pyU = true;
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.pyU) {
            eAG eAG2;
            if (object4 instanceof ehn_0) {
                eAG2 = ((ehn_0)object4).foj();
            } else if (object3 instanceof ehn_0) {
                eAG2 = ((ehn_0)object3).foj();
            } else {
                return -1L;
            }
            if (!(eAG2 instanceof exP)) {
                return -1L;
            }
            return this.fny() * (long)((exP)((Object)eAG2)).cmL();
        }
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        long l = exP2.cmL();
        return this.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGO;
    }

    static {
        pyV.add(eAC.pwq);
        pyV.add(eAC.pwr);
    }
}

