/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class buV {
    private long aDL;
    private long ioh;
    private String p;
    private String aNf;
    private int asE;
    private int jrj;
    private short ejt;

    public long Ya() {
        return this.aDL;
    }

    public long Yc() {
        return this.ioh;
    }

    public String getName() {
        return this.p;
    }

    public String getDescription() {
        return this.aNf;
    }

    public int Xk() {
        return this.asE;
    }

    public int dJM() {
        return this.jrj;
    }

    public short cmL() {
        return this.ejt;
    }

    public void eL(ByteBuffer byteBuffer) {
        this.aDL = byteBuffer.getLong();
        this.ioh = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.p = BH.dc(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.aNf = BH.dc(byArray2);
        this.asE = byteBuffer.getInt();
        this.jrj = byteBuffer.getInt();
        this.ejt = byteBuffer.getShort();
    }
}

