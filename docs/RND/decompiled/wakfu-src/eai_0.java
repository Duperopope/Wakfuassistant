/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAi
 */
public class eai_0
extends eAH {
    private static final ArrayList<amz_1[]> pvK = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pvK;
    }

    public eai_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null || !(object2 instanceof eza_0)) {
            return -1;
        }
        if (object == null || !(object instanceof ezz)) {
            return -1;
        }
        ezz ezz2 = (ezz)object;
        eza_0 eza_02 = (eza_0)object2;
        if (ezz2.b(eza_02) && eza_02.c(ezz2)) {
            return 0;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGG;
    }

    static {
        pvK.add(amz_1.cJI);
    }
}

