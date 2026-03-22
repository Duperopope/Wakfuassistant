/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.jogamp.opengl.GL2;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from auS
 */
class aus_2
implements TObjectProcedure<aut_2> {
    final /* synthetic */ GL2 dfB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aus_2(GL2 gL2) {
        this.dfB = gL2;
    }

    public boolean a(aut_2 aut_22) {
        aul_2.a(this.dfB, aut_22, aut_22.dfC, aut_22.dfD);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aut_2)object);
    }
}

