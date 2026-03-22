/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wn
 */
public class wn_2
implements gs_0 {
    public short ahg = 0;
    public int ahh = 0;
    public static final int ahi = 6;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.ahg);
        byteBuffer.putInt(this.ahh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ahg = byteBuffer.getShort();
        this.ahh = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ahg = 0;
        this.ahh = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dn(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dn(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("titleId=").append(this.ahg).append('\n');
        stringBuilder.append(string).append("nbMandate=").append(this.ahh).append('\n');
    }
}

