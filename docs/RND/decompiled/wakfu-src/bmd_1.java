/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bMd
 */
public abstract class bmd_1
implements aeh_2 {
    private static final Logger kvM = Logger.getLogger(bmd_1.class);
    public static final String kvN = "spells";
    public static final Pattern kvO = Pattern.compile("spell([0-9]+)");
    private fqP<bmx_0> kvP = null;
    public static final String[] kvQ = new String[]{"spells"};

    @Override
    public Object eu(String string) {
        if (string.equals(kvN)) {
            return this.dkJ();
        }
        Matcher matcher = kvO.matcher(string);
        if (matcher.matches()) {
            short s = Short.valueOf(matcher.group(1));
            return this.cf(s);
        }
        return null;
    }

    public bmx_0 eei() {
        int n = Short.MAX_VALUE;
        bmx_0 bmx_02 = null;
        for (bmx_0 bmx_03 : this.dkJ()) {
            if (((bmt_0)bmx_03.giP()).cvD() >= Short.MAX_VALUE) continue;
            bmx_02 = bmx_03;
        }
        return bmx_02;
    }

    public bmx_0 cf(short s) {
        for (bmx_0 bmx_02 : this.dkJ()) {
            if (((bmt_0)bmx_02.giP()).cvD() != s) continue;
            return bmx_02;
        }
        return null;
    }

    public void eej() {
        fse_1.gFu().a((aef_2)this, kvN);
    }

    public abstract Iterable<bmx_0> dkJ();

    public fqP<bmx_0> eek() {
        return this.kvP;
    }

    public boolean dkN() {
        return this.kvP != null;
    }

    public void a(List<bmx_0> list, exP exP2) {
        this.T(exP2);
        for (bmx_0 bmx_02 : list) {
            try {
                ((Sg)this.kvP).b(bmx_02);
            }
            catch (sa_0 sa_02) {
                kvM.error((Object)"Exception levee", (Throwable)sa_02);
            }
            catch (Sz sz) {
                kvM.error((Object)"Exception levee", (Throwable)sz);
            }
        }
    }

    public void T(exP exP2) {
        this.kvP = new fqP<bmx_0>(zh_22 -> new bmx_0(exP2), 80, new bmz_0(exP2), null, false, false, false);
    }

    public void dkM() {
        if (this.kvP == null) {
            return;
        }
        this.kvP.beQ();
        this.kvP = null;
    }
}

