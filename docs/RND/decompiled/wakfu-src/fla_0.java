/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fla
 */
public class fla_0
extends fkl_0 {
    final /* synthetic */ fkz_0 sDh;

    protected fla_0(fkz_0 fkz_02) {
        this.sDh = fkz_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDh.sDa = byteBuffer.getShort();
        this.sDh.sDf = byteBuffer.getInt();
        this.sDh.sDg = byteBuffer.getInt();
        this.sDh.sDe = byteBuffer.getShort();
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.sDh.sDa);
        byteBuffer.putInt(this.sDh.sDf);
        byteBuffer.putInt(this.sDh.sDg);
        byteBuffer.putShort(this.sDh.sDe);
    }

    @Override
    public int DN() {
        return 12;
    }
}

