/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eCM
extends eak_0 {
    private boolean pvJ;
    private boolean pyU;
    private static final ArrayList<amz_1[]> pzv = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pzv;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCM(ArrayList<amx_1> arrayList) {
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
            return this.fny() * (long)((exP)((Object)eAG2)).dnG();
        }
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1L;
        }
        long l = ((exP)eyo_02).dnG();
        return this.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMT;
    }

    static {
        pzv.add(eAC.pwq);
        pzv.add(eAC.pwr);
    }
}

