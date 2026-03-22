/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fog
 */
class fog_0
implements fnt_0 {
    private static final Logger sKY = Logger.getLogger(fog_0.class);
    private int sKC;

    fog_0() {
    }

    fog_0(int n) {
        this.sKC = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.sKC);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sKC = byteBuffer.getInt();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        fnm_02.Xu(this.sKC);
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKR;
    }

    public String toString() {
        return "PetColorChange{m_colorItemRefId='" + this.sKC + "'}";
    }
}

