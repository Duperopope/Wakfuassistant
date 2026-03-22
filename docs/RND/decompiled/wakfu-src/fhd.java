/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class fhd
implements evv_2 {
    private List<fhm> snW = new ArrayList<fhm>();

    @Override
    public byte[] fej() {
        byte[] byArray = fhj.Q(this.snW);
        azg_1 azg_12 = new azg_1();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.snW = fhj.eO(byArray);
    }

    @Override
    public eva_1 fek() {
        return eva_1.owt;
    }

    public void a(fhm fhm2) {
        this.snW.add(fhm2);
    }

    public List<fhm> fXD() {
        return this.snW;
    }
}

