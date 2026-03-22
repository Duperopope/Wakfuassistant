/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from cqk
 */
public final class cqk_0
extends cqf {
    private long aDh;
    private byte[] mez;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.aDh = byteBuffer.getLong();
        this.mez = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mez);
        return false;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] exX() {
        return this.mez;
    }

    @Override
    public int d() {
        return 13859;
    }

    @Override
    public String toString() {
        return "CharacterEffectManagerForReconnectionMessage{m_characterId=" + this.aDh + ", m_serializedEffects=" + Arrays.toString(this.mez) + "}";
    }
}

