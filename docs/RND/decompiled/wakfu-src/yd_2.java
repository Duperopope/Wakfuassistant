/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yd
 */
public class yd_2
implements gs_0 {
    public final ArrayList<yf_1> alb = new ArrayList(0);
    public final ArrayList<ye_2> alc = new ArrayList(0);
    public int ald = 0;
    public int ale = 0;
    public byte alf = (byte)-1;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.alb.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alb.size());
        for (n = 0; n < this.alb.size(); ++n) {
            gs_02 = this.alb.get(n);
            bl = ((yf_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.alc.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alc.size());
        for (n = 0; n < this.alc.size(); ++n) {
            gs_02 = this.alc.get(n);
            bl = ((ye_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.ald);
        byteBuffer.putInt(this.ale);
        byteBuffer.put(this.alf);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alb.clear();
        this.alb.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alb.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alc.clear();
        this.alc.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alc.add(ye_22);
        }
        this.ald = byteBuffer.getInt();
        this.ale = byteBuffer.getInt();
        this.alf = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.alb.clear();
        this.alc.clear();
        this.ald = 0;
        this.ale = 0;
        this.alf = (byte)-1;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            yh_2 yh_22 = new yh_2(this);
            boolean bl = yh_22.b(byteBuffer, n);
            if (bl) {
                yh_22.avW();
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
        for (n = 0; n < this.alb.size(); ++n) {
            gs_02 = this.alb.get(n);
            n2 += ((yf_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.alc.size(); ++n) {
            gs_02 = this.alc.get(n);
            n2 += ((ye_2)gs_02).DN();
        }
        n2 += 4;
        n2 += 4;
        return ++n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ev(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ev(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("shardSlot=");
        if (this.alb.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alb.size()).append(" elements)...\n");
            for (n = 0; n < this.alb.size(); ++n) {
                gs_02 = this.alb.get(n);
                ((yf_1)gs_02).ex(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("additionalGems=");
        if (this.alc.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alc.size()).append(" elements)...\n");
            for (n = 0; n < this.alc.size(); ++n) {
                gs_02 = this.alc.get(n);
                ((ye_2)gs_02).ew(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("sublimationItemId=").append(this.ald).append('\n');
        stringBuilder.append(string).append("specialSublimationItemId=").append(this.ale).append('\n');
        stringBuilder.append(string).append("charges=").append(this.alf).append('\n');
    }
}

