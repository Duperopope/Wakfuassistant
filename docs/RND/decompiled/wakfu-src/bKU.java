/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class bKU
extends fpX<bKT> {
    private static final bKU kqY = new bKU();

    public static bKU eca() {
        return kqY;
    }

    private bKU() {
    }

    public boolean t(TObjectProcedure<bKT> tObjectProcedure) {
        return this.sRB.forEachValue(tObjectProcedure);
    }
}

