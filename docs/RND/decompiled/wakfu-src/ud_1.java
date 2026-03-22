/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uD
 */
public class ud_1
implements gs_0 {
    public final ArrayList<ue_2> adD = new ArrayList(0);
    public final ArrayList<ug_2> adE = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.adD.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adD.size());
        for (n = 0; n < this.adD.size(); ++n) {
            gs_02 = this.adD.get(n);
            bl = ((ue_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.adE.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adE.size());
        for (n = 0; n < this.adE.size(); ++n) {
            gs_02 = this.adE.get(n);
            bl = ((ug_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adD.clear();
        this.adD.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adD.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adE.clear();
        this.adE.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adE.add(ug_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.adD.clear();
        this.adE.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uh_2 uh_22 = new uh_2(this);
            boolean bl = uh_22.b(byteBuffer, n);
            if (bl) {
                uh_22.avW();
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
        for (n = 0; n < this.adD.size(); ++n) {
            gs_02 = this.adD.get(n);
            n2 += ((ue_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.adE.size(); ++n) {
            gs_02 = this.adE.get(n);
            n2 += ((ug_2)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ci(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ci(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("itemHistory=");
        if (this.adD.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adD.size()).append(" elements)...\n");
            for (n = 0; n < this.adD.size(); ++n) {
                gs_02 = this.adD.get(n);
                ((ue_2)gs_02).cj(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("moneyHistory=");
        if (this.adE.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adE.size()).append(" elements)...\n");
            for (n = 0; n < this.adE.size(); ++n) {
                gs_02 = this.adE.get(n);
                ((ug_2)gs_02).ck(stringBuilder, string + n + "/ ");
            }
        }
    }
}

