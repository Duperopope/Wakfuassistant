/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eAW
 */
public class eaw_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwS = new ArrayList();
    private final int pwT = -1;

    @Override
    protected List<amz_1[]> bDC() {
        return pwS;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        foA foA2;
        exP exP2 = eAs.a(ehl_0.pFq, object, object2, object3, object4);
        if (exP2 == null) {
            throw new amf_2("Can't get pet gfx id from a null user");
        }
        fhe fhe2 = exP2.dnP();
        if (fhe2 == null) {
            return -1L;
        }
        fhk fhk2 = exP2.dmL();
        if (fhk2 == null) {
            return -1L;
        }
        Optional<ffV> optional = fhe2.B(fhk2.t(ffS.sgX));
        if (optional.isEmpty() || !optional.get().adO()) {
            return -1L;
        }
        fnr_0 fnr_02 = (fnr_0)optional.get().ead();
        if (fnp_0.k(fnr_02) && (foA2 = foC.sLW.aF(fnr_02.agK())) != null) {
            return Long.parseLong(foA2.aXE());
        }
        foA2 = foC.sLW.aE(fnr_02.geL().aVt());
        return foA2 == null ? (long)fnr_02.geL().aVt() : Long.parseLong(foA2.aXE());
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNp;
    }

    static {
        pwS.add(eAC.pwq);
    }
}

