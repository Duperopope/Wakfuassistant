/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from oy
 */
public class oy_1
extends go_0
implements gs_0 {
    public int[] QU = null;
    public int QV = 0;
    public int QW = 0;
    public int QX = 0;
    public long QY = 0L;
    public long QZ = 0L;
    public int[] Ra = null;
    public byte Rb = 0;
    public byte Rc = 0;
    public final ArrayList<oa_1> Rd = new ArrayList(0);
    public byte Re = 0;
    public int Rf = 0;
    private final fi_1 Rg = new oz_1(this);

    @Override
    public fi_1 DM() {
        return this.Rg;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        if (this.QU != null) {
            if (this.QU.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.QU.length);
            for (n = 0; n < this.QU.length; ++n) {
                byteBuffer.putInt(this.QU[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.QV);
        byteBuffer.putInt(this.QW);
        byteBuffer.putInt(this.QX);
        byteBuffer.putLong(this.QY);
        byteBuffer.putLong(this.QZ);
        if (this.Ra != null) {
            if (this.Ra.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Ra.length);
            for (n = 0; n < this.Ra.length; ++n) {
                byteBuffer.putInt(this.Ra[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.Rb);
        byteBuffer.put(this.Rc);
        if (this.Rd.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Rd.size());
        for (n = 0; n < this.Rd.size(); ++n) {
            oa_1 oa_12 = this.Rd.get(n);
            boolean bl = oa_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.put(this.Re);
        byteBuffer.putInt(this.Rf);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.QU = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.QU[n2] = byteBuffer.getInt();
            }
        } else {
            this.QU = null;
        }
        this.QV = byteBuffer.getInt();
        this.QW = byteBuffer.getInt();
        this.QX = byteBuffer.getInt();
        this.QY = byteBuffer.getLong();
        this.QZ = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Ra = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Ra[n] = byteBuffer.getInt();
            }
        } else {
            this.Ra = null;
        }
        this.Rb = byteBuffer.get();
        this.Rc = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.Rd.clear();
        this.Rd.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            oa_1 oa_12 = new oa_1();
            boolean bl = oa_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Rd.add(oa_12);
        }
        this.Re = byteBuffer.get();
        this.Rf = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.QU = null;
        this.QV = 0;
        this.QW = 0;
        this.QX = 0;
        this.QY = 0L;
        this.QZ = 0L;
        this.Ra = null;
        this.Rb = 0;
        this.Rc = 0;
        this.Rd.clear();
        this.Re = 0;
        this.Rf = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10081000) {
            ob_1 ob_12 = new ob_1(this);
            boolean bl = ob_12.b(byteBuffer, n);
            if (bl) {
                ob_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.QU != null ? this.QU.length * 4 : 0;
        n += 4;
        n += 4;
        n += 4;
        n += 8;
        n += 8;
        n += 2;
        n += this.Ra != null ? this.Ra.length * 4 : 0;
        ++n;
        ++n;
        n += 2;
        for (int i = 0; i < this.Rd.size(); ++i) {
            oa_1 oa_12 = this.Rd.get(i);
            n += oa_12.DN();
        }
        ++n;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.b(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void b(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("adminRights=(").append(this.QU.length).append(" bytes)\n");
        stringBuilder.append(string).append("subscriptionLevel=").append(this.QV).append('\n');
        stringBuilder.append(string).append("forcedSubscriptionLevel=").append(this.QW).append('\n');
        stringBuilder.append(string).append("antiAddictionLevel=").append(this.QX).append('\n');
        stringBuilder.append(string).append("sessionStartTime=").append(this.QY).append('\n');
        stringBuilder.append(string).append("sessionId=").append(this.QZ).append('\n');
        stringBuilder.append(string).append("additionalRights=(").append(this.Ra.length).append(" bytes)\n");
        stringBuilder.append(string).append("additionalSlots=").append(this.Rb).append('\n');
        stringBuilder.append(string).append("accountSecurityType=").append(this.Rc).append('\n');
        stringBuilder.append(string).append("accountData=");
        if (this.Rd.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Rd.size()).append(" elements)...\n");
            for (int i = 0; i < this.Rd.size(); ++i) {
                oa_1 oa_12 = this.Rd.get(i);
                oa_12.c(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("languages=").append(this.Re).append('\n');
        stringBuilder.append(string).append("accountCommunityId=").append(this.Rf).append('\n');
    }
}

