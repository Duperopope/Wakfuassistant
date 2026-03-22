/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vR
 */
public class vr_2
implements gs_0 {
    public int WB = 0;
    public long YH = 0L;
    public static final int agm = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WB);
        byteBuffer.putLong(this.YH);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        this.YH = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.WB = 0;
        this.YH = 0L;
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
        this.cW(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cW(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.WB).append('\n');
        stringBuilder.append(string).append("xp=").append(this.YH).append('\n');
    }
}

