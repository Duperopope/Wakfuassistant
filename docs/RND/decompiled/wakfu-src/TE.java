/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class TE {
    long btF;
    short btf;

    TE() {
    }

    long OO() {
        return this.btF;
    }

    void eY(long l) {
        this.btF = l;
    }

    public void bib() {
        this.btf = (short)(this.btf + 1);
    }

    public short bic() {
        return this.btf;
    }

    public int DN() {
        return 2;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.btf);
    }

    protected void a(Tz tz, ByteBuffer byteBuffer) {
        this.btf = byteBuffer.getShort();
    }

    public static TE b(Tz tz, ByteBuffer byteBuffer) {
        TE tE = new TE();
        tE.a(tz, byteBuffer);
        return tE;
    }

    public TE(long l, short s) {
        this();
        this.btf = s;
        this.btF = l;
    }
}

