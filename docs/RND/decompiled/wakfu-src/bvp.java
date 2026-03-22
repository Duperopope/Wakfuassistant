/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class bvp
implements TObjectProcedure<ezv_1> {
    final /* synthetic */ ArrayList jtg;
    final /* synthetic */ bvk jth;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvp(bvk bvk2, ArrayList arrayList) {
        this.jth = bvk2;
        this.jtg = arrayList;
    }

    public boolean b(ezv_1 ezv_12) {
        eyr_2 eyr_22 = ezq.prB.Pe(ezv_12.tJ());
        boolean bl = buQ.a(ezv_12, eyr_22, this.jth.iod);
        if (bl) {
            buT buT2;
            uw_0 uw_02 = buQ.b(ezv_12, eyr_22, this.jth.iod);
            if (ue_0.bjV().b(uw_02) && (buT2 = bvf.jrC.FD(ezv_12.tJ())) != null) {
                this.jtg.add(buT2);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ezv_1)object);
    }
}

