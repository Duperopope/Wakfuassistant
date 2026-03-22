/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qZ
 */
public class qz_2
extends go_0
implements gs_0 {
    public long Wa = 0L;
    public long VT = 0L;
    public long VU = 0L;
    public byte VV = 0;
    public boolean Wb = false;
    public byte VF = 0;
    private final fi_1 Wc = new ra_1(this);
    public static final int Wd = 27;

    @Override
    public fi_1 DM() {
        return this.Wc;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Wa);
        byteBuffer.putLong(this.VT);
        byteBuffer.putLong(this.VU);
        byteBuffer.put(this.VV);
        byteBuffer.put(this.Wb ? (byte)1 : 0);
        byteBuffer.put(this.VF);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Wa = byteBuffer.getLong();
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.Wb = byteBuffer.get() == 1;
        this.VF = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.Wa = 0L;
        this.VT = 0L;
        this.VU = 0L;
        this.VV = 0;
        this.Wb = false;
        this.VF = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            rb_1 rb_12 = new rb_1(this);
            boolean bl = rb_12.b(byteBuffer, n);
            if (bl) {
                rb_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 27;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ag(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ag(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rank=").append(this.Wa).append('\n');
        stringBuilder.append(string).append("jobs=").append(this.VT).append('\n');
        stringBuilder.append(string).append("voteDate=").append(this.VU).append('\n');
        stringBuilder.append(string).append("governmentOpinion=").append(this.VV).append('\n');
        stringBuilder.append(string).append("isCandidate=").append(this.Wb).append('\n');
        stringBuilder.append(string).append("pvpRank=").append(this.VF).append('\n');
    }
}

