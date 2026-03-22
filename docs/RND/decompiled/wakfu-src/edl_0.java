/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eDl
 */
public final class edl_0
extends eak_0 {
    private boolean pvJ;
    private static final ArrayList<amz_1[]> pAe = new ArrayList();

    public edl_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAe;
    }

    @Override
    public boolean bDo() {
        return false;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        throw new UnsupportedOperationException("Can't get Long value of a double");
    }

    @Override
    public double e(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        double d2 = 0.0;
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1.0;
        }
        exx_2 exx_22 = exx_2.rGi;
        exx_2 exx_23 = exx_2.rHp;
        int n = 0;
        int n2 = 0;
        if (eyo_02.a(exx_22)) {
            n = eyo_02.c(exx_22);
            n2 = eyo_02.d(exx_22);
        }
        if (eyo_02.a(exx_23)) {
            n += eyo_02.c(exx_23);
            n2 += eyo_02.d(exx_23);
        }
        if (n2 == 0) {
            return 0.0;
        }
        d2 = (float)n / (float)n2 * 100.0f;
        return (double)super.fny() * d2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLo;
    }

    static {
        pAe.add(eAC.pwr);
    }
}

