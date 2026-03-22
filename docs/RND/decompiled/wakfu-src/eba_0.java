/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eBA
 */
public class eba_0
extends eak_0 {
    private static final List<amz_1[]> pxF = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pxF;
    }

    public eba_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof amg_1 && object2 instanceof amg_1) {
            amg_1 amg_12 = (amg_1)object;
            amg_1 amg_13 = (amg_1)object2;
            return amf_1.c(amg_12, amg_13);
        }
        if (object instanceof amg_1 && object2 instanceof acd_1) {
            amg_1 amg_14 = (amg_1)object;
            acd_1 acd_12 = (acd_1)object2;
            return amf_1.c(amg_14, acd_12);
        }
        return -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGz;
    }
}

