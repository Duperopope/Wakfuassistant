/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjj
 */
public class cjj_0
extends nv_0 {
    private final int lVY;

    public cjj_0(int n) {
        this.lVY = n;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.lVY);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12338;
    }

    @Override
    public String toString() {
        return "AchievementTryToActivateRequestMessage{m_achievementId=" + this.lVY + "}";
    }
}

