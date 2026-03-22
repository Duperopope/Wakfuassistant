/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eFZ
 */
public final class efz_0
extends eGb {
    public efz_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected boolean a(QQ qQ, Object object, Object object2, Object object3, Object object4) {
        if (qQ == null) {
            return false;
        }
        if (!(qQ instanceof eyo_0)) {
            return false;
        }
        qu_0 qu_02 = qQ.bci();
        if (qu_02 == null) {
            return false;
        }
        eyo_0 eyo_02 = eAs.a(this.pDT, object, object2, object4, object3);
        return eyo_02.dOo() == qu_02.Sn();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLw;
    }
}

