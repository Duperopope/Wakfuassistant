/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXs
 */
public final class exs_2
implements exn_1 {
    private final exa_1<exf_2> rFW;
    private final exx_2 rFX;
    private final exx_2 rFY;
    private final float rFZ;
    private int rGa = 0;

    public exs_2(exa_1<exf_2> exa_12, exx_2 exx_22, exx_2 exx_23, float f2) {
        this.rFW = exa_12;
        this.rFX = exx_22;
        this.rFY = exx_23;
        this.rFZ = f2;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        if (n == 0) {
            return;
        }
        exf_2 exf_22 = this.rFW.b(this.rFX);
        exf_2 exf_23 = this.rFW.b(this.rFY);
        exf_23.oq(this.rGa);
        int n2 = exf_22.aYB();
        int n3 = (int)Math.floor(this.rFZ * (float)n2);
        this.rGa = exf_23.nt(n3);
    }
}

