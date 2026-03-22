/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wY
 */
final class wy_2 {
    private final xp_1 aja = new xp_1();
    private final xp_1 ajb = new xp_1();
    private final xp_1 ajc = new xp_1();
    private final xp_1 ajd = new xp_1();
    final /* synthetic */ wx_1 aje;

    wy_2(wx_1 wx_12) {
        this.aje = wx_12;
    }

    public void avW() {
        this.aje.aiW.ajI.clear();
        this.aje.aiW.ajI.ensureCapacity(this.aja.ajI.size());
        this.aje.aiW.ajI.addAll(this.aja.ajI);
        this.aje.aiW.ajJ = this.aja.ajJ;
        this.aje.aiW.ajK.clear();
        this.aje.aiW.ajK.ensureCapacity(this.aja.ajK.size());
        this.aje.aiW.ajK.addAll(this.aja.ajK);
        this.aje.aiX.ajI.clear();
        this.aje.aiX.ajI.ensureCapacity(this.ajb.ajI.size());
        this.aje.aiX.ajI.addAll(this.ajb.ajI);
        this.aje.aiX.ajJ = this.ajb.ajJ;
        this.aje.aiX.ajK.clear();
        this.aje.aiX.ajK.ensureCapacity(this.ajb.ajK.size());
        this.aje.aiX.ajK.addAll(this.ajb.ajK);
        this.aje.aiY.ajI.clear();
        this.aje.aiY.ajI.ensureCapacity(this.ajc.ajI.size());
        this.aje.aiY.ajI.addAll(this.ajc.ajI);
        this.aje.aiY.ajJ = this.ajc.ajJ;
        this.aje.aiY.ajK.clear();
        this.aje.aiY.ajK.ensureCapacity(this.ajc.ajK.size());
        this.aje.aiY.ajK.addAll(this.ajc.ajK);
        this.aje.aiZ.ajI.clear();
        this.aje.aiZ.ajI.ensureCapacity(this.ajd.ajI.size());
        this.aje.aiZ.ajI.addAll(this.ajd.ajI);
        this.aje.aiZ.ajJ = this.ajd.ajJ;
        this.aje.aiZ.ajK.clear();
        this.aje.aiZ.ajK.ensureCapacity(this.ajd.ajK.size());
        this.aje.aiZ.ajK.addAll(this.ajd.ajK);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        boolean bl = this.aja.b(byteBuffer, 0);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.ajb.b(byteBuffer, 0);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.ajc.b(byteBuffer, 0);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.ajd.b(byteBuffer, 0);
        return bl4;
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

