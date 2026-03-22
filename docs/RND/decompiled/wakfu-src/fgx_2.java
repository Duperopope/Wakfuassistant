/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGX
 */
public class fgx_2
implements fib_1<Enum> {
    private final Class<Enum> uvB = Enum.class;

    public Enum up(String string) {
        return null;
    }

    public Enum e(Class<? extends Enum> clazz, String string) {
        return this.e(clazz, string, null);
    }

    public Enum e(Class<? extends Enum> clazz, String string, fhs_2 fhs_22) {
        Enum enum_ = null;
        try {
            enum_ = Enum.valueOf(clazz, string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        if (enum_ != null) {
            return enum_;
        }
        if (clazz.getEnumConstants().length > 0) {
            return clazz.getEnumConstants()[0];
        }
        return null;
    }

    @Override
    public Class<Enum> gzM() {
        return this.uvB;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return true;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends Enum> clazz, String string, fhu_1 fhu_12) {
        ftz_22.E(clazz);
        Enum enum_ = null;
        try {
            enum_ = Enum.valueOf(clazz, string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        if (enum_ == null && clazz.getEnumConstants().length > 0) {
            enum_ = clazz.getEnumConstants()[0];
        }
        Enum enum_2 = enum_;
        return clazz.getSimpleName() + "." + enum_2.toString();
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.up(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.e(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.e(clazz, string, fhs_22);
    }
}

