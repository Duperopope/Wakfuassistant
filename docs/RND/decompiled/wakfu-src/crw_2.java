/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRW
 */
public abstract class crw_2
implements adi_1 {
    protected boolean nEc;

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        if (this.eNu()) {
            this.nEc = cvo_2.eUK().bVe();
            cvo_2.eUK().eUN();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        if (cvo_2.eUK().bVe() && !this.nEc) {
            aue_0.cVJ().b(cvo_2.eUK());
        }
    }

    protected void bB(fey_2 fey_22) {
        if (this.nEc) {
            return;
        }
        cvo_2.eUK().bB(fey_22);
    }

    protected boolean eNu() {
        return true;
    }
}

