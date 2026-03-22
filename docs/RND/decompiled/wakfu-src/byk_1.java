/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYK
 */
class byk_1
implements ftl_1 {
    final /* synthetic */ fey_2 lAR;
    final /* synthetic */ byl_1 lAS;
    final /* synthetic */ byj_1 lAT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    byk_1(byj_1 byj_12, fey_2 fey_22, byl_1 byl_12) {
        this.lAT = byj_12;
        this.lAR = fey_22;
        this.lAS = byl_12;
    }

    @Override
    public void epr() {
        if (this.lAR.getPosition().x == 0 || this.lAR.getPosition().y == 0) {
            return;
        }
        this.lAR.setPosition(this.lAR.getX(), this.lAR.getY() - this.lAT.c(this.lAS), true);
        byj_1.f(this.lAS);
        this.lAR.b(this);
    }
}

