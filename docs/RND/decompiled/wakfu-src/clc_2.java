/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLc
 */
class clc_2
implements ffd_2 {
    final /* synthetic */ Runnable neZ;
    final /* synthetic */ clb_2 nfa;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clc_2(clb_2 clb_22, Runnable runnable) {
        this.nfa = clb_22;
        this.neZ = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfa.neX.b(this);
        this.nfa.neX.setNeedsToPostProcess();
        this.nfa.neX.a(new cld_2(this));
    }
}

