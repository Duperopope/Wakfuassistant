/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cye
extends nr_0 {
    private String aZI;
    private String aFF;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.aZI = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.aFF = BH.dc(byArray3);
        return true;
    }

    public String aXl() {
        return this.aZI;
    }

    public String HR() {
        return this.aFF;
    }

    @Override
    public int d() {
        return 15488;
    }

    @Override
    public String toString() {
        return "GuildInvitationMessage{m_inviterName='" + this.aZI + "', m_guildName='" + this.aFF + "'}";
    }
}

