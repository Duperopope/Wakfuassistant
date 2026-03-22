/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wp
 */
public class wp_1
implements gs_0 {
    public long ahl = 0L;
    public static final int ahm = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ahl);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ahl = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.ahl = 0L;
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
        this.dp(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dp(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lawId=").append(this.ahl).append('\n');
    }
}

