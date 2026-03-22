/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class eGX
extends eGO {
    public eGX(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected int foe() {
        return etm_0.rnD.aHp();
    }

    @Override
    protected boolean x(QQ qQ) {
        return qQ.aeV() == this.foe() && ((eST)qQ).fIN() == 4;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKI;
    }
}

