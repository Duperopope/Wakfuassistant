/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFf
extends eAH {
    private boolean pvJ = false;
    private static final ArrayList<amz_1[]> pCQ = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCQ;
    }

    public eFf(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                this.pvJ = false;
                break;
            }
            case 1: {
                String string = ((anh_2)arrayList.get(0)).getValue();
                if (!string.equalsIgnoreCase("target")) break;
                this.pvJ = true;
            }
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (!(eyo_02 instanceof eza_0)) {
            return -1;
        }
        eza_0 eza_02 = (eza_0)((Object)eyo_02);
        if (eza_02.buW()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIT;
    }

    static {
        pCQ.add(amz_1.cJI);
        pCQ.add(new amz_1[]{amz_1.cJx});
    }
}

