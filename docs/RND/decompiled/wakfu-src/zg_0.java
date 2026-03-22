/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Zg
 */
public final class zg_0
extends zb_0<Ym> {
    public zg_0(String string) {
        super(string);
    }

    public Ym boZ() {
        return new Ym();
    }

    @Override
    public void a(Ym ym, ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        ym.axs = BH.dc(byArray);
    }

    @Override
    public void a(fs_0 fs_02, String string) {
        byte[] byArray = BH.aP(string);
        fs_02.g((byte)byArray.length);
        fs_02.di(byArray);
    }

    @Override
    public /* synthetic */ Yh boU() {
        return this.boZ();
    }
}

