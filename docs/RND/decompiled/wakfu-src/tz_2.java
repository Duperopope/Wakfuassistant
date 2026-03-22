/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tz
 */
public class tz_2
implements gs_0 {
    public int aaQ = 0;
    public byte aaR = 0;
    public static final int aaS = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aaQ);
        byteBuffer.put(this.aaR);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aaQ = byteBuffer.getInt();
        this.aaR = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.aaQ = 0;
        this.aaR = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10045002) {
            ta_2 ta_22 = new ta_2(this);
            boolean bl = ta_22.b(byteBuffer, n);
            if (bl) {
                ta_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bx(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bx(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("refId=").append(this.aaQ).append('\n');
        stringBuilder.append(string).append("bindId=").append(this.aaR).append('\n');
    }
}

