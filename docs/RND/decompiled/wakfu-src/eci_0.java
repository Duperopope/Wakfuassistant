/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCi
 */
public class eci_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyM = new ArrayList();
    private boolean pyN;

    @Override
    protected List<amz_1[]> bDC() {
        return pyM;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eci_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pyN = by == 1 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("hhmm");
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        ux_0 ux_02 = ue_0.bjV().bjc();
        if (this.pyN) {
            return ux_02.bjE() * 100 + ux_02.bjF();
        }
        return ux_02.bjE();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFC;
    }

    static {
        pyM.add(amz_1.cJI);
        pyM.add(new amz_1[]{amz_1.cJx});
    }
}

