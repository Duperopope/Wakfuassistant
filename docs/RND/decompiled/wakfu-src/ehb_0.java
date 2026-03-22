/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eHb
 */
public final class ehb_0
extends eGO {
    public ehb_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected int foe() {
        return etm_0.rnD.aHp();
    }

    @Override
    protected boolean x(QQ qQ) {
        return qQ.aeV() == this.foe() && ((eST)qQ).fIN() == 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLb;
    }
}

