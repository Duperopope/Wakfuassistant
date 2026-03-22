/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCs
 */
public class ecs_0
extends eak_0 {
    private int euz;
    private static final ArrayList<amz_1[]> pyW = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pyW;
    }

    public ecs_0() {
    }

    public ecs_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.euz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        } else if (s == 1) {
            this.euz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof fic_0)) {
            return 0L;
        }
        fic_0 fic_02 = (fic_0)object;
        fia_0 fia_02 = fic_02.dmD();
        return fia_02.VV(this.euz);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLB;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pyW.add(amz_1Array);
    }
}

