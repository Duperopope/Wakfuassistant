/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xy
 */
public class xy_1
implements gs_0 {
    public int ajX = 0;
    public long ajB = 0L;
    public long ajY = 0L;
    public static final int ajZ = 20;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.ajX);
        byteBuffer.putLong(this.ajB);
        byteBuffer.putLong(this.ajY);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajX = byteBuffer.getInt();
        this.ajB = byteBuffer.getLong();
        this.ajY = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.ajX = 0;
        this.ajB = 0L;
        this.ajY = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 20;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ec(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ec(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.ajX).append('\n');
        stringBuilder.append(string).append("duration=").append(this.ajB).append('\n');
        stringBuilder.append(string).append("count=").append(this.ajY).append('\n');
    }
}

