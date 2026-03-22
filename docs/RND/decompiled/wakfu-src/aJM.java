/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class aJM
implements TObjectProcedure<aJI> {
    aJM() {
    }

    public boolean a(aJI aJI2) {
        aJI aJI3 = aJI2;
        aJI3.chO();
        ZM.bqw().d(aJI2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((aJI)object);
    }
}

