/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xp
 */
public class xp_1
implements gs_0 {
    public final ArrayList<xr_1> ajI = new ArrayList(0);
    public xs_1 ajJ = null;
    public final ArrayList<xq_2> ajK = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.ajI.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajI.size());
        for (n = 0; n < this.ajI.size(); ++n) {
            gs_02 = this.ajI.get(n);
            bl = ((xr_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.ajJ != null) {
            byteBuffer.put((byte)1);
            n = this.ajJ.aF(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.ajK.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajK.size());
        for (n = 0; n < this.ajK.size(); ++n) {
            gs_02 = this.ajK.get(n);
            bl = ((xq_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.ajI.clear();
        this.ajI.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            xr_1 xr_12 = new xr_1();
            n = xr_12.aG(byteBuffer);
            if (n == 0) {
                return false;
            }
            this.ajI.add(xr_12);
        }
        int n4 = n2 = byteBuffer.get() == 1 ? 1 : 0;
        if (n2 != 0) {
            this.ajJ = new xs_1();
            boolean bl = this.ajJ.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.ajJ = null;
        }
        int n5 = byteBuffer.getShort() & 0xFFFF;
        this.ajK.clear();
        this.ajK.ensureCapacity(n5);
        for (n = 0; n < n5; ++n) {
            xq_2 xq_22 = new xq_2();
            boolean bl = xq_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajK.add(xq_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajI.clear();
        this.ajJ = null;
        this.ajK.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xv_1 xv_12 = new xv_1(this);
            boolean bl = xv_12.b(byteBuffer, n);
            if (bl) {
                xv_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.ajI.size(); ++n) {
            gs_02 = this.ajI.get(n);
            n2 += ((xr_1)gs_02).DN();
        }
        ++n2;
        if (this.ajJ != null) {
            n2 += this.ajJ.DN();
        }
        n2 += 2;
        for (n = 0; n < this.ajK.size(); ++n) {
            gs_02 = this.ajK.get(n);
            n2 += ((xq_2)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dV(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dV(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("contents=");
        if (this.ajI.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajI.size()).append(" elements)...\n");
            for (n = 0; n < this.ajI.size(); ++n) {
                gs_02 = this.ajI.get(n);
                ((xr_1)gs_02).dX(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("contentsSelection=");
        if (this.ajJ == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.ajJ.dY(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("buyableContents=");
        if (this.ajK.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajK.size()).append(" elements)...\n");
            for (n = 0; n < this.ajK.size(); ++n) {
                gs_02 = this.ajK.get(n);
                ((xq_2)gs_02).dW(stringBuilder, string + n + "/ ");
            }
        }
    }
}

