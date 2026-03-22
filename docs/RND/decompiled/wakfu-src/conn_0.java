/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from coNN
 */
public class conn_0
extends nr_0 {
    private final ArrayList<azx_1<Byte, Long>> mdo = new ArrayList();
    private boolean mdp = false;
    private boolean mdq = false;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 3, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mdp = byteBuffer.get() == 1;
        this.mdq = byteBuffer.get() == 1;
        int n = byteBuffer.get() & 0xFF;
        if (!this.h(byteBuffer.remaining(), n * 9, true)) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            byte by = byteBuffer.get();
            long l = byteBuffer.getLong();
            this.mdo.add(new azx_1<Byte, Long>(by, l));
        }
        return true;
    }

    @Override
    public int d() {
        return 12567;
    }

    public ArrayList<azx_1<Byte, Long>> ewD() {
        return this.mdo;
    }

    public boolean ewE() {
        return this.mdp;
    }

    public boolean ewF() {
        return this.mdq;
    }
}

