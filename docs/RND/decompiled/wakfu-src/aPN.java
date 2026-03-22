/*
 * Decompiled with CFR 0.152.
 */
public final class aPN
extends Enum<aPN> {
    public static final /* enum */ aPN eAG = new aPN();
    public static final /* enum */ aPN eAH = new aPN();
    public static final /* enum */ aPN eAI = new aPN();
    private static final /* synthetic */ aPN[] eAJ;

    public static aPN[] values() {
        return (aPN[])eAJ.clone();
    }

    public static aPN valueOf(String string) {
        return Enum.valueOf(aPN.class, string);
    }

    private static /* synthetic */ aPN[] cBj() {
        return new aPN[]{eAG, eAH, eAI};
    }

    static {
        eAJ = aPN.cBj();
    }
}

