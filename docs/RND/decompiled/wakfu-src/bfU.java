/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bfU {
    private static final Logger hXG = Logger.getLogger(bfU.class);
    private static final ArrayList<azx_1<String, String>> hXH = new ArrayList();
    private final int hXI;
    private final ArrayList<bgb> hXJ = new ArrayList();
    private final HashMap<String, Byte> hXK = new HashMap();
    private final ArrayList<bgh> hXL = new ArrayList();
    private ArrayList<bgh> hXM = null;
    private final short hXN;
    private short asm = 0;
    private short asn = (short)-1;
    private int cis;
    private final ux_0 hXO;
    private final bfS hXP;
    private final bgi hXQ;
    private final boolean hXR;
    private byte bZe = 0;
    private final ang_2 hXS;
    private final ang_2 hXT;
    private final boolean hXU;
    private final ArrayList<azx_1<String, String>> hXV;

    public bfU(int n, byte by, byte by2, short s, boolean bl, ux_0 ux_02, short s2, short s3, String string, String string2, boolean bl2, String string3) {
        this.hXI = n;
        this.hXP = bfS.bh(by);
        this.hXQ = bgi.bk(by2);
        this.hXN = s;
        this.hXR = bl;
        this.hXO = ux_02;
        this.asm = s2;
        this.asn = s2;
        this.hXU = bl2;
        this.hXS = this.lD(string);
        this.hXT = this.lD(string2);
        this.hXV = string3 == null ? hXH : eIq.sa(string3);
    }

    private ang_2 lD(String string) {
        ang_2 ang_22 = null;
        if (string != null && string.length() != 0) {
            try {
                ang_22 = ehu_0.rY(string);
            }
            catch (Exception exception) {
                hXG.warn((Object)("Impossible de charger le criterion " + string + " pour le challenge " + this.hXI));
            }
        }
        return ang_22;
    }

    public byte lE(String string) {
        Byte by = this.hXK.get(string);
        if (by != null) {
            return by;
        }
        return 0;
    }

    public boolean aGd() {
        return this.hXU;
    }

    public String diz() {
        return "";
    }

    public void k(byte by, String string) {
        this.hXK.put(string, by);
    }

    public void b(bgb bgb2) {
        this.hXJ.add(bgb2);
    }

    public String diA() {
        return aum_0.cWf().a(26, (long)this.hXI, new Object[0]);
    }

    public String diB() {
        return aum_0.cWf().a(28, (long)this.hXI, new Object[0]);
    }

    public String diC() {
        return aum_0.cWf().b(28, (long)this.hXI, new Object[0]);
    }

    public String diD() {
        return aum_0.cWf().a(24, (long)this.hXI, new Object[0]);
    }

    public String diE() {
        return aum_0.cWf().a(29, (long)this.hXI, new Object[0]);
    }

    public int d() {
        return this.hXI;
    }

    public bfS dih() {
        return this.hXP;
    }

    public bgi dii() {
        return this.hXQ;
    }

    public short aFT() {
        return this.hXN;
    }

    public void a(int n, int n2, short s, int n3, int n4, byte by) {
        this.hXL.add(new bgh(n, n2, s, n3, n4, true, by));
        Collections.sort(this.hXL);
    }

    public void b(int n, int n2, short s, int n3, int n4, byte by) {
        if (this.hXM == null) {
            this.hXM = new ArrayList();
        }
        this.hXM.add(new bgh(n, n2, s, n3, n4, false, by));
    }

    public ArrayList<bgh> aFV() {
        return this.hXL;
    }

    public ArrayList<bgh> diF() {
        return this.hXM;
    }

    public void bi(byte by) {
        this.bZe = by;
    }

    public byte dij() {
        return this.bZe;
    }

    @Nullable
    public ux_0 diG() {
        return this.hXO;
    }

    public short aGe() {
        return this.asm;
    }

    public short aGf() {
        return this.asn;
    }

    public boolean diH() {
        return this.hXR;
    }

    public ArrayList<bgb> dbs() {
        return this.hXJ;
    }

    public bgb Cp(int n) {
        int n2 = this.hXJ.size();
        for (int i = 0; i < n2; ++i) {
            bgb bgb2 = this.hXJ.get(i);
            if (bgb2.d() != n) continue;
            return bgb2;
        }
        return null;
    }

    public ang_2 diI() {
        return this.hXS;
    }

    public ang_2 diJ() {
        return this.hXT;
    }

    public ArrayList<azx_1<String, String>> diK() {
        return this.hXV;
    }

    public String byf() {
        try {
            return String.format(auc_0.cVq().bS("challengeCategoryIconsPath"), this.hXP.aJr());
        }
        catch (fu_0 fu_02) {
            hXG.error((Object)"PropertyException during getIconUrl", (Throwable)fu_02);
            return null;
        }
    }
}

