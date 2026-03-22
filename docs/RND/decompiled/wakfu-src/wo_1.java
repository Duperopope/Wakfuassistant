/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wO
 */
public class wo_1
implements gs_0 {
    public final ArrayList<wp_2> aiB = new ArrayList(0);
    public final ArrayList<wq_2> aiC = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.aiB.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aiB.size());
        for (n = 0; n < this.aiB.size(); ++n) {
            gs_02 = this.aiB.get(n);
            bl = ((wp_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aiC.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aiC.size());
        for (n = 0; n < this.aiC.size(); ++n) {
            gs_02 = this.aiC.get(n);
            bl = ((wq_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.aiB.clear();
        this.aiB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wp_2 wp_22 = new wp_2();
            boolean bl = wp_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aiB.add(wp_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.aiC.clear();
        this.aiC.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wq_2 wq_22 = new wq_2();
            boolean bl = wq_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aiC.add(wq_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aiB.clear();
        this.aiC.clear();
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
        for (n = 0; n < this.aiB.size(); ++n) {
            gs_02 = this.aiB.get(n);
            n2 += ((wp_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.aiC.size(); ++n) {
            gs_02 = this.aiC.get(n);
            n2 += ((wq_2)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dB(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("protectedMonsters=");
        if (this.aiB.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aiB.size()).append(" elements)...\n");
            for (n = 0; n < this.aiB.size(); ++n) {
                gs_02 = this.aiB.get(n);
                ((wp_2)gs_02).dC(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("protectedResources=");
        if (this.aiC.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aiC.size()).append(" elements)...\n");
            for (n = 0; n < this.aiC.size(); ++n) {
                gs_02 = this.aiC.get(n);
                ((wq_2)gs_02).dD(stringBuilder, string + n + "/ ");
            }
        }
    }
}

