/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class TT
extends TO {
    private QQ buk;
    private long bul;

    @Override
    protected void b(Uh uh) {
        uh.a(this);
    }

    TT() {
    }

    public QQ biH() {
        return this.buk;
    }

    public long biI() {
        return this.bul;
    }

    void j(QQ qQ) {
        this.buk = qQ;
    }

    void fe(long l) {
        this.bul = l;
    }

    @Override
    protected int biD() {
        return 16;
    }

    @Override
    protected void eP(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.buk.Sn());
        byteBuffer.putLong(this.bul);
    }

    @Override
    protected void e(Tz tz, ByteBuffer byteBuffer) {
        this.buk = tz.em(byteBuffer.getLong());
        this.bul = byteBuffer.getLong();
    }

    public TT(QQ qQ, long l) {
        this();
        this.buk = qQ;
        this.bul = l;
    }

    public static TT a(QQ qQ, long l) {
        return new TT(qQ, l);
    }

    static TT biJ() {
        return new TT();
    }

    @Override
    public long biC() {
        return this.bul;
    }

    public String toString() {
        return "EffectAreaActivationEvent{m_area=" + String.valueOf(this.buk) + ", m_applicantId=" + this.bul + "}";
    }
}

