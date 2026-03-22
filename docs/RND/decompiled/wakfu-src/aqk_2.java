/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;

/*
 * Renamed from aqk
 */
public final class aqk_2
implements aqh_2 {
    private int bIi;
    private String cQx;
    private String cQy;
    private long cQz;

    public aqk_2() {
    }

    public aqk_2(int n, String string, String string2, long l) {
        this.bIi = n;
        this.cQx = string != null ? string.intern() : null;
        this.cQy = string2 != null ? string2.intern() : null;
        this.cQz = l;
    }

    public int aeV() {
        return this.bIi;
    }

    public void tC(int n) {
        this.bIi = n;
    }

    public String bGu() {
        return this.cQx;
    }

    public void fI(String string) {
        this.cQx = string;
    }

    public String bGv() {
        return this.cQy;
    }

    public void fJ(String string) {
        this.cQy = string;
    }

    public long bGw() {
        return this.cQz;
    }

    public void gv(long l) {
        this.cQz = l;
    }

    @Override
    public void f(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.bIi);
        dataOutputStream.writeUTF(this.cQx);
        dataOutputStream.writeUTF(this.cQy);
        dataOutputStream.writeLong(this.cQz);
    }

    @Override
    public void d(DataInputStream dataInputStream) {
        this.bIi = dataInputStream.readInt();
        this.cQx = dataInputStream.readUTF().intern();
        this.cQy = dataInputStream.readUTF().intern();
        this.cQz = dataInputStream.readLong();
    }
}

