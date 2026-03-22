/*
 * Decompiled with CFR 0.152.
 */
public final class faq
extends Enum<faq> {
    public static final /* enum */ faq rPh = new faq("CharacterAccountTransfer");
    public static final /* enum */ faq rPi = new faq("WakfuItem");
    public static final /* enum */ faq rPj = new faq("WakfuCharacterRename");
    public static final /* enum */ faq rPk = new faq("WakfuCharacterRestore");
    private final String rPl;
    private static final /* synthetic */ faq[] rPm;

    public static faq[] values() {
        return (faq[])rPm.clone();
    }

    public static faq valueOf(String string) {
        return Enum.valueOf(faq.class, string);
    }

    private faq(String string2) {
        this.rPl = string2;
    }

    public String aLZ() {
        return this.rPl;
    }

    private static /* synthetic */ faq[] fQZ() {
        return new faq[]{rPh, rPi, rPj, rPk};
    }

    static {
        rPm = faq.fQZ();
    }
}

