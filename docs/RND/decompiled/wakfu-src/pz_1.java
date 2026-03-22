/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pz
 */
public class pz_1
extends go_0
implements gs_0 {
    public short SU = 0;
    private final fi_1 SV = new pa_1(this);
    public static final int SW = 2;

    @Override
    public fi_1 DM() {
        return this.SV;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.SU);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.SU = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.SU = 0;
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
        this.x(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void x(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("downscaleLevel=").append(this.SU).append('\n');
    }
}

