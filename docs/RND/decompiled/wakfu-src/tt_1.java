/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tt
 */
public class tt_1
implements gs_0 {
    public long YH = 0L;
    public static final int aaD = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.YH);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YH = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.YH = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bt(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bt(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("xp=").append(this.YH).append('\n');
    }
}

