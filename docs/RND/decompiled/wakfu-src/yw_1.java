/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yw
 */
public class yw_1
implements gs_0 {
    public long adP = 0L;
    public short alQ = 0;
    public short Xr = 0;
    public int alR = 0;
    public long ajC = 0L;
    public static final int alS = 24;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adP);
        byteBuffer.putShort(this.alQ);
        byteBuffer.putShort(this.Xr);
        byteBuffer.putInt(this.alR);
        byteBuffer.putLong(this.ajC);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adP = byteBuffer.getLong();
        this.alQ = byteBuffer.getShort();
        this.Xr = byteBuffer.getShort();
        this.alR = byteBuffer.getInt();
        this.ajC = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.adP = 0L;
        this.alQ = 0;
        this.Xr = 0;
        this.alR = 0;
        this.ajC = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            yx_1 yx_12 = new yx_1(this);
            boolean bl = yx_12.b(byteBuffer, n);
            if (bl) {
                yx_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eG(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eG(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.adP).append('\n');
        stringBuilder.append(string).append("stateBaseId=").append(this.alQ).append('\n');
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
        stringBuilder.append(string).append("remainingDurationInMs=").append(this.alR).append('\n');
        stringBuilder.append(string).append("startDate=").append(this.ajC).append('\n');
    }
}

