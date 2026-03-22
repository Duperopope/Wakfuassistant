/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from cvy
 */
public class cvy_0
extends nr_0 {
    private int hDK;
    private int mki;
    private int mkj;
    private int hWI;
    private ux_0 hXq;
    private final TIntArrayList mkk = new TIntArrayList();
    private byte bZe;
    private int epK;
    private boolean mkl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bZe = byteBuffer.get();
        this.hDK = byteBuffer.getInt();
        this.mki = byteBuffer.getInt();
        this.mkj = byteBuffer.getInt();
        this.hXq = uw_0.fn(byteBuffer.getLong());
        this.epK = byteBuffer.getInt();
        this.hWI = byteBuffer.getInt();
        boolean bl = this.mkl = byteBuffer.get() == 1;
        while (byteBuffer.hasRemaining()) {
            this.mkk.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 12345;
    }

    public TIntArrayList eEa() {
        return this.mkk;
    }

    public int eEb() {
        return this.hDK;
    }

    public int eEc() {
        return this.mki;
    }

    public int eEd() {
        return this.mkj;
    }

    public ux_0 dis() {
        return this.hXq;
    }

    public byte dij() {
        return this.bZe;
    }

    public int ctn() {
        return this.epK;
    }

    public int diy() {
        return this.hWI;
    }

    public boolean eEe() {
        return this.mkl;
    }
}

