/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qW
 */
public class qw_2
extends go_0
implements gs_0 {
    public long VT = 0L;
    public long VU = 0L;
    public byte VV = 0;
    public byte VF = 0;
    public long VG = 0L;
    private final fi_1 VW = new qx_2(this);
    public static final int VX = 26;

    @Override
    public fi_1 DM() {
        return this.VW;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.VT);
        byteBuffer.putLong(this.VU);
        byteBuffer.put(this.VV);
        byteBuffer.put(this.VF);
        byteBuffer.putLong(this.VG);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.VT = 0L;
        this.VU = 0L;
        this.VV = 0;
        this.VF = 0;
        this.VG = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            qy_1 qy_12 = new qy_1(this);
            boolean bl = qy_12.b(byteBuffer, n);
            if (bl) {
                qy_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 26;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.af(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void af(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("jobs=").append(this.VT).append('\n');
        stringBuilder.append(string).append("voteDate=").append(this.VU).append('\n');
        stringBuilder.append(string).append("governmentOpinion=").append(this.VV).append('\n');
        stringBuilder.append(string).append("pvpRank=").append(this.VF).append('\n');
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.VG).append('\n');
    }
}

