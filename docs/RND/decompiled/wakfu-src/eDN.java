/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDN
extends eAH {
    private static final ArrayList<amz_1[]> pAI = new ArrayList();
    private amu_1 pAJ;
    private String pvH;

    @Override
    protected List<amz_1[]> bDC() {
        return pAI;
    }

    public eDN(ArrayList<amx_1> arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        this.pAJ = (amu_1)arrayList.get(0);
        this.pvH = ((anh_2)arrayList.get(1)).getValue().trim();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.pAJ == null) {
            return -1;
        }
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (!(eyo_02 instanceof ezi_0)) {
            return -1;
        }
        Object t = ((ezi_0)((Object)eyo_02)).dob();
        if (t == null) {
            return -1;
        }
        short s = GC.cu(this.pAJ.d(object, object2, object3, object4));
        if (s <= 0) {
            return -1;
        }
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            ezw ezw2 = t.Pm(n);
            if (ezw2 == null || ezw2.doG() != s) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pOd;
    }

    static {
        pAI.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

