/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from eAl
 */
@Criterion(description="Return 0 if the current player dungeon difficulty can be increased, or -1")
public class eal_0
extends eAH {
    private static final ArrayList<amz_1[]> pvN = new ArrayList();

    public eal_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvN;
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
        Optional<fte_0> optional = exP2.doa();
        return optional.filter(fte_0::erC).map(fte_02 -> 0).orElse(-1);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNf;
    }

    static {
        pvN.add(eAC.pwq);
    }
}

