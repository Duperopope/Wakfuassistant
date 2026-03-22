/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from arq
 */
public final class arq_1 {
    private static final Logger cSZ = Logger.getLogger(arq_1.class);
    private static final boolean cTa = true;
    public static final String cTb = "(.*)/(.*)";
    private final HashMap<String, Anm> cTc = new HashMap();
    private boolean cTd = false;
    private final boolean cTe;
    private final boolean cTf;
    private final Semaphore cTg = new Semaphore(1);
    private static final arq_1 cTh = new arq_1();

    private arq_1() {
        this.cTe = true;
        this.cTf = false;
    }

    public static arq_1 bHF() {
        return cTh;
    }

    public boolean bHG() {
        return this.cTe;
    }

    public boolean bHH() {
        return this.cTf;
    }

    public void w(String string, String string2) {
        try (apl_1 apl_12 = apl_1.dw(fo_0.by(string));){
            int n = 0;
            int n2 = apl_12.aIA();
            Pattern pattern = Pattern.compile(cTb);
            for (int i = 0; i < n2; ++i) {
                int n3 = apl_12.aIz() & 0xFFFF;
                byte[] byArray = apl_12.mv(n3);
                String string3 = BH.dc(byArray);
                Matcher matcher = pattern.matcher(string3);
                if (!matcher.matches()) {
                    cSZ.error((Object)(string3 + " not matches pattern : " + String.valueOf(pattern)));
                    continue;
                }
                String string4 = matcher.group(1);
                String string5 = matcher.group(2);
                String string6 = string2.replaceAll("\\$1", string4).replaceAll("\\$2", string5);
                try {
                    Anm anm = this.u(string6, false);
                    anm.bGY();
                    cSZ.trace((Object)("Preloading common Anm : " + string6));
                    ++n;
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    cSZ.error((Object)String.format("[Animation] Anm not found : %s", string6), (Throwable)new are_1(string6));
                    continue;
                }
                catch (IOException iOException) {
                    cSZ.error((Object)("Unable to load " + string6), (Throwable)iOException);
                }
            }
            cSZ.trace((Object)("Preloading Anms : " + n + " files"));
        }
        catch (IOException iOException) {
            cSZ.error((Object)"Error while loading Common Animations :", (Throwable)iOException);
        }
    }

    public aro_1 t(String string, boolean bl) {
        Anm anm = this.u(string, bl);
        if (anm == null) {
            return null;
        }
        String string2 = fq_0.bJ(string);
        String string3 = fq_0.bH(string);
        return new aro_1(anm, string2, string3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Anm u(String string, boolean bl) {
        Anm anm;
        this.cTg.acquireUninterruptibly();
        try {
            anm = this.cTc.get(string);
            if (anm == null) {
                anm = (Anm)Anm.cRy.bSK();
                anm.k(string, bl);
                this.cTc.put(string, anm);
            }
        }
        finally {
            this.cTg.release();
        }
        return anm;
    }

    public void a(String string, ew_1 ew_12, aro_1 aro_12) {
        this.a(string, ew_12, aro_12, false);
    }

    public void a(String string, ew_1 ew_12, aro_1 aro_12, boolean bl) {
        assert (aro_12 != null);
        assert (ew_12 != null);
        String string2 = aro_12.bpu() + string;
        Anm anm = this.cTc.get(string2);
        if (anm == null) {
            try {
                anm = this.u(string2, this.cTe);
            }
            catch (IOException iOException) {
                cSZ.error((Object)("Unable to load file " + string2), (Throwable)iOException);
            }
        }
        if (anm == null) {
            aro_12.a((Anm)null, (fk_0)null);
            return;
        }
        if (anm.aLB()) {
            aro_12.a(anm, anm.bGV().aIF().mJ(ew_12.aJE()), bl);
        } else {
            aro_12.cSt = ew_12.getName();
            aro_12.a((Anm)null, (fk_0)null);
        }
    }

    public void aPc() {
        this.cTg.acquireUninterruptibly();
        Set<Map.Entry<String, Anm>> set = this.cTc.entrySet();
        Iterator<Map.Entry<String, Anm>> iterator = set.iterator();
        for (int i = this.cTc.size(); i > 0; --i) {
            Map.Entry<String, Anm> entry = iterator.next();
            Anm anm = entry.getValue();
            if (this.cTd && anm.bGU()) {
                try {
                    anm.cN(true);
                }
                catch (IOException iOException) {
                    cSZ.error((Object)"IOException during AnmManager update", (Throwable)iOException);
                }
            }
            if (anm.aLB()) {
                anm.bHa();
            } else {
                anm.aPc();
            }
            if (anm.bGZ() > 0) continue;
            assert (anm.bSW() == 0);
            anm.bsI();
            iterator.remove();
        }
        this.cTd = false;
        this.cTg.release();
    }
}

