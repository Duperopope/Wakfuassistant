/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from crA
 */
public class cra_0
extends nr_0 {
    private faz_0 mgp;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = byteBuffer.get() == 1;
        this.mgp = bl ? fak_0.fQ(byteBuffer) : null;
        return true;
    }

    public String HR() {
        return this.mgp == null ? null : this.mgp.HR();
    }

    public long HP() {
        return this.mgp == null ? 0L : this.mgp.HP();
    }

    public ArrayList<fas_0> eAf() {
        return this.mgp == null ? new ArrayList<fas_0>() : new ArrayList(this.mgp.fRq().valueCollection());
    }

    public long Ya() {
        return this.mgp == null ? 0L : this.mgp.Ya();
    }

    public boolean dLd() {
        return this.mgp == null || this.mgp.dLd();
    }

    public boolean eqR() {
        return this.mgp != null;
    }

    @Override
    public int d() {
        return 14941;
    }
}

