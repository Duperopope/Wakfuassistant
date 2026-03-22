/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uh
 */
public class uh_1
implements gs_0 {
    public int Th = 0;
    public int aaw = 0;
    public int aax = 0;
    public static final int acB = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Th);
        byteBuffer.putInt(this.aaw);
        byteBuffer.putInt(this.aax);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Th = byteBuffer.getInt();
        this.aaw = byteBuffer.getInt();
        this.aax = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Th = 0;
        this.aaw = 0;
        this.aax = 0;
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
        this.bT(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bT(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("min=").append(this.aaw).append('\n');
        stringBuilder.append(string).append("max=").append(this.aax).append('\n');
    }
}

