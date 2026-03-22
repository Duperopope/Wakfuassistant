/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class chZ
extends nr_0 {
    private final ArrayList<Long> lUm = new ArrayList();
    private final HashMap<Long, Byte> lUn = new HashMap();
    private final HashMap<Long, Byte> lUo = new HashMap();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            this.lUm.add(l);
            this.lUn.put(l, byteBuffer.get());
            this.lUo.put(l, byteBuffer.get());
        }
        return true;
    }

    public List<Long> evf() {
        return this.lUm;
    }

    public List<Mv> mV(long l) {
        return Mv.A(this.lUn.get(l));
    }

    public vb_0 mW(long l) {
        if (!this.lUo.containsKey(l)) {
            return vb_0.bIT;
        }
        return vb_0.pS(this.lUo.get(l).byteValue());
    }

    @Override
    public int d() {
        return 742;
    }
}

