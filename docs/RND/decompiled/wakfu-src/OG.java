/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OG
extends nr_0 {
    private long aZJ;
    private String aZI;
    private byte aZz;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZz = byteBuffer.get();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aZI = BH.dc(byArray2);
        this.aZJ = byteBuffer.getLong();
        return true;
    }

    public String aXl() {
        return this.aZI;
    }

    public byte aWY() {
        return this.aZz;
    }

    public long aXm() {
        return this.aZJ;
    }

    @Override
    public int d() {
        return 1159;
    }

    @Override
    public String toString() {
        return "GroupInvitationRequestMessage{m_inviterId=" + this.aZJ + ", m_inviterName='" + this.aZI + "', m_groupType=" + this.aZz + "}";
    }
}

