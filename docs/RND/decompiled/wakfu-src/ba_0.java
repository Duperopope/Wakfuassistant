/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from Ba
 */
public class ba_0 {
    private int o;
    private int asu;
    private boolean asv;
    private boolean asw;
    private String asx;
    private String asy;

    public final int aGk() {
        return this.o;
    }

    public final int aGl() {
        return this.asu;
    }

    public final String aGm() {
        return this.asy;
    }

    public final String aGn() {
        return this.asx;
    }

    public final boolean aGo() {
        return this.asv;
    }

    public final boolean aGp() {
        return this.asw;
    }

    public final byte[] aGq() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray = this.asx == null ? new byte[]{} : this.asx.getBytes("UTF-8");
            byte[] byArray2 = this.asy == null ? new byte[]{} : this.asy.getBytes("UTF-8");
            byteBuffer = ByteBuffer.allocate(9 + byArray.length + 4 + 1 + 4 + byArray2.length);
            byteBuffer.putInt(this.o);
            byteBuffer.put(this.asv ? (byte)1 : 0);
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.put(this.asw ? (byte)1 : 0);
            byteBuffer.putInt(this.asu);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            az_0.aGh().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        return byteBuffer.array();
    }

    public final void ai(boolean bl) {
        this.asv = bl;
    }

    public final void aj(boolean bl) {
        this.asw = bl;
    }

    public final void lL(int n) {
        this.o = n;
    }

    public final void lM(int n) {
        this.asu = n;
    }

    public final void as(String string) {
        this.asy = string;
    }

    public final void at(String string) {
        this.asx = string;
    }

    public final void cT(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.o = byteBuffer.getInt();
        this.asv = byteBuffer.get() == 1;
        try {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.asx = new String(byArray2, "UTF-8").intern();
            this.asw = byteBuffer.get() == 1;
            this.asu = byteBuffer.getInt();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.asy = new String(byArray3, "UTF-8").intern();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            az_0.aGi().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

