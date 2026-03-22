/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFe
 */
public class efe_0
extends eAH {
    private final TShortArrayList pCO = new TShortArrayList();
    private String pvH;
    private static final List<amz_1[]> pCP = new ArrayList<amz_1[]>();

    @Override
    protected List<amz_1[]> bDC() {
        return pCP;
    }

    public TShortArrayList fob() {
        return this.pCO;
    }

    public boolean fnF() {
        return "target".equals(this.pvH);
    }

    public efe_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        boolean bl = false;
        for (amx_1 amx_12 : arrayList) {
            if (!bl) {
                this.pvH = ((anh_2)amx_12).getValue();
                bl = true;
                continue;
            }
            short s = (short)((amu_1)amx_12).d(null, null, null, null);
            this.pCO.add(s);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        eyp eyp2 = eyo_02.doV();
        if (eyp2 == null) {
            return -1;
        }
        if (this.pCO.contains(eyp2.aWP())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGy;
    }

    static {
        pCP.add(new amz_1[]{amz_1.cJx, amz_1.cJA});
    }
}

