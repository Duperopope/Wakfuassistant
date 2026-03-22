/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Zf
 */
public final class zf_0
extends zb_0<yl_0> {
    public zf_0(String string) {
        super(string);
    }

    public yl_0 boY() {
        return new yl_0();
    }

    @Override
    public void a(yl_0 yl_02, ByteBuffer byteBuffer) {
        yl_02.bTN.b(byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat());
        int n = byteBuffer.get() & 0xFF;
        yl_02.bTN.clear();
        for (int i = 0; i < n; ++i) {
            double d2 = byteBuffer.getFloat();
            double d3 = byteBuffer.getFloat();
            acs_1 acs_12 = new acs_1(d2, d3);
            yl_02.bTN.b(acs_12);
            acs_12.b(byteBuffer.getFloat(), byteBuffer.getFloat());
            acs_12.c(byteBuffer.getFloat(), byteBuffer.getFloat());
        }
    }

    @Override
    public void a(fs_0 fs_02, String string) {
        acv_1 acv_12 = acx_1.gY(string);
        int n = acv_12.aVo();
        fs_02.b((float)acv_12.bXy());
        fs_02.b((float)acv_12.bXA());
        fs_02.b((float)acv_12.bXz());
        fs_02.b((float)acv_12.bXB());
        fs_02.g((byte)n);
        for (int i = 0; i < n; ++i) {
            acs_1 acs_12 = acv_12.wX(i);
            fs_02.b((float)acs_12.bXl());
            fs_02.b((float)acs_12.bXm());
            fs_02.b((float)acs_12.bXn());
            fs_02.b((float)acs_12.bXo());
            fs_02.b((float)acs_12.bXp());
            fs_02.b((float)acs_12.bXq());
        }
    }

    @Override
    public /* synthetic */ Yh boU() {
        return this.boY();
    }
}

