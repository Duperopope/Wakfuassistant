/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from Bg
 */
public class bg_0 {
    private int o;
    private int asz;
    private int asA;
    private short asB;
    private int asC;
    private int asD;
    private int asE;
    private String asF;
    private boolean asG;
    private byte asH;

    public final String aHs() {
        return this.asF;
    }

    public final int aHt() {
        return this.asz;
    }

    public final int aHu() {
        return this.o;
    }

    public final byte aHv() {
        return this.asH;
    }

    public final boolean aHw() {
        return this.asG;
    }

    public int azv() {
        return this.asA;
    }

    public short aGw() {
        return this.asB;
    }

    public int agN() {
        return this.asC;
    }

    public int aGx() {
        return this.asD;
    }

    public int Xk() {
        return this.asE;
    }

    public final byte[] aHx() {
        ByteBuffer byteBuffer = null;
        byte[] byArray = BH.aP(this.asF);
        int n = byArray.length;
        byteBuffer = ByteBuffer.allocate(32 + n);
        byteBuffer.putInt(this.o);
        byteBuffer.put(this.asH);
        byteBuffer.putInt(this.asz);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put(this.asG ? (byte)1 : 0);
        byteBuffer.putInt(this.asA);
        byteBuffer.putShort(this.asB);
        byteBuffer.putInt(this.asC);
        byteBuffer.putInt(this.asD);
        byteBuffer.putInt(this.asE);
        return byteBuffer.array();
    }

    public final void aH(String string) {
        this.asF = string;
    }

    public final void mb(int n) {
        this.asz = n;
    }

    public final void mc(int n) {
        this.o = n;
    }

    public void c(byte by) {
        this.asH = by;
    }

    public final void as(boolean bl) {
        this.asG = bl;
    }

    public void lP(int n) {
        this.asA = n;
    }

    public void d(short s) {
        this.asB = s;
    }

    public void lQ(int n) {
        this.asC = n;
    }

    public void lR(int n) {
        this.asD = n;
    }

    public void lS(int n) {
        this.asE = n;
    }

    public final void cX(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.o = byteBuffer.getInt();
        this.asH = byteBuffer.get();
        this.asz = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        try {
            this.asF = new String(byArray2, "UTF-8").intern();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bd_0.aGS().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
        this.asG = byteBuffer.get() == 1;
        this.asA = byteBuffer.getInt();
        this.asB = byteBuffer.getShort();
        this.asC = byteBuffer.getInt();
        this.asD = byteBuffer.getInt();
        this.asE = byteBuffer.getInt();
    }
}

