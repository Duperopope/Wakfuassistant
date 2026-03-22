/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFU
 */
@Criterion(description="Check if the targetted player is a new player (@see Mentorat)")
public final class efu_0
extends eAH {
    private static final ArrayList<amz_1[]> pDF = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDF;
    }

    public efu_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof fjm)) {
            return -1;
        }
        return eIA.pH(((fjm)((Object)eyo_02)).Xi()) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMf;
    }

    static {
        pDF.add(eAC.pwq);
    }
}

