/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFv
 */
public class efv_0
extends eAH {
    private static final ArrayList<amz_1[]> pDg = new ArrayList();

    public efv_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pDg;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)eyo_02;
        long l = exP2.aqZ();
        Object t = fsf.gkM();
        if (t == null) {
            cKa.warn((Object)"[GD] Criterion IS_DUNGEON is used on a service with no WorldInfoManager!");
            return -1;
        }
        fse_0 fse_02 = ((fsf)t).mC(l);
        return fse_02 != null && fse_02.eqx() ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMP;
    }

    static {
        pDg.add(eAC.pwq);
    }
}

