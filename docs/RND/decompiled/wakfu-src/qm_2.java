/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qm
 */
public class qm_2
extends go_0
implements gs_0 {
    public short Ux = 0;
    private final fi_1 Uy = new qn_2(this);
    public static final int Uz = 2;

    @Override
    public fi_1 DM() {
        return this.Uy;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.Ux);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Ux = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.Ux = 0;
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
        this.P(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void P(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.Ux).append('\n');
    }
}

