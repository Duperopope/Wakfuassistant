/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blE
 */
class ble_1
implements ZJ {
    final /* synthetic */ fax_1 ivq;
    final /* synthetic */ ZG ivr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ble_1(bly_0 bly_02, fax_1 fax_12, ZG zG) {
        this.ivq = fax_12;
        this.ivr = zG;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.ivq.setAnimName("AnimStatique");
        this.ivr.b(this);
    }
}

