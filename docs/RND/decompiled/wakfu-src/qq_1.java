/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qQ
 */
public class qq_1
extends go_0
implements gs_0 {
    public byte VF = 0;
    public long VG = 0L;
    private final fi_1 VH = new qr_2(this);
    public static final int VI = 9;

    @Override
    public fi_1 DM() {
        return this.VH;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.VF);
        byteBuffer.putLong(this.VG);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.VF = 0;
        this.VG = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            qs_1 qs_12 = new qs_1(this);
            boolean bl = qs_12.b(byteBuffer, n);
            if (bl) {
                qs_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ad(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ad(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pvpRank=").append(this.VF).append('\n');
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.VG).append('\n');
    }
}

