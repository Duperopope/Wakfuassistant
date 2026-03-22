/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oZ
 */
final class oz_2 {
    private final xs_2 Sc = new xs_2();
    final /* synthetic */ ox_2 Sd;

    oz_2(ox_2 ox_22) {
        this.Sd = ox_22;
    }

    public void avW() {
        this.Sd.RZ.akH = this.Sc.akH;
        this.Sd.RZ.akI = this.Sc.akI;
        this.Sd.RZ.akJ.clear();
        this.Sd.RZ.akJ.ensureCapacity(this.Sc.akJ.size());
        this.Sd.RZ.akJ.addAll(this.Sc.akJ);
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

