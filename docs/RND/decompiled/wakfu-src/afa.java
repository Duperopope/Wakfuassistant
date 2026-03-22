/*
 * Decompiled with CFR 0.152.
 */
class afa {
    static final /* synthetic */ int[] cpu;

    static {
        cpu = new int[afh.values().length];
        try {
            afa.cpu[afh.cpT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            afa.cpu[afh.cpU.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            afa.cpu[afh.cpV.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            afa.cpu[afh.cpW.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

