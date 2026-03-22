/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eZg
 */
class ezg_1
implements ezk_1 {
    private ezz_1 rMa;

    ezg_1() {
    }

    ezg_1(ezz_1 ezz_12) {
        this.rMa = ezz_12;
    }

    @Override
    public byte[] apI() {
        return eyk_2.u(this.rMa);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rMa = eyk_2.fM(byteBuffer);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        eyy_22.f(this.rMa);
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMd;
    }

    public String toString() {
        return "AddMemberChange{m_member=" + String.valueOf(this.rMa) + "}";
    }
}

