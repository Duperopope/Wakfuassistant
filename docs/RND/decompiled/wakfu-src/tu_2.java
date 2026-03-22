/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tu
 */
public class tu_2
implements gs_0 {
    public tv_1 aaE = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.aaE != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.aaE.aF(byteBuffer);
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
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aaE = new tv_1();
            boolean bl3 = this.aaE.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.aaE = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aaE = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10084000) {
            tx_1 tx_12 = new tx_1(this);
            boolean bl = tx_12.b(byteBuffer, n);
            if (bl) {
                tx_12.avW();
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
        if (this.aaE != null) {
            n += this.aaE.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bu(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bu(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("activeCosmetic=");
        if (this.aaE == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aaE.bv(stringBuilder, string + "  ");
        }
    }
}

