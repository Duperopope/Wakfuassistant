/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyb
extends nr_0 {
    private int mcV;
    private boolean mml;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcV = byteBuffer.getInt();
        this.mml = byteBuffer.get() > 0;
        return true;
    }

    public ezp_1 eFk() {
        return ezp_1.values()[this.mcV];
    }

    public boolean eFl() {
        return this.mml;
    }

    @Override
    public int d() {
        return 15760;
    }

    @Override
    public String toString() {
        return "GuildErrorMessage{m_errorId=" + this.mcV + "}";
    }
}

