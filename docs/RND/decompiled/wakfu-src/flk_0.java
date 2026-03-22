/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flk
 */
public class flk_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDV;

    flk_0(fld_0 fld_02) {
        this.sDV = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDV.sDy.clear();
        this.sDV.sDy.eL(byteBuffer);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.sDV.sDy.as(byteBuffer);
    }

    @Override
    public int DN() {
        return this.sDV.sDy.DN();
    }
}

