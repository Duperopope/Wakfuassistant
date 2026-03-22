/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

final class bDx
implements TObjectProcedure<exP> {
    private boolean hZs = true;
    private final int jKm;

    bDx(int n) {
        this.jKm = n;
    }

    public boolean u(exP exP2) {
        if (exP2.cmL() >= this.jKm) {
            return true;
        }
        this.hZs = false;
        return false;
    }

    public boolean isValid() {
        return this.hZs;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.u((exP)object);
    }
}

