Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZC
 *  ZJ
 *  adJ
 *  adO
 *  bdj
 *  bgy
 *  ezA
 */
class bgA
implements ZJ {
    final /* synthetic */ ezA icC;
    final /* synthetic */ bdj icD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bgA(bgy bgy2, ezA ezA2, bdj bdj2) {
        this.icC = ezA2;
        this.icD = bdj2;
    }

    public void animationEnded(ZC zC) {
        adJ adJ2 = ((adO)this.icC).bvp();
        if (this.icD.buU() != adJ2 || adJ2 == null) {
            return;
        }
        adJ2.e((float)this.icD.bvI(), (float)this.icD.bvJ(), (float)(this.icD.bvK() + this.icD.aKu()));
        this.icD.b((ZJ)this);
    }
}

