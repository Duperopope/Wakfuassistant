/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fSe
 */
public class fse_1
implements aej_2 {
    private static final Logger vcR = Logger.getLogger(fse_1.class);
    private static final fse_1 vcS = new fse_1();
    private final Map<String, fsf_1> vcT = new HashMap<String, fsf_1>();
    private final List<fsf_1> vcU = new ArrayList<fsf_1>();
    private final List<fsf_1> vcV = new ArrayList<fsf_1>();
    private final Collection<fsf_1> vcW = new ArrayList<fsf_1>();
    private final List<fsn_2> vcX = new ArrayList<fsn_2>();

    private fse_1() {
    }

    public static fse_1 gFu() {
        return vcS;
    }

    public void a(fsn_2 fsn_22) {
        if (fsn_22 != null) {
            this.vcX.add(fsn_22);
        }
    }

    public void b(fsn_2 fsn_22) {
        if (fsn_22 != null) {
            this.vcX.remove(fsn_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(fsf_1 fsf_12) {
        if (!fsf_12.gFx()) {
            this.vcT.put(fsf_12.getName(), fsf_12);
        }
        List<fsf_1> list = this.vcU;
        synchronized (list) {
            this.vcU.add(fsf_12);
        }
        this.a(fsm_2.vdJ, fsf_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean gFv() {
        int n = this.vcW.size();
        if (n == 0) {
            return false;
        }
        Collection<fsf_1> collection = this.vcW;
        synchronized (collection) {
            this.vcV.addAll(this.vcW);
            this.vcW.clear();
        }
        for (int i = 0; i < n; ++i) {
            this.vcV.get(i).gFB();
        }
        this.vcV.clear();
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e(fsf_1 fsf_12) {
        Collection<fsf_1> collection = this.vcW;
        synchronized (collection) {
            if (fsf_12 != null && !this.vcW.contains(fsf_12)) {
                this.vcW.add(fsf_12);
            }
        }
    }

    public void vX(String string) {
        this.c(this.vcT.get(string));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(fsf_1 fsf_12) {
        if (fsf_12 == null) {
            return;
        }
        if (!fsf_12.gFx()) {
            this.vcT.remove(fsf_12.getName());
        }
        List<fsf_1> list = this.vcU;
        synchronized (list) {
            this.vcU.remove(fsf_12);
        }
        this.a(fsm_2.vdK, fsf_12);
    }

    @Override
    public void f(String string, Object object) {
        this.a(string, object, false);
    }

    public void a(String string, Object object, boolean bl) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 == null) {
            fsf_12 = new fsf_1(string, null);
            this.b(fsf_12);
        }
        fsf_12.a(object, bl);
    }

    public void b(String string, Object object, String string2) {
        this.a(string, object, string2, false);
    }

    public void a(String string, Object object, String string2, boolean bl) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string2);
        if (fhs_22 != null) {
            this.a(string, object, fhs_22, bl);
        }
    }

    public void a(String string, Object object, fhs_2 fhs_22) {
        this.a(string, object, fhs_22, false);
    }

    public void a(String string, Object object, fhs_2 fhs_22, boolean bl) {
        if (fhs_22 == null) {
            this.f(string, object);
        } else {
            fsf_1 fsf_12 = fhs_22.getProperty(string);
            if (fsf_12 == null) {
                fsf_12 = new fsf_1(string, fhs_22);
                this.b(fsf_12);
                fhs_22.b(fsf_12);
            }
            fsf_12.a(object, bl);
        }
    }

    public void b(String string, String string2, Object object) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 != null) {
            fsf_12.c(string2, object);
        } else {
            vcR.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    public void a(String string, String string2, Object object, String string3) {
        this.a(string, string2, object, fyw_0.gqw().gqC().uR(string3));
    }

    public void a(String string, String string2, Object object, fhs_2 fhs_22) {
        if (fhs_22 == null) {
            this.b(string, string2, object);
        } else {
            fsf_1 fsf_12 = fhs_22.getProperty(string);
            if (fsf_12 != null) {
                fsf_12.c(string2, object);
            } else {
                vcR.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
            }
        }
    }

    public void c(String string, String string2, Object object) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 != null) {
            fsf_12.e(string2, object);
        } else {
            vcR.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(aef_2 aef_22, String ... stringArray) {
        aah_1<Object> aah_12 = new aah_1<Object>();
        List<fsf_1> list = this.vcU;
        synchronized (list) {
            int n = this.vcU.size();
            for (int i = 0; i < n; ++i) {
                fsf_1 fsf_12 = this.vcU.get(i);
                Object object = fsf_12.getValue();
                if (object == null || !object.equals(aef_22)) continue;
                fsf_12.a(stringArray, aah_12);
            }
        }
    }

    public void aT(String string, String string2) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 != null) {
            fsf_12.wg(string2);
        } else {
            vcR.warn((Object)("La d\u00e9finition d'une valeur de champ " + string2 + " est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    public void b(String string, String string2, fhs_2 fhs_22) {
        if (fhs_22 == null) {
            this.aT(string, string2);
        } else {
            fsf_1 fsf_12 = fhs_22.getProperty(string);
            if (fsf_12 != null) {
                fsf_12.wg(string2);
            } else {
                vcR.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
            }
        }
    }

    public String du(String string) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 != null) {
            return fsf_12.dCm();
        }
        return null;
    }

    public boolean dp(String string) {
        fsf_1 fsf_12 = this.vcT.get(string);
        return fsf_12 != null && fsf_12.gFz();
    }

    public boolean aU(String string, String string2) {
        return this.f(string, fyw_0.gqw().gqC().uR(string2));
    }

    public boolean f(String string, fhs_2 fhs_22) {
        fsf_1 fsf_12 = fhs_22 == null ? this.vcT.get(string) : fhs_22.getProperty(string);
        return fsf_12 != null && fsf_12.gFz();
    }

    public int dq(String string) {
        fsf_1 fsf_12 = this.vcT.get(string);
        return fsf_12 != null ? fsf_12.bGI() : 0;
    }

    public int aV(String string, String string2) {
        return this.g(string, fyw_0.gqw().gqC().uR(string2));
    }

    public int g(String string, fhs_2 fhs_22) {
        fsf_1 fsf_12 = fhs_22 == null ? this.vcT.get(string) : fhs_22.getProperty(string);
        return fsf_12 != null ? fsf_12.bGI() : 0;
    }

    public float h(String string, fhs_2 fhs_22) {
        fsf_1 fsf_12 = fhs_22 == null ? this.vcT.get(string) : fhs_22.getProperty(string);
        return fsf_12 != null ? fsf_12.bGH() : 0.0f;
    }

    public Object vY(String string) {
        fsf_1 fsf_12 = this.vcT.get(string);
        if (fsf_12 != null) {
            return fsf_12.getValue();
        }
        return null;
    }

    public Object aW(String string, String string2) {
        return this.i(string, fyw_0.gqw().gqC().uR(string2));
    }

    public Object i(String string, fhs_2 fhs_22) {
        fsf_1 fsf_12;
        fsf_1 fsf_13 = fsf_12 = fhs_22 == null ? this.vcT.get(string) : fhs_22.getProperty(string);
        if (fsf_12 != null) {
            return fsf_12.getValue();
        }
        return null;
    }

    public fsf_1 getProperty(String string) {
        return this.vcT.get(string);
    }

    public fsf_1 aX(String string, String string2) {
        return this.j(string, fyw_0.gqw().gqC().uR(string2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fsf_1 a(aef_2 aef_22, fhs_2 fhs_22) {
        List<fsf_1> list = this.vcU;
        synchronized (list) {
            int n = this.vcU.size();
            for (int i = 0; i < n; ++i) {
                fsf_1 fsf_12 = this.vcU.get(i);
                if (fsf_12.getValue() != aef_22 || fsf_12.getElementMap() != fhs_22) continue;
                return fsf_12;
            }
        }
        return null;
    }

    public fsf_1 j(String string, fhs_2 fhs_22) {
        if (fhs_22 == null) {
            return this.getProperty(string);
        }
        return fhs_22.getProperty(string);
    }

    public void a(fsm_2 fsm_22, fsf_1 fsf_12) {
        if (this.vcX.isEmpty()) {
            return;
        }
        fsl_2 fsl_22 = new fsl_2(fsm_22, fsf_12);
        for (int i = this.vcX.size() - 1; i >= 0; --i) {
            this.vcX.get(i).a(fsl_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ae(TObjectProcedure<fsf_1> tObjectProcedure) {
        List<fsf_1> list = this.vcU;
        synchronized (list) {
            int n = this.vcU.size();
            for (int i = 0; i < n; ++i) {
                tObjectProcedure.execute((Object)this.vcU.get(i));
            }
        }
    }
}

