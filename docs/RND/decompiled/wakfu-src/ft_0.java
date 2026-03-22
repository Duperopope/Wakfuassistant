/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.log4j.Logger;

/*
 * Renamed from Ft
 */
public class ft_0 {
    private static final Logger aBq = Logger.getLogger(ft_0.class);
    private static final String aBr = ",";
    private static final String aBs = "%s_";
    private static final String aBt = "%s_%d";
    private final Properties aBu = new Properties();

    public String bS(String string) {
        String string2 = this.aBu.getProperty(string);
        if (string2 == null) {
            throw new fu_0("Il n'existe pas de propri\u00e9t\u00e9: " + string);
        }
        return string2;
    }

    public String l(String string, String string2) {
        String string3 = this.aBu.getProperty(string);
        return string3 == null ? string2 : string3;
    }

    public ArrayList<String> bT(String string) {
        int n = 1;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = String.format(aBt, string, n);
        while (this.aBu.containsKey(string2)) {
            arrayList.add(this.bS(string2));
            string2 = String.format(aBt, string, ++n);
        }
        return arrayList;
    }

    public String[] bU(String string) {
        String string2 = this.bS(string);
        return this.cc(string2);
    }

    public ArrayList<String[]> bV(String string) {
        ArrayList<String> arrayList = this.bT(string);
        ArrayList<String[]> arrayList2 = new ArrayList<String[]>();
        for (String string2 : arrayList) {
            arrayList2.add(this.cc(string2));
        }
        return arrayList2;
    }

    public int bW(String string) {
        String string2 = this.bS(string);
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new fu_0("La propri\u00e9t\u00e9 " + string + " n'est pas un int.");
        }
    }

    public int d(String string, int n) {
        return Bw.b((Object)this.aBu.getProperty(string), n);
    }

    public float bX(String string) {
        String string2 = this.bS(string);
        try {
            return Float.valueOf(string2).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            throw new fu_0("La propri\u00e9t\u00e9 " + string + " n'est pas un float.");
        }
    }

    public float a(String string, float f2) {
        return Bw.a((Object)this.aBu.getProperty(string), f2);
    }

    public double bY(String string) {
        String string2 = this.bS(string);
        try {
            return Double.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new fu_0("La propri\u00e9t\u00e9 " + string + " n'est pas un double.");
        }
    }

    public double a(String string, double d2) {
        return Bw.a((Object)this.aBu.getProperty(string), d2);
    }

    public boolean aK(String string) {
        String string2 = this.bS(string);
        return Boolean.valueOf(string2);
    }

    public boolean b(String string, boolean bl) {
        return Bw.b(this.aBu.getProperty(string), bl);
    }

    public void m(String string, String string2) {
        if (this.aBu != null) {
            this.aBu.setProperty(string, string2);
        }
    }

    public void a(String string, ArrayList<String> arrayList) {
        int n = 1;
        for (String string2 : arrayList) {
            String string3 = String.format(aBt, string, n++);
            this.m(string3, string2);
        }
    }

    public void b(String string, ArrayList<String[]> arrayList) {
        int n = 1;
        for (String[] stringArray : arrayList) {
            String string2 = String.format(aBt, string, n++);
            this.a(string2, stringArray);
        }
    }

    public void a(String string, String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            stringBuilder.append(stringArray[i]);
            if (i >= stringArray.length - 1) continue;
            stringBuilder.append(aBr);
        }
        this.m(string, stringBuilder.toString());
    }

    public void e(String string, int n) {
        this.m(string, Integer.toString(n));
    }

    public void b(String string, float f2) {
        this.m(string, Float.toString(f2));
    }

    public void b(String string, double d2) {
        this.m(string, Double.toString(d2));
    }

    public void d(String string, boolean bl) {
        this.m(string, Boolean.toString(bl));
    }

    public boolean gJ(InputStream inputStream) {
        try {
            this.aBu.load(inputStream);
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    public boolean c(URL uRL) {
        try {
            if (uRL != null) {
                return this.gJ(uRL.openStream());
            }
            aBq.error((Object)"url nulle au load.");
            return false;
        }
        catch (IOException iOException) {
            aBq.error((Object)"IOException during PropertiesReaderWriter load", (Throwable)iOException);
            return false;
        }
    }

    public boolean bZ(String string) {
        try {
            File file = new File(string);
            if (file.exists()) {
                return this.gJ(new FileInputStream(file));
            }
            URL uRL = this.getClass().getClassLoader().getResource(string);
            if (uRL != null) {
                return this.c(uRL);
            }
            aBq.error((Object)("Impossible de trouver le fichier de propri\u00e9t\u00e9 " + string));
            return false;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
    }

    public boolean ca(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            this.aBu.store(fileOutputStream, null);
            ((OutputStream)fileOutputStream).close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
        return true;
    }

    public void cb(String string) {
        String string2 = String.format(aBs, string);
        Enumeration<Object> enumeration = this.aBu.keys();
        while (enumeration.hasMoreElements()) {
            String string3;
            Object object = enumeration.nextElement();
            if (!(object instanceof String) || !(string3 = (String)object).startsWith(string2)) continue;
            this.aBu.remove(string3);
        }
    }

    private String[] cc(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, aBr);
        Vector<String> vector = new Vector<String>();
        while (stringTokenizer.hasMoreTokens()) {
            vector.addElement(stringTokenizer.nextToken());
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }
}

