/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from apR
 */
public class apr_1 {
    private static final Logger cPb = Logger.getLogger(apr_1.class);
    private static final TIntObjectHashMap<String> cPc = new TIntObjectHashMap(20, 1.0f);

    public static boolean fC(String string) {
        try {
            String string2;
            InputStream inputStream = fq_0.bz(string);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((string2 = bufferedReader.readLine()) != null) {
                if (string2.length() == 0) continue;
                String[] stringArray = StringUtils.split((String)string2, (char)'=');
                if (stringArray.length != 2) {
                    cPb.warn((Object)("Erreur avec la ligne " + string2 + " (" + string + ")"));
                    continue;
                }
                cPc.put(Bw.m(stringArray[0]), (Object)stringArray[1].intern());
            }
            bufferedReader.close();
            inputStream.close();
        }
        catch (IOException iOException) {
            cPb.error((Object)"", (Throwable)iOException);
            return false;
        }
        cPc.setAutoCompactionFactor(0.0f);
        cPc.compact();
        return true;
    }

    public static byte[] by(String string) {
        return fq_0.by(apr_1.bB(string));
    }

    public static URL bA(String string) {
        return new URL(apr_1.bB(string));
    }

    public static String fD(String string) {
        return apr_1.bB(string);
    }

    private static String bB(String string) {
        try {
            String string2 = fo_0.bB(string);
            String string3 = StringUtils.splitByWholeSeparator((String)string2, (String)"!/", (int)0)[0];
            String string4 = fq_0.bJ(string3);
            int n = Bw.m(string4);
            String string5 = (String)cPc.get(n);
            if (string5 == null) {
                return string2;
            }
            String string6 = fq_0.bI(string3);
            Object object = string6.isEmpty() ? "" : "." + string6;
            return string2.replace((CharSequence)object, string5 + (String)object);
        }
        catch (Exception exception) {
            cPb.error((Object)"", (Throwable)exception);
            return string;
        }
    }
}

