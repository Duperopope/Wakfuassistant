/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eBS
extends eak_0 {
    private static final ArrayList<amz_1[]> pyf = new ArrayList();

    public eBS(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pyf;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            pwx.error((Object)"Le critere ne peut pas etre utilis\u00e9 autre part que dans un contexte de combat");
            return -1L;
        }
        ewk_1 ewk_12 = etu_02.dHf();
        if (ewk_12 == null) {
            return -1L;
        }
        return ewk_12.bhJ();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKM;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pyf.add(amz_1.cJI);
    }
}

