/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from acp
 */
class acp_0
implements TObjectProcedure<acf> {
    private float cgb;
    private int caW;
    final TIntArrayList cgc = new TIntArrayList();

    acp_0() {
    }

    public boolean d(acf acf2) {
        if (acf2.bKI()) {
            acf2.S(this.cgb);
        }
        acf2.qF(this.caW);
        if (acf2.aKO()) {
            this.cgc.add(acf2.d());
        }
        return true;
    }

    void c(float f2, int n) {
        this.cgb = f2;
        this.caW = n;
        this.cgc.resetQuick();
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.d((acf)object);
    }
}

