/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class cBz
extends cBt<cbc_0> {
    @Override
    public void oa(long l) {
    }

    @Override
    public void nZ(long l) {
    }

    @Override
    public cba_0 eIw() {
        if (!this.isValid()) {
            return null;
        }
        for (int i = this.mxz.size() - 1; i >= 0; --i) {
            cba_0 cba_02 = ((cbc_0)this.mxz.get(i)).eIw();
            if (cba_02 == null) continue;
            return cba_02;
        }
        return null;
    }

    @Override
    public void S(ArrayList<cba_0> arrayList) {
        if (!this.isValid()) {
            return;
        }
        for (int i = this.mxz.size() - 1; i >= 0; --i) {
            ((cbc_0)this.mxz.get(i)).S(arrayList);
        }
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cCs cCs2) {
        if (!this.isValid()) {
            return;
        }
        for (int i = this.mxz.size() - 1; i >= 0; --i) {
            ((cbc_0)this.mxz.get(i)).a(arrayList, cCs2);
        }
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cBj cBj2) {
        if (!this.isValid()) {
            return;
        }
        for (int i = this.mxz.size() - 1; i >= 0; --i) {
            ((cbc_0)this.mxz.get(i)).a(arrayList, cBj2);
        }
    }

    @Override
    protected void c(cCz cCz2) {
        super.c(cCz2);
        cCz2.mAm = true;
        int n = this.mxz.size();
        for (int i = 0; i < n; ++i) {
            cCz2.mAq.add((long)((cbc_0)this.mxz.get(i)).d());
        }
    }

    @Override
    public void B(TObjectProcedure<cba_0> tObjectProcedure) {
        for (int i = this.mxz.size() - 1; i >= 0; --i) {
            ((cbc_0)this.mxz.get(i)).B(tObjectProcedure);
        }
    }
}

