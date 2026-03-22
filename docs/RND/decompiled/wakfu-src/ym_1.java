/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ym
 */
public class ym_1
implements gs_0 {
    public long ZC = 0L;
    public int alB = 0;
    public short Xr = 0;
    public static final int alC = 14;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.ZC);
        byteBuffer.putInt(this.alB);
        byteBuffer.putShort(this.Xr);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.alB = byteBuffer.getInt();
        this.Xr = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.ZC = 0L;
        this.alB = 0;
        this.Xr = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            yn_1 yn_12 = new yn_1(this);
            boolean bl = yn_12.b(byteBuffer, n);
            if (bl) {
                yn_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 14;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.ZC).append('\n');
        stringBuilder.append(string).append("spellId=").append(this.alB).append('\n');
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
    }
}

