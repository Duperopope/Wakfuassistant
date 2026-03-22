/*
 * Decompiled with CFR 0.152.
 */
class agd
extends afU {
    final /* synthetic */ agb csS;

    agd(agb agb2) {
        this.csS = agb2;
    }

    @Override
    public float getWorldX() {
        return this.csS.bsf();
    }

    @Override
    public float getWorldY() {
        return this.csS.bsg();
    }

    @Override
    public float getAltitude() {
        return super.getAltitude();
    }

    @Override
    public int getScreenX() {
        return this.csS.byK();
    }

    @Override
    public int getScreenY() {
        return this.csS.byL();
    }
}

