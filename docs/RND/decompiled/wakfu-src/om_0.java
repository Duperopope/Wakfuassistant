/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from OM
 */
public final class om_0
extends nr_0 {
    private final int bac;
    private long aYV;
    private String aYS;
    private List<Mv> aYT;
    private vb_0 aYU;
    private String aYX;

    public om_0(int n) {
        this.bac = n;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYV = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aYS = BH.dc(byArray2);
        this.aYT = Mv.A(byteBuffer.get());
        this.aYU = vb_0.pS(byteBuffer.get());
        byte[] byArray3 = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray3);
        this.aYX = BH.dc(byArray3);
        return true;
    }

    @Override
    public int d() {
        return this.bac;
    }

    public long aWu() {
        return this.aYV;
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
}

