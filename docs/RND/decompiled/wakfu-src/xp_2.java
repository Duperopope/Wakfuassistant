/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xP
 */
public class xp_2
implements gs_0 {
    public long Rj = 0L;
    public static final int akE = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Rj);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Rj = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Rj = 0L;
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
        this.em(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void em(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("value=").append(this.Rj).append('\n');
    }
}

