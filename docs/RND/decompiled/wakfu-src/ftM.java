/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;

class ftM
implements TObjectProcedure<ftH> {
    final /* synthetic */ ByteBuffer tgw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ftM(ftJ ftJ2, ByteBuffer byteBuffer) {
        this.tgw = byteBuffer;
    }

    public boolean b(ftH ftH2) {
        ftH2.gD(this.tgw);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ftH)object);
    }
}

