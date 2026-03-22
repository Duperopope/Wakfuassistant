/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afO
 */
class afo_0
implements afp_0 {
    final /* synthetic */ afQ crp;
    final /* synthetic */ int crq;
    final /* synthetic */ int crr;
    final /* synthetic */ int crs;
    final /* synthetic */ boolean crt;
    final /* synthetic */ afn_0 cru;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    afo_0(afn_0 afn_02, afQ afQ2, int n, int n2, int n3, boolean bl) {
        this.cru = afn_02;
        this.crp = afQ2;
        this.crq = n;
        this.crr = n2;
        this.crs = n3;
        this.crt = bl;
    }

    @Override
    public void byc() {
        System.out.println("ON REJOUE UPDATE POSITION");
        this.cru.a(this.crp, this.crq, this.crr, this.crs, this.crt);
        this.cru.cro.remove(this);
    }
}

