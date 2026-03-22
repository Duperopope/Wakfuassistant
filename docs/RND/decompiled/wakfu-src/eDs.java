/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eDs
extends eak_0 {
    private static final ArrayList<amz_1[]> pAl = new ArrayList();

    public eDs(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAl;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return 0L;
        }
        eNl eNl2 = (eNl)ero_02.bbf();
        if (eNl2 == null) {
            return 0L;
        }
        if (!(eNl2 instanceof fqU)) {
            return 0L;
        }
        return ((fqU)eNl2).gjy();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pML;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAl.add(eAC.pwq);
    }
}

