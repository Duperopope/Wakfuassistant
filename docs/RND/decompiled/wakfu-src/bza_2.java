/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectFloatProcedure
 */
import gnu.trove.procedure.TObjectFloatProcedure;
import java.util.HashMap;

/*
 * Renamed from bZa
 */
class bza_2
implements TObjectFloatProcedure<fsc> {
    final /* synthetic */ HashMap lBF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bza_2(byz_2 byz_22, HashMap hashMap) {
        this.lBF = hashMap;
    }

    public boolean b(fsc fsc2, float f2) {
        bzo_1 bzo_12;
        if (fsc2 == fsc.tbg) {
            fsc2 = f2 == 1.0f ? fsc.tbi : fsc.tbg;
            bzo_12 = (bzo_1)this.lBF.get((Object)(f2 == 1.0f ? fsc.tbi : fsc.tbg));
            if (bzo_12 != null) {
                bzo_12.bK(0.0f);
            }
        }
        if ((bzo_12 = (bzo_1)this.lBF.get((Object)fsc2)) != null) {
            bzo_12.bK(f2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, float f2) {
        return this.b((fsc)((Object)object), f2);
    }
}

