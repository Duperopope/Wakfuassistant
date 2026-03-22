/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fhz {
    private final List<ffV> soU = new ArrayList<ffV>();

    public fhz() {
    }

    public fhz(fhz fhz2) {
        this.soU.addAll(fhz2.soU);
    }

    public void cf(ffV ffV2) {
        if (this.soU.contains(ffV2)) {
            return;
        }
        this.soU.add(ffV2);
    }

    public int aVo() {
        return this.soU.size();
    }

    public List<ffV> fba() {
        return Collections.unmodifiableList(this.soU);
    }

    public void a(we_1 we_12) {
        we_12.aeb = exH.pdw;
        azg_1 azg_12 = new azg_1();
        azg_12.aF((byte)this.soU.size());
        for (ffV ffV2 : this.soU) {
            byte[] byArray = ffV2.apI();
            if (byArray == null) continue;
            azg_12.vC(byArray.length);
            azg_12.dH(byArray);
        }
        we_12.agQ = azg_12.bTe();
    }

    public String toString() {
        return "MergedSetInfo{m_items=" + String.valueOf(this.soU) + "}";
    }

    public static fhz b(we_1 we_12) {
        fhz fhz2 = new fhz();
        int n = we_12.aeb;
        byte[] byArray = we_12.agQ;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.get();
        for (int i = 0; i < n2; ++i) {
            int n3 = byteBuffer.getInt();
            byte[] byArray2 = new byte[n3];
            byteBuffer.get(byArray2);
            ffV ffV2 = new ffV();
            if (!ffV2.b(n, ByteBuffer.wrap(byArray2))) continue;
            fhz2.soU.add(ffV2);
        }
        return fhz2;
    }
}

