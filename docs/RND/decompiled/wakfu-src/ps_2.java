/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pS
 */
public class ps_2
extends go_0
implements gs_0 {
    public long TH = 0L;
    private final fi_1 TI = new pt_1(this);
    public static final int TJ = 8;

    @Override
    public fi_1 DM() {
        return this.TI;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TH);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TH = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.TH = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.F(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void F(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("partyId=").append(this.TH).append('\n');
    }
}

