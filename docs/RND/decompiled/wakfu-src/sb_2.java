/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sb
 */
public class sb_2
extends go_0
implements gs_0 {
    public byte XQ = 0;
    private final fi_1 XR = new sc_2(this);
    public static final int XS = 1;

    @Override
    public fi_1 DM() {
        return this.XR;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.XQ);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.XQ = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.XQ = 0;
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
        this.aE(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aE(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("sex=").append(this.XQ).append('\n');
    }
}

