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
 * Renamed from eFc
 */
public class efc_0
extends eAH {
    private final TShortArrayList pCJ = new TShortArrayList();
    private boolean pvJ = false;
    private static final ArrayList<amz_1[]> pCK = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCK;
    }

    public TShortArrayList fnZ() {
        return this.pCJ;
    }

    public boolean fnF() {
        return this.pvJ;
    }

    public efc_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        for (amx_1 amx_12 : arrayList) {
            String string = ((anh_2)amx_12).getValue();
            if (string.equalsIgnoreCase("target")) {
                this.pvJ = true;
                continue;
            }
            if (string.equalsIgnoreCase("caster")) {
                this.pvJ = false;
                continue;
            }
            eym eym2 = eym.rN(string);
            if (eym2 == null) continue;
            this.pCJ.add(eym2.aWP());
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        if (this.pCJ.contains(exP2.doV().aWP())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFN;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJB};
        pCK.add(amz_1Array);
    }
}

