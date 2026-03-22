/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Bc
 */
public final class bc_0
extends apx_1 {
    private static final short asI = 1;
    private int asJ;
    private int asK;
    private Long[] asL;
    private int asM;
    private int asN;

    public int aGz() {
        return this.asK;
    }

    public void lT(int n) {
        this.asK = n;
    }

    public Long[] aGA() {
        return this.asL;
    }

    public void a(Long[] longArray) {
        this.asL = longArray;
    }

    public int aGB() {
        return this.asM;
    }

    public void lU(int n) {
        this.asM = n;
    }

    public int aGC() {
        return this.asN;
    }

    public void lV(int n) {
        this.asN = n;
    }

    public int aGD() {
        return this.asJ;
    }

    public void lW(int n) {
        this.asJ = n;
    }

    public bc_0() {
        super((short)1);
    }

    @Override
    public int aFS() {
        return ewj_2.ozx.d();
    }

    @Override
    public byte[] aFR() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20 + (this.asL == null ? 0 : this.asL.length * 8));
        byteBuffer.putInt(this.asJ);
        byteBuffer.putInt(this.asK);
        byteBuffer.putInt(this.asM);
        byteBuffer.putInt(this.asN);
        if (this.asL != null) {
            byteBuffer.putInt(this.asL.length);
            Long[] longArray = this.asL;
            int n = longArray.length;
            for (int i = 0; i < n; ++i) {
                long l = longArray[i];
                byteBuffer.putLong(l);
            }
        } else {
            byteBuffer.putInt(0);
        }
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s) {
        this.tz(n);
        if (s == 1) {
            this.asJ = byteBuffer.getInt();
            this.asK = byteBuffer.getInt();
            this.asM = byteBuffer.getInt();
            this.asN = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            this.asL = new Long[n2];
            for (int i = 0; i < n2; ++i) {
                this.asL[i] = byteBuffer.getLong();
            }
        } else {
            cPB.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public apx_1 aFN() {
        return new bc_0();
    }
}

