/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flj
 */
public class flj_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDU;

    flj_0(fld_0 fld_02) {
        this.sDU = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDU.sDB.eL(byteBuffer);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.sDU.sDB.as(byteBuffer);
    }

    @Override
    public int DN() {
        return this.sDU.sDB.DN();
    }
}

