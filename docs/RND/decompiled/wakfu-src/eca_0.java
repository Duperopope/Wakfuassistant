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
 * Renamed from eCA
 */
public final class eca_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pzj = new ArrayList();

    public eca_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return 0L;
        }
        ewk_1 ewk_12 = etu_02.dHf();
        if (ewk_12 == null) {
            return 0L;
        }
        long l = ewk_12.bhW();
        return l;
    }

    protected ArrayList<amz_1[]> fnC() {
        return pzj;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLI;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pzj.add(eAC.pwq);
    }
}

