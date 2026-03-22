/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public final class faj
extends Enum<faj> {
    public static final /* enum */ faj rNG = new faj(1);
    public static final /* enum */ faj rNH = new faj(2);
    public static final /* enum */ faj rNI = new faj(3);
    public static final /* enum */ faj rNJ = new faj(4);
    public static final /* enum */ faj rNK = new faj(1);
    public static final /* enum */ faj rNL = new faj(2);
    public static final /* enum */ faj rNM = new faj(3);
    public static final /* enum */ faj rNN = new faj(4);
    public static final /* enum */ faj rNO = new faj(5);
    public static final /* enum */ faj rNP = new faj(6);
    public static final /* enum */ faj rNQ = new faj(7);
    public static final /* enum */ faj rNR = new faj(8);
    public static final /* enum */ faj rNS = new faj(1);
    public static final /* enum */ faj rNT = new faj(2);
    public static final /* enum */ faj rNU = new faj(3);
    public static final /* enum */ faj rNV = new faj(4);
    public static final /* enum */ faj rNW = new faj(1);
    private final ArrayList<fak> rNX = new ArrayList();
    private final byte rNY;
    private eyh_2 rNZ;
    private static final /* synthetic */ faj[] rOa;

    public static faj[] values() {
        return (faj[])rOa.clone();
    }

    public static faj valueOf(String string) {
        return Enum.valueOf(faj.class, string);
    }

    private faj(int n2) {
        this.rNY = GC.ct(n2);
    }

    static void bkZ() {
        faj faj2 = rNG;
    }

    private void a(fak fak2) {
        this.rNX.add(fak2);
        fak2.a(this);
    }

    public int fQO() {
        if (this.rNX.isEmpty()) {
            return -1;
        }
        return this.rNX.get((int)0).rON;
    }

    public eyh_2 fQP() {
        return this.rNZ;
    }

    public byte fQQ() {
        return this.rNY;
    }

    public boolean L(TObjectProcedure<fak> tObjectProcedure) {
        int n = this.rNX.size();
        for (int i = 0; i < n; ++i) {
            if (tObjectProcedure.execute((Object)this.rNX.get(i))) continue;
            return false;
        }
        return true;
    }

    public ArrayList<fak> ekI() {
        return this.rNX;
    }

    public fak fW(byte by) {
        if (by < 0 || by >= this.rNX.size()) {
            return null;
        }
        return this.rNX.get(by);
    }

    private static /* synthetic */ faj[] fQR() {
        return new faj[]{rNG, rNH, rNI, rNJ, rNK, rNL, rNM, rNN, rNO, rNP, rNQ, rNR, rNS, rNT, rNU, rNV, rNW};
    }

    static {
        rOa = faj.fQR();
        rNG.a(fak.rOb);
        rNH.a(fak.rOc);
        rNI.a(fak.rOd);
        rNJ.a(fak.rOe);
        rNK.a(fak.rOf);
        rNK.a(fak.rOg);
        rNK.a(fak.rOh);
        rNL.a(fak.rOi);
        rNL.a(fak.rOj);
        rNL.a(fak.rOk);
        rNM.a(fak.rOl);
        rNM.a(fak.rOm);
        rNM.a(fak.rOn);
        rNN.a(fak.rOo);
        rNN.a(fak.rOp);
        rNN.a(fak.rOq);
        rNO.a(fak.rOr);
        rNO.a(fak.rOs);
        rNO.a(fak.rOt);
        rNP.a(fak.rOu);
        rNP.a(fak.rOv);
        rNP.a(fak.rOw);
        rNQ.a(fak.rOx);
        rNQ.a(fak.rOy);
        rNQ.a(fak.rOz);
        rNR.a(fak.rOA);
        rNR.a(fak.rOB);
        rNR.a(fak.rOC);
        rNS.a(fak.rOD);
        rNS.a(fak.rOE);
        rNT.a(fak.rOF);
        rNT.a(fak.rOG);
        rNU.a(fak.rOH);
        rNU.a(fak.rOI);
        rNV.a(fak.rOJ);
        rNV.a(fak.rOK);
        rNW.a(fak.rOL);
        faj.rNG.rNZ = eyh_2.rKO;
        faj.rNH.rNZ = eyh_2.rKP;
        faj.rNI.rNZ = eyh_2.rKQ;
        faj.rNJ.rNZ = eyh_2.rKR;
        faj.rNK.rNZ = eyh_2.rKS;
        faj.rNL.rNZ = eyh_2.rKT;
        faj.rNM.rNZ = eyh_2.rKU;
        faj.rNN.rNZ = eyh_2.rKV;
        faj.rNO.rNZ = eyh_2.rKW;
        faj.rNP.rNZ = eyh_2.rKX;
        faj.rNQ.rNZ = eyh_2.rKY;
        faj.rNR.rNZ = eyh_2.rKZ;
        faj.rNS.rNZ = eyh_2.rLa;
        faj.rNT.rNZ = eyh_2.rLb;
        faj.rNU.rNZ = eyh_2.rLc;
        faj.rNV.rNZ = eyh_2.rLd;
        faj.rNW.rNZ = eyh_2.rLe;
    }
}

