/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pn
 */
public class pn_2
extends go_0
implements gs_0 {
    public pq_2 SC = null;
    public boolean SD = false;
    private final fi_1 SE = new po_2(this);

    @Override
    public fi_1 DM() {
        return this.SE;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.SC != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.SC.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.put(this.SD ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.SC = new pq_2();
            boolean bl3 = this.SC.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.SC = null;
        }
        this.SD = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.SC = null;
        this.SD = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10087000) {
            pp_1 pp_12 = new pp_1(this);
            boolean bl = pp_12.b(byteBuffer, n);
            if (bl) {
                pp_12.avW();
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
        if (this.SC != null) {
            n += this.SC.DN();
        }
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.s(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void s(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("currentPath=");
        if (this.SC == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.SC.t(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("riding=").append(this.SD).append('\n');
    }
}

