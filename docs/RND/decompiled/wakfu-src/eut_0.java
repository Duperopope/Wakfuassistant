/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from eUt
 */
class eut_0
implements euu_0 {
    final /* synthetic */ short ruB;
    final /* synthetic */ short ruC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eut_0(short s, short s2) {
        this.ruB = s;
        this.ruC = s2;
    }

    @Override
    public wy_0 l(short s, short s2) {
        try {
            wa_0.b(this.ruB, s, s2);
            return wa_0.b((long)this.ruB, s, s2, this.ruC);
        }
        catch (IOException iOException) {
            eUq.ruw.error((Object)("Unable to load map (" + s + "; " + s2 + ")"));
            return null;
        }
    }
}

