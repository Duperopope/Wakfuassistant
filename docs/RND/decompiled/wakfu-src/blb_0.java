/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from blB
 */
class blb_0
implements TObjectProcedure<fdt_0> {
    blb_0() {
    }

    public boolean a(fdt_0 fdt_02) {
        bly_0.ive.add(new bsu_0(fdt_02));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fdt_0)object);
    }
}

