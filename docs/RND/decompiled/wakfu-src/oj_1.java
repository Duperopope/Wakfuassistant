/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oJ
 */
public class oj_1
implements gs_0 {
    public long RC = 0L;
    public long RD = 0L;
    public static final int RE = 16;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.RC);
        byteBuffer.putLong(this.RD);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.RC = byteBuffer.getLong();
        this.RD = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.RC = 0L;
        this.RD = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.g(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void g(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lastConnectionDate=").append(this.RC).append('\n');
        stringBuilder.append(string).append("currentUsedQuota=").append(this.RD).append('\n');
    }
}

