/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from avP
 */
class avp_2
implements TObjectProcedure<avr_2> {
    avp_2(avo_2 avo_22) {
    }

    public boolean a(avr_2 avr_22) {
        if (avr_22.dio != null) {
            avr_22.dio.bLA();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((avr_2)object);
    }
}

