/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aWU
 */
class awu_0
implements TObjectProcedure<awv_0> {
    final /* synthetic */ awt_0 hvY;

    awu_0(awt_0 awt_02) {
        this.hvY = awt_02;
    }

    public boolean a(awv_0 awv_02) {
        awv_02.a(this.hvY);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((awv_0)object);
    }
}

