/*
 * Decompiled with CFR 0.152.
 */
class baf
extends euF {
    baf(bae bae2) {
    }

    @Override
    public void cZe() {
        bae.hyM.info((Object)"Connected to Zaap. Starting token fill");
        euG.ors.b(new bag(this));
    }

    @Override
    public void kW(String string) {
        bae.hyM.error((Object)("Error during zaap connection(" + string + ")"));
        euG.iY(string);
        euG.fdj();
    }
}

