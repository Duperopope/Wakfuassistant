/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qT
 */
public class qt_1
extends go_0
implements gs_0 {
    public long VG = 0L;
    private final fi_1 VP = new qu_1(this);
    public static final int VQ = 8;

    @Override
    public fi_1 DM() {
        return this.VP;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.VG);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.VG = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.VG = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            qv_1 qv_12 = new qv_1(this);
            boolean bl = qv_12.b(byteBuffer, n);
            if (bl) {
                qv_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ae(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ae(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.VG).append('\n');
    }
}

