/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from st
 */
public class st_2
extends go_0
implements gs_0 {
    public boolean YD = true;
    private final fi_1 YE = new su_1(this);
    public static final int YF = 1;

    @Override
    public fi_1 DM() {
        return this.YE;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.YD ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.YD = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.YD = true;
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
        this.aN(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aN(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("visible=").append(this.YD).append('\n');
    }
}

