/*
 * Decompiled with CFR 0.152.
 */
public class bEb
implements aeh_2 {
    private static final bEb jMf = new bEb();
    private static final String[] jMg = new String[]{"isEmptySlot", "isEnabled", "darkened"};

    private bEb() {
    }

    public static bEb dRP() {
        return jMf;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("isEmptySlot")) {
            return true;
        }
        if (string.equals("isEnabled")) {
            return true;
        }
        if (string.equals("darkened")) {
            return false;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return jMg;
    }
}

