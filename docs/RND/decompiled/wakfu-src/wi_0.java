/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from Wi
 */
class wi_0
implements TObjectProcedure<ub_0> {
    final /* synthetic */ ByteBuffer bMR;
    final /* synthetic */ wh_0 bMS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    wi_0(wh_0 wh_02, ByteBuffer byteBuffer) {
        this.bMS = wh_02;
        this.bMR = byteBuffer;
    }

    public boolean b(ub_0 ub_02) {
        this.bMR.put((byte)ub_02.ordinal());
        wc_0 wc_02 = this.bMS.bMM.c(ub_02);
        this.bMR.put((byte)wc_02.bll());
        this.bMR.put((byte)wc_02.blm());
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ub_0)((Object)object));
    }
}

