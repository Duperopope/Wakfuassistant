/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coZ
 */
public class coz_0
extends nr_0 {
    private String cKf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.cKf = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 22522;
    }

    public String bDO() {
        return this.cKf;
    }

    @Override
    public String toString() {
        return "AuthentificationTokenResultMessage{m_token='" + this.cKf + "'}";
    }
}

