/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBN
 */
public final class ebn_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxZ = new ArrayList();
    private final boolean pya;
    private final TIntArrayList pyb;

    public ebn_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pyb = new TIntArrayList();
        int n = arrayList.size();
        for (int i = 1; i < n; ++i) {
            this.pyb.add((int)((amu_1)arrayList.get(i)).d(null, null, null, null));
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pxZ;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        QE qE = eyo_02.baz();
        if (qE == null) {
            return -1L;
        }
        long l = 0L;
        int n = this.pyb.size();
        for (int i = 0; i < n; ++i) {
            int n2 = this.pyb.get(i);
            if (!qE.oL(n2)) continue;
            ++l;
        }
        return l;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLi;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pxZ.add(new amz_1[]{amz_1.cJx, amz_1.cJA});
    }
}

