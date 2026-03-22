/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqY
 */
public class cqy_0
extends cqQ {
    private jh_1 htD;

    @Override
    public int avZ() {
        return 13461;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsP;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.htD = jh_1.bn(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13461;
    }

    public jh_1 ezp() {
        return this.htD;
    }
}

