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
 * Renamed from auR
 */
class aur_2
implements TObjectProcedure<aul_2> {
    final /* synthetic */ GL2 dfA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aur_2(GL2 gL2) {
        this.dfA = gL2;
    }

    public boolean a(aul_2 aul_22) {
        aul_22.g(this.dfA);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aul_2)object);
    }
}

