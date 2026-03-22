/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctp
extends nr_0 {
    private final wa_2 mie = new wa_2();
    private byte mif;
    private int mig;

    public wa_2 eBY() {
        return this.mie;
    }

    public byte eCb() {
        return this.mif;
    }

    public int eCc() {
        return this.mig;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (!this.mie.aG(byteBuffer)) {
            dwV.error((Object)"Erreur durant la d\u00e9-serialisation d'un des inventaires marchands");
            return false;
        }
        this.mif = byteBuffer.get();
        this.mig = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13736;
    }
}

