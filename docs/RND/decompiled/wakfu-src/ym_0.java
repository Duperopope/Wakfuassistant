/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YM
 */
public class ym_0
extends YL<String> {
    private final Class bUl;

    public ym_0(YN yN, Class clazz) {
        super(yN);
        this.bUl = clazz;
    }

    @Override
    protected String getValue() {
        return this.bTA[0].bor();
    }

    @Override
    public final float floatValue() {
        try {
            return this.intValue();
        }
        catch (Exception exception) {
            return -1.0f;
        }
    }

    @Override
    public final int intValue() {
        try {
            return ((Enum)Enum.valueOf(this.bUl, this.getValue())).ordinal();
        }
        catch (Exception exception) {
            return -1;
        }
    }

    @Override
    public final String bor() {
        return this.getValue();
    }
}

