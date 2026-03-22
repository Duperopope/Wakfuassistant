/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tW
 */
public class tw_1
implements gs_0 {
    public boolean abX = false;
    public final ArrayList<tx_2> abY = new ArrayList(0);
    public final ArrayList<ty_1> abZ = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.put(this.abX ? (byte)1 : 0);
        if (this.abY.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.abY.size());
        for (n = 0; n < this.abY.size(); ++n) {
            gs_02 = this.abY.get(n);
            bl = ((tx_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.abZ.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.abZ.size());
        for (n = 0; n < this.abZ.size(); ++n) {
            gs_02 = this.abZ.get(n);
            bl = ((ty_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        this.abX = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.abY.clear();
        this.abY.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tx_2 tx_22 = new tx_2();
            boolean bl = tx_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.abY.add(tx_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.abZ.clear();
        this.abZ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ty_1 ty_12 = new ty_1();
            boolean bl = ty_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.abZ.add(ty_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.abX = false;
        this.abY.clear();
        this.abZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10014) {
            tz_1 tz_12 = new tz_1(this);
            boolean bl = tz_12.b(byteBuffer, n);
            if (bl) {
                tz_12.avW();
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
        ++n2;
        n2 += 2;
        for (n = 0; n < this.abY.size(); ++n) {
            gs_02 = this.abY.get(n);
            n2 += ((tx_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.abZ.size(); ++n) {
            gs_02 = this.abZ.get(n);
            n2 += ((ty_1)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bL(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bL(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("dimensionalBagLocked=").append(this.abX).append('\n');
        stringBuilder.append(string).append("groupEntries=");
        if (this.abY.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abY.size()).append(" elements)...\n");
            for (n = 0; n < this.abY.size(); ++n) {
                gs_02 = this.abY.get(n);
                ((tx_2)gs_02).bM(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("individualEntries=");
        if (this.abZ.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abZ.size()).append(" elements)...\n");
            for (n = 0; n < this.abZ.size(); ++n) {
                gs_02 = this.abZ.get(n);
                ((ty_1)gs_02).bN(stringBuilder, string + n + "/ ");
            }
        }
    }
}

