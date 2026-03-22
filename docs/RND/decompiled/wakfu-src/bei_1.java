/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEi
 */
public class bei_1
implements aeh_2 {
    private final aef_2 jNK;

    public bei_1(aef_2 aef_22) {
        this.jNK = aef_22;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("isEnabled")) {
            return false;
        }
        return this.jNK.eu(string);
    }

    public aef_2 dRY() {
        return this.jNK;
    }
}

