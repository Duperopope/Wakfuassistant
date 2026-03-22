/*
 * Decompiled with CFR 0.152.
 */
public class bJS
extends bjw_0 {
    private bJK kmw;

    bJS() {
    }

    public bJK eaX() {
        return this.kmw;
    }

    @Override
    public void f(bJK bJK2) {
        this.kmw = bJK2;
    }

    @Override
    public bkr_0 eaZ() {
        return bkr_0.knA;
    }

    @Override
    public String[] aHm() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        String[] stringArray = new String[2];
        String string = null;
        if (aum_0.cWf().e(66, this.kmw.d())) {
            string = aum_0.cWf().a(66, (long)this.kmw.d(), new Object[0]);
        }
        stringArray[0] = String.valueOf(string);
        stringArray[1] = String.valueOf(this.kmw.d() == bgt_02.dlp() ? 1 : 0);
        return stringArray;
    }
}

