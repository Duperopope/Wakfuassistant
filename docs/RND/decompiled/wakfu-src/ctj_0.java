/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctJ
 */
public class ctj_0
extends nr_0 {
    private boolean asG;
    private long miy;
    private String miz;
    private long miA;
    private String miB;
    private int miC;
    private int miD;

    public boolean aGv() {
        return this.asG;
    }

    public long eCv() {
        return this.miy;
    }

    public String eCw() {
        return this.miz;
    }

    public long eCx() {
        return this.miA;
    }

    public String eCy() {
        return this.miB;
    }

    public int eCz() {
        return this.miC;
    }

    public int eCA() {
        return this.miD;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.asG = byteBuffer.get() != 0;
        if (this.asG) {
            this.miD = byteBuffer.getInt();
            this.miC = byteBuffer.getInt();
            this.miy = byteBuffer.getLong();
            byte by = byteBuffer.get();
            byte[] byArray2 = new byte[by];
            byteBuffer.get(byArray2);
            this.miz = BH.dc(byArray2);
            this.miA = byteBuffer.getLong();
            byte by2 = byteBuffer.get();
            byArray2 = new byte[by2];
            byteBuffer.get(byArray2);
            this.miB = BH.dc(byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 14526;
    }
}

