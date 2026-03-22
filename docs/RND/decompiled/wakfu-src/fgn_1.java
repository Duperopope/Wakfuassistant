/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.Line2D;
import java.util.ArrayList;

/*
 * Renamed from fGN
 */
public class fgn_1 {
    private ArrayList<fgo_1> jLZ;
    private ArrayList<Line2D> dka;
    private int tPB;
    private int tPA;

    public fgn_1(ArrayList<fgo_1> arrayList, ArrayList<Line2D> arrayList2, int n, int n2) {
        this.tPB = n;
        this.tPA = n2;
        this.jLZ = arrayList;
        this.dka = arrayList2;
    }

    public ArrayList<fgo_1> getItems() {
        return this.jLZ;
    }

    public void ag(ArrayList<fgo_1> arrayList) {
        this.jLZ = arrayList;
    }

    public int getRowCount() {
        return this.tPB;
    }

    public void abz(int n) {
        this.tPB = n;
    }

    public int getColumnCount() {
        return this.tPA;
    }

    public void abA(int n) {
        this.tPA = n;
    }

    public ArrayList<Line2D> gwM() {
        return this.dka;
    }

    public void p(ArrayList<Line2D> arrayList) {
        this.dka = arrayList;
    }
}

