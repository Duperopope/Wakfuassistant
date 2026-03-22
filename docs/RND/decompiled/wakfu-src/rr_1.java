/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rr
 */
public class rr_1
extends go_0
implements gs_0 {
    public int WK = -1;
    private final fi_1 WL = new rs_1(this);
    public static final int WM = 4;

    @Override
    public fi_1 DM() {
        return this.WL;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WK);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.WK = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.WK = -1;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ao(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ao(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("selectedPhoenix=").append(this.WK).append('\n');
    }
}

