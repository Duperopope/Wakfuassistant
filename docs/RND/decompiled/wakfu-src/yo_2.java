/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yO
 */
public class yo_2
implements gs_0 {
    public long TL = 0L;
    public static final int amA = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.TL = 0L;
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
        this.eR(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eR(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
    }
}

