/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from aFw
 */
class afw_1
implements TIntObjectProcedure<afx_1> {
    private int caW;
    final /* synthetic */ afs_1 dID;

    afw_1(afs_1 afs_12) {
        this.dID = afs_12;
    }

    public boolean a(int n, afx_1 afx_12) {
        afx_12.xM(this.caW);
        if (afx_12.caz() == afy_1.dIZ) {
            this.dID.xH(n);
        }
        return true;
    }

    public void xI(int n) {
        this.caW = n;
    }

    public String toString() {
        return "updateScript{m_deltaTime=" + this.caW + "}";
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (afx_1)object);
    }
}

