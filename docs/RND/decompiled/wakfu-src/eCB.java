/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eCB
extends eak_0 {
    private static final ArrayList<amz_1[]> pzk = new ArrayList();
    private static final int pzl = 888;
    private String pvH;

    public eCB(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvH = ((anh_2)arrayList.get(0)).getValue();
    }

    protected ArrayList<amz_1[]> fnC() {
        return pzk;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return 0L;
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return 0L;
        }
        int n = 0;
        Collection collection = etu_02.fKc();
        for (exP exP2 : collection) {
            ers_0 ers_02 = exP2.doc();
            for (QD qD : ers_02) {
                fqU fqU2;
                erh_0 erh_02;
                qu_0 qu_02;
                if (!(qD instanceof erh_0) || (qu_02 = (erh_02 = (erh_0)qD).bbc()) == null || qu_02.Sn() != eyo_02.Sn() || (fqU2 = erh_02.fGk()) == null || !fqU2.gjH() && fqU2.gjy() != 888) continue;
                ++n;
            }
        }
        return n;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLZ;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pzk.add(eAC.pwr);
    }
}

