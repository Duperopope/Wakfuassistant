/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from avQ
 */
class avq_2
implements TObjectProcedure<avr_2> {
    final /* synthetic */ avo_2 dij;

    avq_2(avo_2 avo_22) {
        this.dij = avo_22;
    }

    public boolean a(avr_2 avr_22) {
        avr_22.din = this.dij.dig;
        avr_22.dio = null;
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((avr_2)object);
    }
}

