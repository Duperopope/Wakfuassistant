/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpn
extends nr_0 {
    private long aDh;
    private String aFD;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        short s = byteBuffer.get();
        if (byteBuffer.remaining() < s) {
            dwV.warn((Object)String.format("Invalid remaining size of buffer for character name: expected %s, got %s.", s, byteBuffer.remaining()));
            this.aFD = null;
            return false;
        }
        byte[] byArray2 = new byte[s];
        byteBuffer.get(byArray2);
        this.aFD = BH.dc(byArray2);
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public String xO() {
        return this.aFD;
    }

    @Override
    public int d() {
        return 12471;
    }

    @Override
    public String toString() {
        return String.format("RemovePlayerChatMsgMessage{m_characterId=%s, m_characterName=%s}", this.aDh, this.aFD);
    }
}

