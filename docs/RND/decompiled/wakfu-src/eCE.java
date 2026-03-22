/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eCE
extends eak_0 {
    private static final ArrayList<amz_1[]> pzn = new ArrayList();
    private boolean pya;

    public eCE(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pzn;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 == null) {
            throw new amf_2("Pas de personnage trouv\u00e9 pour executer le critere");
        }
        return Wa.qf(eyo_02.bcD());
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLl;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pzn.add(eAC.pwq);
        pzn.add(eAC.pwr);
    }
}

