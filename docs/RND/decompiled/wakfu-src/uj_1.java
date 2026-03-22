/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uJ
 */
public class uj_1
implements gs_0 {
    public short adQ = 0;
    public short adR = 0;
    public short adS = 0;
    public static final int adV = 6;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.adQ);
        byteBuffer.putShort(this.adR);
        byteBuffer.putShort(this.adS);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adQ = byteBuffer.getShort();
        this.adR = byteBuffer.getShort();
        this.adS = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.adQ = 0;
        this.adR = 0;
        this.adS = 0;
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
        this.cm(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cm(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.adQ).append('\n');
        stringBuilder.append(string).append("x=").append(this.adR).append('\n');
        stringBuilder.append(string).append("y=").append(this.adS).append('\n');
    }
}

