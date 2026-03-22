/*
 * Decompiled with CFR 0.152.
 */
final class BG
extends BA {
    BG(String string2) {
    }

    @Override
    public String getValue() {
        try {
            return Bz.avd.call();
        }
        catch (Exception exception) {
            Bz.auM.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Bz.avd}), (Throwable)exception);
            return "!" + this.aHV() + "!";
        }
    }
}

