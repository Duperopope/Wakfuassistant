/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ou
 */
public class ou_0
extends nv_0 {
    private final byte aZK;
    private final boolean aZL;
    private final long aZM;

    public ou_0(boolean bl, long l, byte by) {
        this.aZL = bl;
        this.aZK = by;
        this.aZM = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put(this.aZK);
        byteBuffer.put((byte)(this.aZL ? 1 : 0));
        byteBuffer.putLong(this.aZM);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public final int d() {
        return 1015;
    }

    @Override
    public String toString() {
        return "GroupInvitationByIdAnswerMessage{m_groupType=" + this.aZK + ", m_invitationAccepted=" + this.aZL + ", m_inviterId=" + this.aZM + "}";
    }
}

