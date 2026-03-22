/*
 * Decompiled with CFR 0.152.
 */
class bag
extends euF {
    bag(baf baf2) {
    }

    @Override
    public void kX(String string) {
        bae.hyM.info((Object)"Token obtained from Zaap. Starting autologin");
        euG.rx(string);
    }

    @Override
    public void kW(String string) {
        bae.hyM.error((Object)("Error during zaap connection(" + string + ")"));
        euG.iY(string);
        euG.fdj();
    }
}

