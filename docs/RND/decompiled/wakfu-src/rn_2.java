/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rN
 */
public class rn_2
extends go_0
implements gs_0 {
    public int WO = 0;
    public int WP = 0;
    public short WQ = 0;
    public long UB = 0L;
    private final fi_1 Xv = new ro_2(this);
    public static final int Xw = 18;

    @Override
    public fi_1 DM() {
        return this.Xv;
    }

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
        this.ay(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ay(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("x=").append(this.WO).append('\n');
        stringBuilder.append(string).append("y=").append(this.WP).append('\n');
        stringBuilder.append(string).append("z=").append(this.WQ).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.UB).append('\n');
    }
}

