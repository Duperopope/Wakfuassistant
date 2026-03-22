/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rg
 */
public class rg_1
extends go_0
implements gs_0 {
    public boolean Wm = false;
    private final fi_1 Wn = new rh_2(this);
    public static final int Wo = 1;

    @Override
    public fi_1 DM() {
        return this.Wn;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Wm ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Wm = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Wm = false;
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
        this.aj(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aj(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("isPasseportActive=").append(this.Wm).append('\n');
    }
}

