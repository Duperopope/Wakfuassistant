/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eCq
 */
public class ecq_0
extends eak_0 {
    private static final List<amz_1[]> pyT = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pyT;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecq_0(ArrayList<amx_1> arrayList) {
    }

    public ecq_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2;
        if (object == null) {
            if (!(object3 instanceof ehe_0)) throw new amf_2("on cherche le nombre de kamas d'un user null");
            exP2 = ((ehe_0)object3).fog();
            return exP2.dmi();
        } else {
            if (!(object instanceof exP)) {
                throw new amf_2("on cherche le nombre de kamas d'autre chose qu'un character");
            }
            exP2 = (exP)object;
        }
        return exP2.dmi();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGu;
    }
}

