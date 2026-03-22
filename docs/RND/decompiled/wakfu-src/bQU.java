/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bQU
implements TObjectProcedure<fao_0> {
    final /* synthetic */ LU kXJ;
    final /* synthetic */ bQT kXK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bQU(bQT bQT2, LU lU) {
        this.kXK = bQT2;
        this.kXJ = lU;
    }

    public boolean a(fao_0 fao_02) {
        if (this.kXK.kXI.kXH.cr(fao_02.eAs())) {
            this.kXJ.aTo();
        }
        if (this.kXK.kXI.kXH.cr(fao_02.eAq())) {
            this.kXJ.aTo();
        }
        if (this.kXK.kXI.kXH.cr(fao_02.eAt())) {
            this.kXJ.aTo();
        }
        if (this.kXK.kXI.kXH.cr(fao_02.eAr())) {
            this.kXJ.aTo();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fao_0)object);
    }
}

