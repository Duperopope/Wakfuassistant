/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bCJ {
    protected static final Logger jJM = Logger.getLogger(bCJ.class);
    private final int jJN;
    private ang_2 bfe;
    private ArrayList<amx_1> hXV;
    private String bIk;

    bCJ(int n) {
        this.jJN = n;
    }

    public void bGy() {
        this.bVi();
    }

    public void a(fdd fdd2) {
        this.c(fdd2);
        ArrayList<amx_1> arrayList = this.b(fdd2);
        if (sn_0.a(fdd2.fTd(), arrayList)) {
            this.hXV = arrayList;
        } else {
            jJM.error((Object)("L'action " + fdd2.cnI() + " de l'ie generic id=" + this.d() + " n'a pas des param\u00e8tres du bon type"));
        }
    }

    private ArrayList<amx_1> b(fdd fdd2) {
        String[] stringArray = fdd2.cnJ();
        ArrayList<amx_1> arrayList = new ArrayList<amx_1>(stringArray.length);
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            try {
                ArrayList<amx_1> arrayList2 = ehu_0.rW(stringArray[i]);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                    continue;
                }
                arrayList.add(null);
                continue;
            }
            catch (Exception exception) {
                jJM.error((Object)("Erreur lors de la compilation du crit\u00e8re sur une action de l'ie generic id=" + this.d() + " actionid = " + fdd2.cnI() + " params : " + stringArray[i]), (Throwable)exception);
            }
        }
        return arrayList;
    }

    private void c(fdd fdd2) {
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(fdd2.clB());
        }
        catch (Exception exception) {
            jJM.error((Object)("Erreur de compilation du crit\u00e8re sur l'action id=" + fdd2.cnI() + " de l'ie generic id=" + this.d()), (Throwable)exception);
        }
        this.bfe = ang_22;
    }

    public int d() {
        return this.jJN;
    }

    public ang_2 bdo() {
        return this.bfe;
    }

    final amx_1 Gi(int n) {
        return this.hXV.get(n);
    }

    public final int dQE() {
        return this.hXV.size();
    }

    public ArrayList<amx_1> diK() {
        return this.hXV;
    }

    public String bkt() {
        return this.bIk;
    }

    protected void dx(String string) {
        this.bIk = string;
    }

    protected abstract void bVi();

    public abstract boolean bH(bgy var1);

    public abstract boolean bI(bgy var1);
}

