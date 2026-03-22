/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class cBw
extends cBz {
    public static final TObjectProcedure<cba_0> mxC = new cBx();
    private cCm mxD;
    private boolean mxE;
    private cCk mxF;

    @Override
    public void a(cCk cCk2) {
        this.mxF = cCk2;
    }

    public cCm eIt() {
        return this.mxD;
    }

    @Override
    public void a(cCm cCm2) {
        this.mxD = cCm2;
    }

    public void jF(boolean bl) {
        this.mxE = bl;
    }

    @Override
    public void oa(long l) {
    }

    @Override
    public void nZ(long l) {
        this.B(mxC);
    }

    private boolean b(cCs cCs2) {
        if (this.mxD != cCs2.eJw()) {
            return false;
        }
        if (this.mxE != cCs2.ckv()) {
            return false;
        }
        if (this.mxF == null) {
            return true;
        }
        return this.mxF.c(cCs2);
    }

    @Override
    public void S(ArrayList<cba_0> arrayList) {
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cCs cCs2) {
        if (this.b(cCs2)) {
            super.S(arrayList);
        }
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cBj cBj2) {
    }
}

