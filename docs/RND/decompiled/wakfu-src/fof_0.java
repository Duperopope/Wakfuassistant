/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from foF
 */
public class fof_0
implements evv_2 {
    @NotNull
    private ux_0 sLZ = uw_0.bvJ;

    public boolean gfG() {
        return this.sLZ.i(ue_0.bjV().bjc());
    }

    public void q(fjo_0 fjo_02) {
        if (fjo_02.eCK() != null && fjo_02.eCS() != null) {
            this.sLZ = new uw_0(fjo_02.eCK()).a(fjo_02.eCS());
            return;
        }
        this.sLZ = uw_0.bvJ;
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        long l2 = byteBuffer.getLong();
        this.sLZ = uw_0.fn(l2);
    }

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1(8);
        azg_12.gK(this.sLZ.bjB());
        return azg_12.bTe();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owH;
    }
}

