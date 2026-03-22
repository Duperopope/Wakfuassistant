/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ug
 */
final class ug_1 {
    private int acq = 0;
    private int acr = 0;
    private byte[] RG = null;
    private byte acs = 0;
    private final yq_1 acx = new yq_1();
    private final tp_1 acy = new tp_1();
    private final ArrayList<uf_2> acz = new ArrayList(0);
    final /* synthetic */ ue_1 acA;

    ug_1(ue_1 ue_12) {
        this.acA = ue_12;
    }

    public void avW() {
        this.acA.acq = this.acq;
        this.acA.acr = this.acr;
        this.acA.RG = this.RG;
        this.acA.acs = this.acs;
        this.acA.act.alH.clear();
        this.acA.act.alH.ensureCapacity(this.acx.alH.size());
        this.acA.act.alH.addAll(this.acx.alH);
        this.acA.acu.aau.clear();
        this.acA.acu.aau.ensureCapacity(this.acy.aau.size());
        this.acA.acu.aau.addAll(this.acy.aau);
        this.acA.acv.clear();
        this.acA.acv.ensureCapacity(this.acz.size());
        this.acA.acv.addAll(this.acz);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.acq = byteBuffer.getInt();
        this.acr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.RG = new byte[n];
            byteBuffer.get(this.RG);
        } else {
            this.RG = null;
        }
        this.acs = byteBuffer.get();
        boolean bl = this.acx.b(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.acy.b(byteBuffer, 1);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.acz.clear();
        this.acz.ensureCapacity(n2);
        for (int i = 0; i < n2; ++i) {
            uf_2 uf_22 = new uf_2();
            boolean bl3 = uf_22.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
            this.acz.add(uf_22);
        }
        return true;
    }

    private boolean ds(ByteBuffer byteBuffer) {
        this.acq = byteBuffer.getInt();
        this.acr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.RG = new byte[n];
            byteBuffer.get(this.RG);
        } else {
            this.RG = null;
        }
        this.acs = byteBuffer.get();
        boolean bl = this.acx.b(byteBuffer, 0x992323);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.acy.b(byteBuffer, 0x992323);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.acz.clear();
        this.acz.ensureCapacity(n2);
        for (int i = 0; i < n2; ++i) {
            uf_2 uf_22 = new uf_2();
            boolean bl3 = uf_22.b(byteBuffer, 0x992323);
            if (!bl3) {
                return false;
            }
            this.acz.add(uf_22);
        }
        return true;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        this.acq = byteBuffer.getInt();
        this.acr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.RG = new byte[n];
            byteBuffer.get(this.RG);
        } else {
            this.RG = null;
        }
        this.acs = byteBuffer.get();
        boolean bl = this.acx.b(byteBuffer, 10048002);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.acy.b(byteBuffer, 10048002);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.acz.clear();
        this.acz.ensureCapacity(n2);
        for (int i = 0; i < n2; ++i) {
            uf_2 uf_22 = new uf_2();
            boolean bl3 = uf_22.b(byteBuffer, 10048002);
            if (!bl3) {
                return false;
            }
            this.acz.add(uf_22);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.ds(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

