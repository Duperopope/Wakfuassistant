/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ws
 */
public class ws_1
implements gs_0 {
    public final ArrayList<wt_2> ahr = new ArrayList(0);
    public final ArrayList<wu_1> ahs = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.ahr.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ahr.size());
        for (n = 0; n < this.ahr.size(); ++n) {
            gs_02 = this.ahr.get(n);
            bl = ((wt_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.ahs.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ahs.size());
        for (n = 0; n < this.ahs.size(); ++n) {
            gs_02 = this.ahs.get(n);
            bl = ((wu_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ahr.clear();
        this.ahr.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wt_2 wt_22 = new wt_2();
            boolean bl = wt_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ahr.add(wt_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.ahs.clear();
        this.ahs.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wu_1 wu_12 = new wu_1();
            boolean bl = wu_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ahs.add(wu_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ahr.clear();
        this.ahs.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.ahr.size(); ++n) {
            gs_02 = this.ahr.get(n);
            n2 += ((wt_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.ahs.size(); ++n) {
            gs_02 = this.ahs.get(n);
            n2 += ((wu_1)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ds(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ds(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("groupPermissions=");
        if (this.ahr.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ahr.size()).append(" elements)...\n");
            for (n = 0; n < this.ahr.size(); ++n) {
                gs_02 = this.ahr.get(n);
                ((wt_2)gs_02).dt(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("individualPermissions=");
        if (this.ahs.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ahs.size()).append(" elements)...\n");
            for (n = 0; n < this.ahs.size(); ++n) {
                gs_02 = this.ahs.get(n);
                ((wu_1)gs_02).du(stringBuilder, string + n + "/ ");
            }
        }
    }
}

