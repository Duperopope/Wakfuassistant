/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xk
 */
public class xk_1
implements gs_0 {
    public long ajw = 0L;
    public int ajx = 0;
    public static final int ajy = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ajw);
        byteBuffer.putInt(this.ajx);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajw = byteBuffer.getLong();
        this.ajx = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ajw = 0L;
        this.ajx = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dS(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dS(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("applicationDate=").append(this.ajw).append('\n');
        stringBuilder.append(string).append("climateBonusId=").append(this.ajx).append('\n');
    }
}

