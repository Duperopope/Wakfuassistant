/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class XY
implements TObjectProcedure<ya_0> {
    final /* synthetic */ XV bTw;

    XY(XV xV) {
        this.bTw = xV;
    }

    public boolean a(ya_0 ya_02) {
        try {
            ya_02.bog();
            ya_02.boj();
            if (ya_02.boh()) {
                this.bTw.bTt.add(ya_02.bTy);
            }
        }
        catch (Exception exception) {
            XV.bTo.error((Object)"", (Throwable)exception);
        }
        ya_02.boi();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ya_0)object);
    }
}

