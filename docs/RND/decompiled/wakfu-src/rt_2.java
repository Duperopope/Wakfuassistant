/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rt
 */
public class rt_2
extends go_0
implements gs_0 {
    public int WO = 0;
    public int WP = 0;
    public short WQ = 0;
    public long UB = 0L;
    public byte WR = 0;
    public rw_2 WS = null;
    private final fi_1 WT = new ru_2(this);

    @Override
    public fi_1 DM() {
        return this.WT;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WO);
        byteBuffer.putInt(this.WP);
        byteBuffer.putShort(this.WQ);
        byteBuffer.putLong(this.UB);
        byteBuffer.put(this.WR);
        if (this.WS != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.WS.aF(byteBuffer);
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
        this.WO = byteBuffer.getInt();
        this.WP = byteBuffer.getInt();
        this.WQ = byteBuffer.getShort();
        this.UB = byteBuffer.getLong();
        this.WR = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.WS = new rw_2();
            boolean bl3 = this.WS.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.WS = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.WO = 0;
        this.WP = 0;
        this.WQ = 0;
        this.UB = 0L;
        this.WR = 0;
        this.WS = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            rv_1 rv_12 = new rv_1(this);
            boolean bl = rv_12.b(byteBuffer, n);
            if (bl) {
                rv_12.avW();
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
        n += 4;
        n += 2;
        n += 8;
        ++n;
        ++n;
        if (this.WS != null) {
            n += this.WS.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ap(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ap(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("x=").append(this.WO).append('\n');
        stringBuilder.append(string).append("y=").append(this.WP).append('\n');
        stringBuilder.append(string).append("z=").append(this.WQ).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.UB).append('\n');
        stringBuilder.append(string).append("direction=").append(this.WR).append('\n');
        stringBuilder.append(string).append("dimBagPosition=");
        if (this.WS == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.WS.aq(stringBuilder, string + "  ");
        }
    }
}

