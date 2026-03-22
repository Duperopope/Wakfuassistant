/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fHd
 */
public class fhd_1
implements fib_1<Object> {
    protected static final Logger uvM = Logger.getLogger(fhd_1.class);
    public static final Class<Object> uvN = Object.class;

    public String uv(String string) {
        return this.k(uvN, string);
    }

    public String k(Class<? extends Object> clazz, String string) {
        return string;
    }

    @Override
    public Object b(Class<?> clazz, String string, fhs_2 fhs_22) {
        return string;
    }

    @Override
    public Class<Object> gzM() {
        return uvN;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return false;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends Object> clazz, String string, fhu_1 fhu_12) {
        return "\"" + string + "\"";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uv(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.k(clazz, string);
    }
}

