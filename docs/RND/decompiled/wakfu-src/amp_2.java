/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from amp
 */
public class amp_2 {
    protected static final Logger cHP = Logger.getLogger(amp_2.class);
    private final Class<? extends anc_1> cHQ;
    private final boolean cHR;
    private final String[] cHS;
    public static final String cHT = "(\"([^\"\\\\]|\\\\(.|\n))*\")";
    public static final String cHU = "([a-zA-Z]+)";
    public static final String cHV = "([0-9]+)";
    private String cHW = "";

    public amp_2(Class<? extends anc_1> clazz, String ... stringArray) {
        this(clazz, true, stringArray);
    }

    public amp_2(Class<? extends anc_1> clazz, boolean bl, String ... stringArray) {
        this.cHQ = clazz;
        this.cHS = this.l(stringArray);
        this.cHR = bl;
        boolean bl2 = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            if (Pattern.matches(cHU, stringArray[i]) || Pattern.matches(cHT, stringArray[i]) || Pattern.matches(cHV, stringArray[i])) continue;
            if (!bl2) {
                stringBuilder.append('|');
            }
            stringBuilder.append(stringArray[i].replaceAll("([^a-zA-Z0-9])", "\\\\$1"));
            bl2 = false;
        }
        this.cHW = stringBuilder.toString();
        if (!bl2) {
            this.cHW = "(" + this.cHW + ")";
        }
    }

    public anc_1 fi(String string) {
        anc_1 anc_12 = null;
        try {
            Constructor<? extends anc_1> constructor = this.cHQ.getConstructor(String.class);
            anc_12 = constructor.newInstance(string);
        }
        catch (InstantiationException instantiationException) {
            cHP.error((Object)"InstantiationException during getLexem", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            cHP.error((Object)"IllegalAccessException during getLexem", (Throwable)illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            cHP.error((Object)"NoSuchMethodException during getLexem", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            cHP.error((Object)"InvocationTargetException during getLexem", (Throwable)invocationTargetException);
        }
        return anc_12;
    }

    public boolean fj(String string) {
        for (String string2 : this.cHS) {
            if ((!this.cHR || !string2.equalsIgnoreCase(string)) && (this.cHR || !string2.equals(string))) continue;
            return true;
        }
        return false;
    }

    public String bDd() {
        return this.cHW;
    }

    private String[] l(String[] stringArray) {
        return this.b(stringArray, stringArray.length - 1);
    }

    private String[] b(String[] stringArray, int n) {
        if (n > 0) {
            this.b(stringArray, n - 1);
            for (int i = 0; i < n; ++i) {
                if (stringArray[i].length() > stringArray[n].length() || stringArray[i].length() >= stringArray[n].length()) continue;
                String string = stringArray[n];
                stringArray[n] = stringArray[i];
                stringArray[i] = string;
            }
        }
        return stringArray;
    }
}

