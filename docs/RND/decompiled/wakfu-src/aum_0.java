/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aUM
 */
public class aum_0
extends My {
    private static final Logger hrF = Logger.getLogger(aum_0.class);
    private final auo_0[] hrG = new auo_0[]{new auo_0(Mv.aVl), new auo_0(Mv.aVk), new auo_0(Mv.aVo), new auo_0(Mv.aVm)};

    public aum_0() {
        String string = System.getProperty("wakfu.language");
        string = auc_0.cVq().l("language.force", string);
        Mv mv = string == null ? My.aUY() : Mv.cM(string);
        this.d(mv);
        try {
            this.cL(auc_0.cVq().bS("i18nPath"));
        }
        catch (fu_0 fu_02) {
            hrF.error((Object)"Erreur avec le fichier de traduction", (Throwable)fu_02);
        }
        Bz.ave = auk_0.hrk;
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 != ewr_0.oBS) {
                return;
            }
            ArrayList<String> arrayList = ewo_0.oBF.m(ewr_0.oBS);
            ArrayList<VS> arrayList2 = new ArrayList<VS>();
            arrayList2.add(VS.bKA);
            for (String string : arrayList) {
                Mv mv = Mv.f(string, true);
                if (mv == null) continue;
                arrayList2.add(VS.e(mv));
            }
            this.C(arrayList2);
        });
    }

    public static String n(Mv mv) {
        try {
            return String.format(auc_0.cVq().bS("langIconsPath"), mv.aUK().toUpperCase());
        }
        catch (fu_0 fu_02) {
            hrF.warn((Object)fu_02);
            return null;
        }
    }

    public static String c(vb_0 vb_02) {
        try {
            return String.format(auc_0.cVq().bS("langIconsPath"), vb_02.getName().toUpperCase());
        }
        catch (fu_0 fu_02) {
            hrF.warn((Object)fu_02);
            return null;
        }
    }

    public static aum_0 cWf() {
        if (aVT == null) {
            aVT = new aum_0();
        }
        return (aum_0)aVT;
    }

    public static String p(String string, int n) {
        Matcher matcher = aua_0.gzq.matcher(string);
        while (matcher.find()) {
            int n2 = Integer.parseInt(matcher.group(1));
            String string2 = new ahv_2().a(auc_0.cVq().a("textIconsPath", "defaultIconPath", n2), n, n, null).ceL();
            string = StringUtils.replace((String)string, (String)matcher.group(), (String)string2);
        }
        return string;
    }

    public auo_0[] cWg() {
        return this.hrG;
    }

    public auo_0 cWh() {
        Mv mv = this.aUXX();
        for (auo_0 auo_02 : this.hrG) {
            if (auo_02.hrK != mv) continue;
            return auo_02;
        }
        return null;
    }

    public String eZ(boolean bl) {
        return this.c(bl ? "yes" : "no", new Object[0]);
    }

    public String t(ux_0 ux_02) {
        return this.c(ux_02.bjC());
    }

    public String u(ux_0 ux_02) {
        return this.d(ux_02.bjC());
    }

    public String v(ux_0 ux_02) {
        return this.e(ux_02.bjC());
    }

    public String w(ux_0 ux_02) {
        return this.f(ux_02.bjC());
    }

    @NotNull
    public String h(Date date) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(3, 3, this.aUXX().aUJ());
        dateFormat.setTimeZone(uw_0.bvG);
        return dateFormat.format(date);
    }

    @NotNull
    public String i(Date date) {
        DateFormat dateFormat = DateFormat.getDateInstance(3, this.aUXX().aUJ());
        dateFormat.setTimeZone(uw_0.bvG);
        return dateFormat.format(date);
    }

    @NotNull
    public static Date j(Date date) {
        TimeZone timeZone = TimeZone.getTimeZone(ewo_0.oBF.l(ewr_0.oBQ));
        long l = ewo_0.oBF.j(ewr_0.oBP);
        return new Date(date.getTime() + (long)timeZone.getRawOffset() + l);
    }

    @Override
    public void d(Mv mv) {
        super.d(mv);
        VV.bkY().a(VS.bKA, VS.e(mv));
        if (!mv.aUM()) {
            awk_2.aB((byte)2);
        }
        awx_1.dlU = !mv.aUO();
        eiu_0.aPg();
        awc_2.d(mv);
        byf_2.a(mv.aUJ());
    }

    public void C(List<VS> list) {
        VS vS = VS.e(this.aUXX());
        if (!list.contains(vS)) {
            list.add(vS);
        }
        VV.bkY().l(list);
    }

    public String o(Mv mv) {
        switch (mv) {
            case aVk: {
                return this.c("options.french", new Object[0]);
            }
            case aVl: {
                return this.c("options.english", new Object[0]);
            }
            case aVm: {
                return this.c("options.spanish", new Object[0]);
            }
            case aVn: {
                return this.c("options.portuguese", new Object[0]);
            }
        }
        return "";
    }
}

