/*
 * Decompiled with CFR 0.152.
 */
public final class euE
extends Enum<euE> {
    public static final /* enum */ euE orh = new euE("");
    public static final /* enum */ euE ori = new euE("execution.exception");
    public static final /* enum */ euE orj = new euE("pid.exception");
    public static final /* enum */ euE ork = new euE("interrupted.exception");
    public static final /* enum */ euE orl = new euE("execution.exception");
    public static final /* enum */ euE orm = new euE("timeout.exception");
    private final String orn;
    private static final /* synthetic */ euE[] oro;

    public static euE[] values() {
        return (euE[])oro.clone();
    }

    public static euE valueOf(String string) {
        return Enum.valueOf(euE.class, string);
    }

    private euE(String string2) {
        this.orn = string2;
    }

    public String getKey() {
        return this.orn;
    }

    private static /* synthetic */ euE[] fdg() {
        return new euE[]{orh, ori, orj, ork, orl, orm};
    }

    static {
        oro = euE.fdg();
    }
}

