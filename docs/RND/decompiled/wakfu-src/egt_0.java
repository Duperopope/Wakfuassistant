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
 * Renamed from eGT
 */
public final class egt_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pEU = new ArrayList();
    public static final String pEV = "forTeam";
    public static final String pEW = "forOwner";
    private final String pEX;
    private final String pEY;

    @Override
    protected List<amz_1[]> bDC() {
        return pEU;
    }

    public egt_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pEX = ((anh_2)arrayList.get(0)).getValue();
        this.pEY = ((anh_2)arrayList.get(1)).getValue();
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return 0L;
        }
        long l = 0L;
        for (QQ qQ : etu_02.bai().bdh()) {
            if (!this.b(qQ, object, object2, object3, object4)) continue;
            ++l;
        }
        return this.fny() * l;
    }

    private boolean b(QQ qQ, Object object, Object object2, Object object3, Object object4) {
        if (qQ.aeV() != etm_0.rnG.aHp()) {
            return false;
        }
        eyo_0 eyo_02 = eAs.a(this.pEX, object, object2, object4, object3);
        if (this.pEY.equalsIgnoreCase(pEV) && eyo_02 != null) {
            return qQ.bcP() == eyo_02.bcP();
        }
        if (this.pEY.equalsIgnoreCase(pEW) && eyo_02 != null) {
            return qQ.bci() != null && qQ.bci().Sn() == eyo_02.Sn();
        }
        return false;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMt;
    }

    static {
        pEU.add(new amz_1[]{amz_1.cJx, amz_1.cJx});
    }
}

