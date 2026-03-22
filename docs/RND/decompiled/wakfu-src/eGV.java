/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class eGV
extends eGO {
    public eGV(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected int foe() {
        return etm_0.rnD.aHp();
    }

    @Override
    protected boolean x(QQ qQ) {
        return qQ.aeV() == this.foe() && ((eST)qQ).fIN() == 2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKH;
    }
}

