/*
 * Decompiled with CFR 0.152.
 */
class bip
implements alx_2 {
    final /* synthetic */ bio_0 ikx;

    bip(bio_0 bio_02) {
        this.ikx = bio_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.startsWith("questActivationDialog")) {
            fyw_0.gqw().b(this);
            fyw_0.gqw().tc("wakfu.quests");
            ccg_2.eJI().b(this.ikx.ikw);
        }
    }
}

