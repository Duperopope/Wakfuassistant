/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sx
 */
public class sx_1
extends go_0
implements gs_0 {
    public int YL = 0;
    private final fi_1 YM = new sy_1(this);
    public static final int YN = 4;

    @Override
    public fi_1 DM() {
        return this.YM;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.YL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YL = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.YL = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            sz_1 sz_12 = new sz_1(this);
            boolean bl = sz_12.b(byteBuffer, n);
            if (bl) {
                sz_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aP(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("wakfuGauge=").append(this.YL).append('\n');
    }
}

