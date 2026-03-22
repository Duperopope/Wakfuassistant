/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xN
 */
public class xn_2
implements gs_0 {
    public byte aal = 0;
    public long Rj = 0L;
    public static final int aky = 9;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.aal);
        byteBuffer.putLong(this.Rj);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aal = byteBuffer.get();
        this.Rj = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.aal = 0;
        this.Rj = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.el(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void el(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("varId=").append(this.aal).append('\n');
        stringBuilder.append(string).append("value=").append(this.Rj).append('\n');
    }
}

