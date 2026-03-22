/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class frd {
    private static final Logger sXu = Logger.getLogger(frd.class);
    private int eoY = -1;
    private final List<Integer> sXv = new ArrayList<Integer>(Collections.nCopies(fra.sXp, 0));
    private final List<Integer> sXw = new ArrayList<Integer>(Collections.nCopies(fra.sXq, 0));
    private final List<Integer> sXx = new ArrayList<Integer>();

    public frd() {
    }

    public frd(int[] nArray, int[] nArray2) {
        int n;
        for (n = 0; n < Math.min(fra.sXp, nArray.length); ++n) {
            this.sXv.set(n, nArray[n]);
        }
        for (n = 0; n < Math.min(fra.sXq, nArray2.length); ++n) {
            this.sXw.set(n, nArray2[n]);
        }
    }

    public frd(List<Integer> list, List<Integer> list2) {
        int n;
        for (n = 0; n < Math.min(fra.sXp, list.size()); ++n) {
            this.sXv.set(n, list.get(n));
        }
        for (n = 0; n < Math.min(fra.sXq, list2.size()); ++n) {
            this.sXw.set(n, list2.get(n));
        }
    }

    public frd gjQ() {
        frd frd2 = new frd();
        frd2.eoY = this.eoY;
        Collections.copy(frd2.sXv, this.sXv);
        Collections.copy(frd2.sXw, this.sXw);
        return frd2;
    }

    public void i(frd frd2) {
        this.eoY = frd2.eoY;
        Collections.copy(this.sXv, frd2.sXv);
        Collections.copy(this.sXw, frd2.sXw);
    }

    public void j(frd frd2) {
        Collections.copy(this.sXv, frd2.sXv);
        Collections.copy(this.sXw, frd2.sXw);
    }

    public int tL() {
        return this.eoY;
    }

    public boolean gjR() {
        return this.eoY < 0;
    }

    public void PP(int n) {
        this.eoY = n;
    }

    public void gp(int n, int n2) {
        this.b(n, n2, this.sXv);
    }

    public void gq(int n, int n2) {
        this.b(n, n2, this.sXw);
    }

    private boolean b(int n, int n2, List<Integer> list) {
        if (n2 >= fra.sXp) {
            return false;
        }
        int n3 = this.Zu(n);
        if (n3 == n2 && n != 0) {
            return true;
        }
        int n4 = list.get(n2);
        list.set(n2, n);
        if (n != 0 && n3 >= 0 && n4 >= 0) {
            list.set(n3, n4);
        }
        return false;
    }

    public void d(ArrayList<Integer> arrayList, List<Integer> list) {
        this.sXv.clear();
        this.sXv.addAll(arrayList);
        this.sXw.clear();
        this.sXw.addAll(list);
    }

    public int Zu(int n) {
        int n2 = this.sXv.lastIndexOf(n);
        if (n2 >= 0) {
            return n2;
        }
        return this.sXw.lastIndexOf(n);
    }

    public boolean al(exP exP2) {
        if (exP2 == null) {
            return false;
        }
        return this.eoY <= exP2.dnG() - 0;
    }

    public ArrayList<Integer> eEu() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.sXv));
    }

    public ArrayList<Integer> gjS() {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n = 0; n < fra.sXp; ++n) {
            arrayList.add(this.sXv.get(n));
        }
        for (n = 0; n < fra.sXq; ++n) {
            arrayList.add(this.sXw.get(n));
        }
        return arrayList;
    }

    public ArrayList<Integer> eEv() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.sXw));
    }

    public boolean tX(int n) {
        return this.sXv.contains(n) || this.sXw.contains(n);
    }

    public void aG(Integer n) {
        this.sXx.add(n);
    }

    public void aH(Integer n) {
        this.sXx.remove(n);
    }

    public boolean Zv(int n) {
        return this.sXx.contains(n);
    }

    public boolean k(frd frd2) {
        return this.eoY != frd2.eoY || !this.sXv.equals(frd2.sXv) || !this.sXw.equals(frd2.sXw);
    }

    public String toString() {
        return "SpellDeckModel{m_level=" + this.eoY + ", m_activeSpells=" + String.valueOf(this.sXv) + ", m_passiveSpells=" + String.valueOf(this.sXw) + "}";
    }
}

