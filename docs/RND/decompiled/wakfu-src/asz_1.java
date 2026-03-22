/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from asz
 */
class asz_1
implements TIntObjectProcedure<ass_1> {
    private int cYe;

    asz_1() {
    }

    public boolean b(int n, ass_1 ass_12) {
        if (ass_12.aOY()) {
            ass_12.qF(this.cYe);
        } else {
            ass_12.clear();
            ast_1.bJG().up(n);
        }
        return true;
    }

    public void uq(int n) {
        this.cYe = n;
    }

    public String toString() {
        return "UpdateEffect{m_timeIncrement=" + this.cYe + "}";
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.b(n, (ass_1)object);
    }
}

