/*
 * Decompiled with CFR 0.152.
 */
final class BE
extends BA {
    BE(String string2) {
    }

    @Override
    public String getValue() {
        try {
            return Bz.avb.call();
        }
        catch (Exception exception) {
            Bz.auM.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Bz.avb}), (Throwable)exception);
            return "!" + this.aHV() + "!";
        }
    }
}

