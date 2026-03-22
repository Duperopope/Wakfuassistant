/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ss
 */
public class ss_1
implements gs_0 {
    public short YB = (short)-1;
    public static final int YC = 2;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.YB);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YB = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.YB = (short)-1;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aM(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aM(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("availableTitle=").append(this.YB).append('\n');
    }
}

