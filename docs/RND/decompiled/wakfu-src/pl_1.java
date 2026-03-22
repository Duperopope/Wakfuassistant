/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pL
 */
public class pl_1
extends go_0
implements gs_0 {
    public int Tq = 0;
    public boolean Tr = false;
    public boolean Ts = false;
    public boolean Tt = false;
    public boolean Tu = false;
    public byte Tv = (byte)-1;
    public po_1 Tw = null;
    private final fi_1 Tx = new pm_1(this);

    @Override
    public fi_1 DM() {
        return this.Tx;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Tq);
        byteBuffer.put(this.Tr ? (byte)1 : 0);
        byteBuffer.put(this.Ts ? (byte)1 : 0);
        byteBuffer.put(this.Tt ? (byte)1 : 0);
        byteBuffer.put(this.Tu ? (byte)1 : 0);
        byteBuffer.put(this.Tv);
        if (this.Tw != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Tw.aF(byteBuffer);
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
        this.Tq = byteBuffer.getInt();
        this.Tr = byteBuffer.get() == 1;
        this.Ts = byteBuffer.get() == 1;
        this.Tt = byteBuffer.get() == 1;
        this.Tu = byteBuffer.get() == 1;
        this.Tv = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Tw = new po_1();
            boolean bl3 = this.Tw.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Tw = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Tq = 0;
        this.Tr = false;
        this.Ts = false;
        this.Tt = false;
        this.Tu = false;
        this.Tv = (byte)-1;
        this.Tw = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            pn_1 pn_12 = new pn_1(this);
            boolean bl = pn_12.b(byteBuffer, n);
            if (bl) {
                pn_12.avW();
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
        ++n;
        ++n;
        ++n;
        ++n;
        ++n;
        ++n;
        if (this.Tw != null) {
            n += this.Tw.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.C(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void C(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("currentFightId=").append(this.Tq).append('\n');
        stringBuilder.append(string).append("isKo=").append(this.Tr).append('\n');
        stringBuilder.append(string).append("isDead=").append(this.Ts).append('\n');
        stringBuilder.append(string).append("isSummoned=").append(this.Tt).append('\n');
        stringBuilder.append(string).append("isFleeing=").append(this.Tu).append('\n');
        stringBuilder.append(string).append("obstacleId=").append(this.Tv).append('\n');
        stringBuilder.append(string).append("SUMMONDATA=");
        if (this.Tw == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Tw.D(stringBuilder, string + "  ");
        }
    }
}

