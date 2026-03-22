/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from cyA
 */
public class cya_0
extends nr_0 {
    private final Set<fps_0> mmC = new HashSet<fps_0>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            fps_0 fps_02 = new fps_0(byteBuffer.getLong());
            fps_02.a(fpR.fz(byteBuffer.get()));
            fps_02.uA(byteBuffer.getLong());
            this.mmC.add(fps_02);
        }
        return false;
    }

    public Set<fps_0> eFB() {
        return this.mmC;
    }

    @Override
    public int d() {
        return 15003;
    }
}

