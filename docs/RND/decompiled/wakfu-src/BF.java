/*
 * Decompiled with CFR 0.152.
 */
final class BF
extends BA {
    BF(String string2) {
    }

    @Override
    public String getValue() {
        try {
            return Bz.avc.call();
        }
        catch (Exception exception) {
            Bz.auM.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Bz.avc}), (Throwable)exception);
            return "!" + this.aHV() + "!";
        }
    }
}

