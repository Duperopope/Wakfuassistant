/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from NN
 */
public abstract class nn_0
extends nr_0 {
    private String aYS;
    private List<Mv> aYT;
    private vb_0 aYU;
    private long aYV;
    private boolean aYW;
    private String aYX;

    public long aWu() {
        return this.aYV;
    }

    public boolean aWv() {
        return this.aYW;
    }

    public String aWw() {
        return this.aYS;
    }

    public List<Mv> aWx() {
        return this.aYT;
    }

    public vb_0 aWy() {
        return this.aYU;
    }

    public String q() {
        return this.aYX;
    }

    @Override
    public boolean dn(byte[] byArray) {
        return this.b(byArray, 0);
    }

    public boolean b(byte[] byArray, int n) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.position(n);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aYS = BH.dc(byArray2);
        this.aYT = Mv.A(byteBuffer.get());
        this.aYU = vb_0.pS(byteBuffer.get());
        this.aYV = byteBuffer.getLong();
        this.aYW = byteBuffer.get() == 1;
        short s = byteBuffer.getShort();
        int n2 = byteBuffer.remaining();
        if (s != n2) {
            dwV.error((Object)String.format("[%s] Indicated chat message content length is different from the real size: %s != %s", this.getClass().getSimpleName(), s, n2));
            this.aYX = null;
            return false;
        }
        byte[] byArray3 = new byte[s];
        byteBuffer.get(byArray3);
        this.aYX = BH.dc(byArray3);
        return true;
    }
}

