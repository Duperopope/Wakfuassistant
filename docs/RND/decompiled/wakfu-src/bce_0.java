/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bCE
 */
class bce_0
implements TObjectProcedure<ni_1> {
    private final int jJE;
    private final int jJF;
    private final short jJG;
    private boolean jJH;

    bce_0(int n, int n2, short s) {
        this.jJE = n;
        this.jJF = n2;
        this.jJG = s;
    }

    public boolean b(ni_1 ni_12) {
        if (ni_12.bcC() != this.jJE || ni_12.bcD() != this.jJF || ni_12.bcE() != this.jJG) {
            return true;
        }
        if (!ni_12.beq()) {
            return true;
        }
        this.jJH = true;
        return false;
    }

    public boolean dQB() {
        return this.jJH;
    }

    public String toString() {
        return "CheckCellBlockedProcedure{cellBlocked=" + this.jJH + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ni_1)object);
    }
}

