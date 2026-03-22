/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rH
 */
public class rh_1
extends go_0
implements gs_0 {
    public int QV = 0;
    public int[] Ra = null;
    public short Xk = 0;
    public long Xl = 0L;
    public byte VK = 0;
    public boolean Xm = false;
    public byte Re = 0;
    public int Rf = 0;
    private final fi_1 Xn = new ri_2(this);

    @Override
    public fi_1 DM() {
        return this.Xn;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.QV);
        if (this.Ra != null) {
            if (this.Ra.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Ra.length);
            for (int i = 0; i < this.Ra.length; ++i) {
                byteBuffer.putInt(this.Ra[i]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putShort(this.Xk);
        byteBuffer.putLong(this.Xl);
        byteBuffer.put(this.VK);
        byteBuffer.put(this.Xm ? (byte)1 : 0);
        byteBuffer.put(this.Re);
        byteBuffer.putInt(this.Rf);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.QV = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ra = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ra[i] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Xk = byteBuffer.getShort();
        this.Xl = byteBuffer.getLong();
        this.VK = byteBuffer.get();
        this.Xm = byteBuffer.get() == 1;
        this.Re = byteBuffer.get();
        this.Rf = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.QV = 0;
        this.Ra = null;
        this.Xk = 0;
        this.Xl = 0L;
        this.VK = 0;
        this.Xm = false;
        this.Re = 0;
        this.Rf = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10081000) {
            rj_1 rj_12 = new rj_1(this);
            boolean bl = rj_12.b(byteBuffer, n);
            if (bl) {
                rj_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 2;
        n += this.Ra != null ? this.Ra.length * 4 : 0;
        n += 2;
        n += 8;
        ++n;
        ++n;
        ++n;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aw(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aw(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("subscriptionLevel=").append(this.QV).append('\n');
        stringBuilder.append(string).append("additionalRights=(").append(this.Ra.length).append(" bytes)\n");
        stringBuilder.append(string).append("characterMaxLevel=").append(this.Xk).append('\n');
        stringBuilder.append(string).append("betaReward=").append(this.Xl).append('\n');
        stringBuilder.append(string).append("pvpState=").append(this.VK).append('\n');
        stringBuilder.append(string).append("pactInventoryIsEmpty=").append(this.Xm).append('\n');
        stringBuilder.append(string).append("languages=").append(this.Re).append('\n');
        stringBuilder.append(string).append("accountCommunityId=").append(this.Rf).append('\n');
    }
}

