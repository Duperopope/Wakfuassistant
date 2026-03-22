/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oF
 */
public class of_1
extends go_0
implements gs_0 {
    public byte Rv = 0;
    private final fi_1 Rw = new og_1(this);
    public static final int Rx = 1;

    @Override
    public fi_1 DM() {
        return this.Rw;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Rv);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Rv = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.Rv = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.e(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void e(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.Rv).append('\n');
    }
}

