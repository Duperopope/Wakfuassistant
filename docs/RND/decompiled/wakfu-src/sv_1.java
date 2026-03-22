/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sv
 */
public class sv_1
extends go_0
implements gs_0 {
    public long YH = 0L;
    private final fi_1 YI = new sw_2(this);
    public static final int YJ = 8;

    @Override
    public fi_1 DM() {
        return this.YI;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.YH);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YH = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.YH = 0L;
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
        this.aO(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aO(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("xp=").append(this.YH).append('\n');
    }
}

