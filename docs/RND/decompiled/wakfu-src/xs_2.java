/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xS
 */
public class xs_2
implements gs_0 {
    public xx_1 akH = null;
    public xt_2 akI = null;
    public final ArrayList<yb_1> akJ = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        if (this.akH != null) {
            byteBuffer.put((byte)1);
            n = this.akH.aF(byteBuffer);
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.akI != null) {
            byteBuffer.put((byte)1);
            n = this.akI.aF(byteBuffer);
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.akJ.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akJ.size());
        for (n = 0; n < this.akJ.size(); ++n) {
            yb_1 yb_12 = this.akJ.get(n);
            boolean bl = yb_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.akH = new xx_1();
            bl = this.akH.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.akH = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.akI = new xt_2();
            n = this.akI.aG(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            this.akI = null;
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.akJ.clear();
        this.akJ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yb_1 yb_12 = new yb_1();
            boolean bl5 = yb_12.aG(byteBuffer);
            if (!bl5) {
                return false;
            }
            this.akJ.add(yb_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.akH = null;
        this.akI = null;
        this.akJ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yc_1 yc_12 = new yc_1(this);
            boolean bl = yc_12.b(byteBuffer, n);
            if (bl) {
                yc_12.avW();
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
        if (this.akH != null) {
            n += this.akH.DN();
        }
        ++n;
        if (this.akI != null) {
            n += this.akI.DN();
        }
        n += 2;
        for (int i = 0; i < this.akJ.size(); ++i) {
            yb_1 yb_12 = this.akJ.get(i);
            n += yb_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ep(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ep(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("currentScenarii=");
        if (this.akH == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.akH.es(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("currentChallengeInfo=");
        if (this.akI == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.akI.eq(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("pastScenarii=");
        if (this.akJ.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akJ.size()).append(" elements)...\n");
            for (int i = 0; i < this.akJ.size(); ++i) {
                yb_1 yb_12 = this.akJ.get(i);
                yb_12.eu(stringBuilder, string + i + "/ ");
            }
        }
    }
}

