/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eCD
extends eak_0 {
    private static final ArrayList<amz_1[]> pzm = new ArrayList();
    private boolean pya;

    public eCD(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pzm;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 == null) {
            throw new amf_2("Pas de personnage trouv\u00e9 pour executer le critere");
        }
        return Wa.qf(eyo_02.bcC());
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLk;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pzm.add(eAC.pwq);
        pzm.add(eAC.pwr);
    }
}

