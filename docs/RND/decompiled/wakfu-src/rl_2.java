/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rl
 */
public class rl_2
extends go_0
implements gs_0 {
    public rp_1 Ww = null;
    public ro_1 Wx = null;
    private final fi_1 Wy = new rm_2(this);

    @Override
    public fi_1 DM() {
        return this.Wy;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        if (this.Ww != null) {
            byteBuffer.put((byte)1);
            bl = this.Ww.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.Wx != null) {
            byteBuffer.put((byte)1);
            bl = this.Wx.aF(byteBuffer);
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
            this.Ww = new rp_1();
            bl = this.Ww.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.Ww = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Wx = new ro_1();
            boolean bl5 = this.Wx.aG(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.Wx = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Ww = null;
        this.Wx = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10035005) {
            rn_1 rn_12 = new rn_1(this);
            boolean bl = rn_12.b(byteBuffer, n);
            if (bl) {
                rn_12.avW();
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
        if (this.Ww != null) {
            n += this.Ww.DN();
        }
        ++n;
        if (this.Wx != null) {
            n += this.Wx.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.al(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void al(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pet=");
        if (this.Ww == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Ww.an(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("mount=");
        if (this.Wx == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Wx.am(stringBuilder, string + "  ");
        }
    }
}

