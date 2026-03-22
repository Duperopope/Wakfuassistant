/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class VV {
    public static boolean bLb = true;
    private static final Logger bLc = Logger.getLogger(VV.class);
    private static final VV bLd = new VV();
    private final ArrayList<VS> bLe = new ArrayList();
    private final TIntObjectHashMap<VT> bLf = new TIntObjectHashMap();
    private VQ bLg;
    private static final String bLh = "(<\\D[^/]+>)|(<.*/\\D>)";
    private static final String bLi = "[\\xB2]";
    private final ArrayList<Pattern> bLj = new ArrayList();
    private final ArrayList<Pattern> bLk = new ArrayList();
    private final ArrayList<Pattern> bLl = new ArrayList();
    private final ArrayList<Pattern> bLm = new ArrayList();
    private final ArrayList<Pattern> bLn = new ArrayList();
    private boolean bLo = false;

    public static VV bkY() {
        return bLd;
    }

    public void br(boolean bl) {
        this.bLo = bl;
    }

    public void a(VT vT) {
        this.bLf.put(vT.d(), (Object)vT);
    }

    public void l(List<VS> list) {
        this.bLe.clear();
        this.bLe.addAll(list);
        this.bkZ();
    }

    public void a(VS ... vSArray) {
        this.l(Arrays.asList(vSArray));
    }

    public void a(VQ vQ) {
        this.bLl.clear();
        this.bLk.clear();
        this.bLm.clear();
        this.bLn.clear();
        this.bLj.clear();
        vQ.a(this);
        if (this.bLg == null) {
            this.bLg = vQ;
        }
    }

    public void bkZ() {
        if (this.bLg != null) {
            this.a(this.bLg);
        }
    }

    public void d(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.bLl.addAll(VU.b(tShortObjectHashMap));
    }

    public void e(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.bLl.addAll(VU.c(tShortObjectHashMap));
    }

    public void f(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.bLj.addAll(VU.b(tShortObjectHashMap));
    }

    public void g(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.bLj.addAll(VU.c(tShortObjectHashMap));
    }

    public void h(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = VU.b(tShortObjectHashMap);
        this.bLm.addAll(arrayList);
        this.bLk.addAll(arrayList);
    }

    public void i(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = VU.c(tShortObjectHashMap);
        this.bLn.addAll(arrayList);
        this.bLk.addAll(arrayList);
    }

    public boolean dB(String string) {
        if (!bLb) {
            return true;
        }
        if (string == null || string.length() == 0) {
            return true;
        }
        String string2 = BH.aT(string);
        return !this.e(string2, this.bLj) && !this.e(string2, this.bLk) && !this.e(string2, this.bLl);
    }

    private boolean e(String string, ArrayList<Pattern> arrayList) {
        return this.f(string, arrayList) != null;
    }

    private Matcher f(String string, ArrayList<Pattern> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Pattern pattern = arrayList.get(i);
            Matcher matcher = pattern.matcher(string);
            if (!matcher.find()) continue;
            matcher.reset();
            return matcher;
        }
        return null;
    }

    public String g(String string, boolean bl) {
        if (string == null || string.trim().isEmpty()) {
            return "";
        }
        if (!bLb) {
            return string;
        }
        String string2 = string.replaceAll(bLi, "");
        if (this.e(string2, this.bLl)) {
            return "";
        }
        if (!bl && !this.bLo) {
            return string2;
        }
        ArrayList<azx_1<Integer, String>> arrayList = new ArrayList<azx_1<Integer, String>>();
        Pattern pattern = Pattern.compile(bLh);
        Object object = "";
        Matcher matcher = pattern.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            int n2 = matcher.start();
            int n3 = matcher.end();
            String string3 = string2.substring(n2, n3);
            object = (String)object + string2.substring(n, n2);
            arrayList.add(new azx_1<Integer, String>(n2, string3));
            n = n3;
        }
        if (((String)(object = (String)object + string2.substring(n))).isEmpty()) {
            object = string2;
        }
        String string4 = null;
        if (!this.bLk.isEmpty()) {
            string4 = VU.c((String)object, this.bLk);
        } else if (!this.bLm.isEmpty() && !this.bLn.isEmpty()) {
            String string5 = VU.d((String)object, this.bLm);
            string4 = VU.d(string5, this.bLn);
        }
        if (string4 == null) {
            bLc.error((Object)("[TRANSLATION] No censor pattern matched for languages " + String.valueOf(this.bLe)));
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!arrayList.isEmpty()) {
            int n4 = 0;
            for (azx_1 azx_12 : arrayList) {
                int n5 = (Integer)azx_12.getFirst();
                String string6 = (String)azx_12.aHI();
                int n6 = n5 + string6.length();
                stringBuilder.append(string2.substring(n4, n5)).append(string6);
                n4 = n6;
            }
            stringBuilder.append(string2.substring(n4));
        } else {
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public ArrayList<VS> bla() {
        return this.bLe;
    }

    public TIntObjectHashMap<VT> blb() {
        return this.bLf;
    }
}

