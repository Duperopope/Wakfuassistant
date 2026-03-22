/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flm
 */
public class flm_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDX;

    flm_0(fld_0 fld_02) {
        this.sDX = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDX.sDz.gdS();
        this.sDX.sDz.gp(byteBuffer);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.sDX.sDz.go(byteBuffer);
    }

    @Override
    public int DN() {
        return this.sDX.sDz.gdT();
    }
}

