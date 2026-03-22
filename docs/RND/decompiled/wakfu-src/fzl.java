/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class fzl
implements TObjectProcedure<fcu_1> {
    final /* synthetic */ fzk tFd;

    fzl(fzk fzk2) {
        this.tFd = fzk2;
    }

    public boolean h(fcu_1 fcu_12) {
        fzk fzk2 = fcu_12.getAppearance();
        if (fzk2.isChecked() && fzk2 != this.tFd) {
            fzk2.grs();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.h((fcu_1)object);
    }
}

