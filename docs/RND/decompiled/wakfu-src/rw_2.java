/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rw
 */
public class rw_2
implements gs_0 {
    public int WO = 0;
    public int WP = 0;
    public short WQ = 0;
    public long UB = 0L;
    public static final int WW = 18;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WO);
        byteBuffer.putInt(this.WP);
        byteBuffer.putShort(this.WQ);
        byteBuffer.putLong(this.UB);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.WO = byteBuffer.getInt();
        this.WP = byteBuffer.getInt();
        this.WQ = byteBuffer.getShort();
        this.UB = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.WO = 0;
        this.WP = 0;
        this.WQ = 0;
        this.UB = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 18;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aq(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aq(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("x=").append(this.WO).append('\n');
        stringBuilder.append(string).append("y=").append(this.WP).append('\n');
        stringBuilder.append(string).append("z=").append(this.WQ).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.UB).append('\n');
    }
}

