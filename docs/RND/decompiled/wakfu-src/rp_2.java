/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rP
 */
public class rp_2
extends go_0
implements gs_0 {
    public rs_2 Xy = null;
    public rt_1 Xz = null;
    private final fi_1 XA = new rq_1(this);

    @Override
    public fi_1 DM() {
        return this.XA;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        if (this.Xy != null) {
            byteBuffer.put((byte)1);
            bl = this.Xy.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.Xz != null) {
            byteBuffer.put((byte)1);
            bl = this.Xz.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.Xy = new rs_2();
            bl = this.Xy.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.Xy = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Xz = new rt_1();
            boolean bl5 = this.Xz.aG(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.Xz = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Xy = null;
        this.Xz = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            rr_2 rr_22 = new rr_2(this);
            boolean bl = rr_22.b(byteBuffer, n);
            if (bl) {
                rr_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        if (this.Xy != null) {
            n += this.Xy.DN();
        }
        ++n;
        if (this.Xz != null) {
            n += this.Xz.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.az(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void az(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("inFightData=");
        if (this.Xy == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Xy.aA(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("outFightData=");
        if (this.Xz == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Xz.aB(stringBuilder, string + "  ");
        }
    }
}

