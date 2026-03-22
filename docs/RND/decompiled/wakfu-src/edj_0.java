/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eDJ
 */
public final class edj_0
extends eAH {
    private static final ArrayList<amz_1[]> pAE = new ArrayList();

    public edj_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAE;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        long l;
        if (!(object3 instanceof ffV)) {
            return -1;
        }
        if (!(object instanceof exP)) {
            return -1;
        }
        fhk fhk2 = object4 instanceof fhk ? (fhk)object4 : null;
        exP exP2 = (exP)object;
        ffV ffV2 = (ffV)object3;
        int n = ffV2.avr();
        boolean bl = edj_0.a(exP2, n, l = ffV2.LV(), fhk2);
        if (bl) {
            return 0;
        }
        return -1;
    }

    private static boolean a(exP exP2, int n, long l, @Nullable fhk fhk2) {
        return edj_0.b(exP2, n, l, fhk2) || edj_0.a(exP2, n, l);
    }

    private static boolean b(exP exP2, int n, long l2, @Nullable fhk fhk2) {
        fhk fhk3 = fhk2 != null ? fhk2 : exP2.dmL();
        fhe fhe2 = exP2.dnP();
        if (fhk3 == null || fhe2 == null) {
            return false;
        }
        return fhk3.fUd().values().stream().map(l -> fhe2.B((Long)l).orElse(null)).filter(Objects::nonNull).filter(ffV2 -> ffV2.LV() != l2).anyMatch(ffV2 -> ffV2.avr() == n);
    }

    private static boolean a(exP exP2, int n, long l) {
        fgd_0 fgd_02 = exP2.doC();
        if (fgd_02 == null) {
            return false;
        }
        ArrayList arrayList = fgd_02.pd(n);
        return arrayList.stream().anyMatch(ffV2 -> ffV2.LV() != l);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLz;
    }

    static {
        pAE.add(eAC.pwq);
    }
}

