/*
 * Decompiled with CFR 0.152.
 */
class aYH
implements aqg_1<ame_0> {
    aYH(ayg_0 ayg_02) {
    }

    public void a(ame_0 ame_02) {
        switch (ame_02.clb()) {
            case 0: {
                ayg_0.hxP.error((Object)("Emote de type invalide id=" + ame_02.d()));
                break;
            }
            case 1: {
                bbl_0.hBr.b(ame_02);
                break;
            }
            case 2: {
                bbl_0.hBr.c(ame_02);
            }
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((ame_0)aqz_22);
    }
}

