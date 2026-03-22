/*
 * Decompiled with CFR 0.152.
 */
public class bNQ
extends bNP {
    public bNQ() {
        super(new frm_0(10001, -1));
    }

    public void b(bNS bNS2) {
        this.kIV.remove(bNS2);
        this.kIV.sort(bNR.kIW);
    }

    public void egw() {
        this.kIV.clear();
    }

    @Override
    public Object eu(String string) {
        if (string.equals("island")) {
            return aum_0.cWf().c("zaap.categories.favourite", new Object[0]);
        }
        if (string.equals("links")) {
            return this.egv();
        }
        return null;
    }
}

