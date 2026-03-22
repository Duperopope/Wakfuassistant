/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class fqV<S extends fqU> {
    private static final Logger sWY = Logger.getLogger(fqV.class);
    protected final S sWZ;

    public fqV(S s) {
        this.sWZ = s;
    }

    public void fG(short s) {
        ((fqU)this.sWZ).sWH = s;
    }

    public void fH(short s) {
        ((fqU)this.sWZ).sWI = s;
    }

    public void fI(short s) {
        ((fqU)this.sWZ).sWJ = s;
    }

    public void Zo(int n) {
        ((fqU)this.sWZ).sWK = n;
    }

    public void on(boolean bl) {
        ((fqU)this.sWZ).esK = bl;
    }

    public void Zp(int n) {
        ((fqU)this.sWZ).sWL = n;
    }

    public void Zq(int n) {
        ((fqU)this.sWZ).sWM = n;
    }

    public void oo(boolean bl) {
        ((fqU)this.sWZ).esN = bl;
    }

    public void op(boolean bl) {
        ((fqU)this.sWZ).esL = bl;
    }

    public void oq(boolean bl) {
        ((fqU)this.sWZ).sWN = bl;
    }

    public void or(boolean bl) {
        ((fqU)this.sWZ).esQ = bl;
    }

    public void os(boolean bl) {
        ((fqU)this.sWZ).sWO = bl;
    }

    public void W(int[] nArray) {
        ((fqU)this.sWZ).sWP = nArray == null ? new TIntHashSet() : new TIntHashSet(nArray);
    }

    public void sT(String string) {
        try {
            ((fqU)this.sWZ).sWQ = ehu_0.rY(string);
        }
        catch (Exception exception) {
            sWY.error((Object)("Erreur lors de la compilation des crit\u00e8res de l'\u00e9tat " + ((fqU)this.sWZ).gjy()), (Throwable)exception);
        }
    }

    public void ot(boolean bl) {
        ((fqU)this.sWZ).esU = bl;
    }

    public void hx(byte by) {
        ((fqU)this.sWZ).esV = by;
    }

    public void ou(boolean bl) {
        ((fqU)this.sWZ).esT = bl;
    }

    public void bw(short s) {
        ((fqU)this.sWZ).ejt = s;
    }

    public void xO(int n) {
        ((fqU)this.sWZ).dJT = n;
    }

    public void hy(byte by) {
        ((fqU)this.sWZ).sWT = exe_0.OA(by);
    }

    public void ov(boolean bl) {
        ((fqU)this.sWZ).sWW = bl;
    }

    public void ok(boolean bl) {
        ((fqU)this.sWZ).esR = bl;
    }

    public void X(int[] nArray) {
        for (int n : nArray) {
            ((fqU)this.sWZ).Zn(n);
        }
    }

    public void a(azl_2<enk_0> azl_22) {
        ((fqU)this.sWZ).bil = azl_22;
    }

    public void sU(String string) {
        String[] stringArray;
        ((fqU)this.sWZ).sWU = new ArrayList<Pf>();
        if (string.trim().length() == 0) {
            return;
        }
        for (String string2 : stringArray = BH.a(string, '~')) {
            if (fqV.b(string2, ((fqU)this.sWZ).sWU)) continue;
            sWY.error((Object)("Impossible d'ajouter \u00e0 l'\u00e9tat " + ((fqU)this.sWZ).gjy() + " l'HMIAction :" + string2));
        }
    }

    private static boolean b(String string, Collection<Pf> collection) {
        String[] stringArray = string.split("\\|", -1);
        if (stringArray.length % 2 != 0) {
            sWY.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray.length + " Attendu: pair "));
            return false;
        }
        Byte by = 0;
        String string2 = "";
        boolean bl = false;
        for (int i = 0; i < stringArray.length; i += 2) {
            String string3 = stringArray[i];
            String string4 = stringArray[i + 1];
            if (string3.equals("type")) {
                by = Byte.parseByte(string4);
                continue;
            }
            if (string3.equals("data")) {
                string2 = string4;
                continue;
            }
            if (!string3.equals("broadcast")) continue;
            bl = Boolean.parseBoolean(string4);
        }
        Pf pf = Pg.aXx().a(by, string2, bl);
        if (pf != null) {
            collection.add(pf);
            return true;
        }
        return false;
    }
}

