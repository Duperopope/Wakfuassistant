/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class cBu
extends cBz {
    private cBj mxB;

    public cBj eIr() {
        return this.mxB;
    }

    @Override
    public void a(cBj cBj2) {
        this.mxB = cBj2;
    }

    @Override
    public void nZ(long l) {
        this.B(cBw.mxC);
    }

    @Override
    public void S(ArrayList<cba_0> arrayList) {
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cCs cCs2) {
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cBj cBj2) {
        if (this.mxB == cBj2) {
            super.S(arrayList);
        }
    }

    @Override
    protected boolean eIq() {
        return true;
    }
}

