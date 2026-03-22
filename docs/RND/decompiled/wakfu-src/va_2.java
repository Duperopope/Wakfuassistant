/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vA
 */
final class va_2 {
    private final ue_1 afI = new ue_1();
    final /* synthetic */ vz_1 afJ;

    va_2(vz_1 vz_12) {
        this.afJ = vz_12;
    }

    public void avW() {
        this.afJ.afH.acq = this.afI.acq;
        this.afJ.afH.acr = this.afI.acr;
        this.afJ.afH.RG = this.afI.RG;
        this.afJ.afH.acs = this.afI.acs;
        this.afJ.afH.act.alH.clear();
        this.afJ.afH.act.alH.ensureCapacity(this.afI.act.alH.size());
        this.afJ.afH.act.alH.addAll(this.afI.act.alH);
        this.afJ.afH.acu.aau.clear();
        this.afJ.afH.acu.aau.ensureCapacity(this.afI.acu.aau.size());
        this.afJ.afH.acu.aau.addAll(this.afI.acu.aau);
        this.afJ.afH.acv.clear();
        this.afJ.afH.acv.ensureCapacity(this.afI.acv.size());
        this.afJ.afH.acv.addAll(this.afI.acv);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.afI.b(byteBuffer, 1);
        return bl;
    }

    private boolean ds(ByteBuffer byteBuffer) {
        boolean bl = this.afI.b(byteBuffer, 0x992323);
        return bl;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        boolean bl = this.afI.b(byteBuffer, 10048002);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.ds(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

