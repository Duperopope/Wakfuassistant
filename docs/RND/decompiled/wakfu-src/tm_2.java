/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tm
 */
final class tm_2 {
    private int aac = 0;
    private final ArrayList<tj_2> aan = new ArrayList(0);
    private final ArrayList<tk_1> aao = new ArrayList(0);
    private final ArrayList<tl_2> aap = new ArrayList(0);
    private final ArrayList<to_1> aaq = new ArrayList(0);
    private tn_2 aah = null;
    final /* synthetic */ ti_1 aar;

    tm_2(ti_1 ti_12) {
        this.aar = ti_12;
    }

    public void avW() {
        this.aar.aac = this.aac;
        this.aar.aad.clear();
        this.aar.aad.ensureCapacity(this.aan.size());
        this.aar.aad.addAll(this.aan);
        this.aar.aae.clear();
        this.aar.aae.ensureCapacity(this.aao.size());
        this.aar.aae.addAll(this.aao);
        this.aar.aaf.clear();
        this.aar.aaf.ensureCapacity(this.aap.size());
        this.aar.aaf.addAll(this.aap);
        this.aar.aag.clear();
        this.aar.aag.ensureCapacity(this.aaq.size());
        this.aar.aag.addAll(this.aaq);
        this.aar.aah = this.aah;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

