/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from fHh
 */
public class fhh_1
implements fib_1<awk_1> {
    private static final Logger uvW = Logger.getLogger(fhh_1.class);
    private final Class<awk_1> uvX = awk_1.class;
    private boolean uvY = false;

    public awk_1 ux(String string) {
        return this.m(this.uvX, string);
    }

    public awk_1 m(Class<? extends awk_1> clazz, String string) {
        return this.m(clazz, string, null);
    }

    public awk_1 m(Class<? extends awk_1> clazz, String string, fhs_2 fhs_22) {
        if (Strings.isNullOrEmpty((String)string) || "null".equalsIgnoreCase(string) || !clazz.equals(this.uvX)) {
            return null;
        }
        awk_1 awk_12 = fyw_0.gqw().gqB().uF(string);
        if (awk_12 != null) {
            return awk_12;
        }
        awk_12 = fmu_1.gEF().vV(string);
        if (awk_12 != null) {
            return awk_12;
        }
        try {
            URL uRL = fo_0.bA(string);
            if (!bl_0.a(uRL)) {
                uvW.warn((Object)("Impossible de lire l'image " + string));
                return null;
            }
            return fmu_1.gEF().k(uRL);
        }
        catch (MalformedURLException malformedURLException) {
            URL uRL = this.getClass().getClassLoader().getResource(string);
            if (uRL != null) {
                return fmu_1.gEF().k(uRL);
            }
            File file = new File(string);
            if (file.exists()) {
                try {
                    return fmu_1.gEF().k(file.toURI().toURL());
                }
                catch (MalformedURLException malformedURLException2) {
                    uvW.error((Object)"MalformedURLException during convert", (Throwable)malformedURLException2);
                }
            }
            uvW.error((Object)("pas de texture " + string));
            return null;
        }
    }

    @Override
    public Class<awk_1> gzM() {
        return this.uvX;
    }

    @Override
    public boolean gzN() {
        return this.uvY;
    }

    public void oU(boolean bl) {
        this.uvY = bl;
    }

    @Override
    public boolean gzO() {
        return false;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends awk_1> clazz, String string, fhu_1 fhu_12) {
        if (string == null || !clazz.equals(this.uvX)) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ftz_22.E(this.uvX);
        awk_1 awk_12 = fyw_0.gqw().gqB().uF(string);
        if (awk_12 != null) {
            return stringBuilder.append("doc.getTexture(\"").append(string).append("\")").toString();
        }
        awk_12 = fmu_1.gEF().vV(string);
        if (awk_12 != null) {
            ftz_22.E(fmu_1.class);
            return stringBuilder.append("TextureLoader.getInstance().loadTextureDirect(\"").append(string).append("\")").toString();
        }
        if (bl_0.bl(string)) {
            String string2 = ftz_22.gHa();
            ftz_22.E(MalformedURLException.class);
            ftz_22.E(fmu_1.class);
            ftz_22.a(new fte_2(this.uvX, string2, "null"));
            ftz_22.a(new fth_2("try {"));
            ftz_22.a(new fth_2("\tURL url = ContentFileHelper.getURL(\"" + string + "\""));
            ftz_22.a(new fte_2(null, string2, "TextureLoader.getInstance().loadTexture(url)", true));
            ftz_22.a(new fth_2("} catch (MalformedURLException e) {}"));
            return string2;
        }
        URL uRL = this.getClass().getClassLoader().getResource(string);
        if (uRL != null) {
            ftz_22.E(fmu_1.class);
            String string3 = ftz_22.gHa();
            ftz_22.a(new fte_2(this.uvX, string3, "null"));
            ftz_22.a(new fth_2("{"));
            ftz_22.a(new fth_2("\tURL url = getClass().getClassLoader().getResource(\"" + string + "\""));
            ftz_22.a(new fte_2(null, string3, "TextureLoader.getInstance().loadTexture(url)", true));
            ftz_22.a(new fth_2("}"));
            return string3;
        }
        File file = new File(string);
        if (file.exists()) {
            try {
                ftz_22.E(fmu_1.class);
                ftz_22.E(File.class);
                ftz_22.E(MalformedURLException.class);
                fmu_1.gEF().k(file.toURI().toURL());
                String string4 = ftz_22.gHa();
                ftz_22.a(new fte_2(this.uvX, string4, "null"));
                ftz_22.a(new fth_2("try {"));
                ftz_22.a(new fth_2("\tFile f = new File(\"" + string + "\""));
                ftz_22.a(new fte_2(null, string4, "TextureLoader.getInstance().loadTexture(f.toURI().toURL())", true));
                ftz_22.a(new fth_2("} catch (MalformedURLException e) {}"));
                return string4;
            }
            catch (MalformedURLException malformedURLException) {
                uvW.error((Object)"MalformedURLException during toJavaCommandLine", (Throwable)malformedURLException);
            }
        }
        uvW.error((Object)("pas de texture " + string));
        return "null";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.ux(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.m(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.m(clazz, string, fhs_22);
    }
}

