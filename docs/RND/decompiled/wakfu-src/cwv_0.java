/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwV
 */
public class cwv_0
extends nv_0 {
    private final boolean mlv;

    public cwv_0(boolean bl) {
        this.mlv = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)(this.mlv ? 1 : 0));
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15259;
    }

    @Override
    public String toString() {
        return "GuildInvitationResultMessage{m_accepted=" + this.mlv + "}";
    }
}

