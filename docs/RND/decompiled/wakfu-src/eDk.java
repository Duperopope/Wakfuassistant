/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDk
extends eak_0 {
    private static final ArrayList<amz_1[]> pAd = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAd;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eDk(ArrayList<amx_1> arrayList) {
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (exP2 == null) {
            throw new amf_2("Unable to retrieve title of character null");
        }
        if (!(object instanceof frt_0)) {
            throw new amf_2("Unable to retrieve title of character who cannot hold titles");
        }
        return super.fny() * (long)((frt_0)((Object)exP2)).dpA();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJk;
    }

    static {
        pAd.add(amz_1.cJI);
    }
}

