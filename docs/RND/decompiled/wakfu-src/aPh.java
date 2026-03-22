/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class aPh {
    private static final Pattern ewO = Pattern.compile("<[^<>]*>");
    private static final Logger ewP = Logger.getLogger(aPh.class);
    private static final Logger ewQ = Logger.getLogger((String)"chat");
    private static final aPh ewR = new aPh();
    private aqg_0 ewS;
    private aPF ewT;
    private EnumMap<aPl, apj_0> ewU;
    private final LinkedList<String> ewV = new LinkedList();
    private final LinkedList<String> ewW = new LinkedList();
    private boolean ewX = false;

    public static aPh czg() {
        return ewR;
    }

    public void a(aQm aQm2, URL uRL, aPF aPF2) {
        this.ewS = new aqg_0();
        this.ewS.eQ(false);
        this.ewS.eP(false);
        this.ewS.a(aQm2);
        if (uRL != null) {
            this.ewS.g(uRL);
        } else {
            ewP.error((Object)"Impossible de charger les commandes de chat !");
        }
        this.ewT = aPF2;
    }

    public aqg_0 czh() {
        return this.ewS;
    }

    public apj_0 i(aPl aPl2) {
        return this.c(new apy_0(aPl2));
    }

    public apj_0 j(aPl aPl2) {
        return this.c(new apw_0(aPl2));
    }

    public apj_0 k(aPl aPl2) {
        return this.c(new aPX(aPl2));
    }

    private apj_0 c(apj_0 apj_02) {
        if (this.ewU == null) {
            this.ewU = new EnumMap(aPl.class);
        }
        this.ewU.put(apj_02.czu(), apj_02);
        return apj_02;
    }

    public apj_0 l(aPl aPl2) {
        return this.ewU.get((Object)aPl2);
    }

    public apj_0 iX(String string) {
        for (apj_0 apj_02 : this.ewU.values()) {
            if (!apj_02.getName().equals(string)) continue;
            return apj_02;
        }
        return null;
    }

    public void a(String string, aPl aPl2) {
        api_0 api_02 = new api_0(string);
        api_02.m(aPl2);
        this.e(api_02);
        apj_0 apj_02 = this.ewU.get((Object)api_02.czl());
        if (apj_02 instanceof apw_0) {
            ewP.warn((Object)"Wrong function used for a bubble pipe, use pushChatMessage() instead");
        }
        apj_02.g(api_02);
    }

    public void iY(String string) {
        this.a(string, aPl.exs);
    }

    public void iZ(String string) {
        this.a(string, aPl.ext);
    }

    public void ja(String string) {
        if (string.contains("color=")) {
            this.a(string, aPl.exu);
            return;
        }
        String string2 = new ahv_2().ceC().e(aPc.ewv).c(string).ceD().ceL();
        this.a(string2, aPl.exu);
    }

    public void jb(String string) {
        this.a(string, aPl.exy);
    }

    public void a(api_0 api_02, String string, boolean bl) {
        this.a(api_02, bl);
        apj_0 apj_02 = this.ewU.get((Object)api_02.czl());
        apj_02.a(api_02, string);
    }

    public void d(api_0 api_02) {
        this.e(api_02);
        apj_0 apj_02 = this.ewU.get((Object)api_02.czl());
        apj_02.g(api_02);
    }

    private void e(api_0 api_02) {
        String string = this.ewU.get((Object)api_02.czl()).getName();
        String string2 = api_02.czo();
        String string3 = api_02.getMessage();
        ewQ.info((Object)("[" + string + "] " + (String)(string2 == null ? "" : string2 + " : ") + aPh.jc(string3)));
    }

    private void a(api_0 api_02, boolean bl) {
        String string = this.ewU.get((Object)api_02.czl()).getName();
        String string2 = api_02.czo();
        String string3 = api_02.getMessage();
        String string4 = string2 == null ? "[" + string + "] " + aPh.jc(string3) : (bl ? "[" + string + "] TO \"" + string2 + "\" : " + aPh.jc(string3) : "[" + string + "] FROM \"" + string2 + "\" : " + aPh.jc(string3));
        ewQ.info((Object)string4);
    }

    private static String jc(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        Matcher matcher = ewO.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start());
            n = matcher.end();
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    public String eA(boolean bl) {
        String string;
        if (this.ewV.isEmpty()) {
            return null;
        }
        if (bl) {
            string = this.ewV.removeFirst();
            this.ewV.addLast(string);
        } else {
            string = this.ewV.removeLast();
            this.ewV.addFirst(string);
        }
        return string;
    }

    public void jd(String string) {
        if (this.ewV.contains(string)) {
            this.ewV.remove(string);
            this.ewV.addLast(string);
        } else {
            this.ewV.add(string);
        }
        if (!this.ewW.contains(string)) {
            this.ewW.add(string);
        }
        if (this.ewW.size() > 10 || this.ewV.size() > 10) {
            String string2 = this.ewW.removeFirst();
            this.ewV.remove(string2);
        }
    }

    public void clean() {
        this.ewV.clear();
        this.ewW.clear();
        for (apj_0 apj_02 : this.ewU.values()) {
            apj_02.clean();
        }
    }

    public Collection<apj_0> czi() {
        return this.ewU.values();
    }

    public aPF czj() {
        return this.ewT;
    }

    public boolean czk() {
        return this.ewX;
    }

    public void eB(boolean bl) {
        this.ewX = bl;
    }
}

