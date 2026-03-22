/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aoK
 */
public class aok_2
extends aoh_1 {
    public static final String cMK = "rectangular or square ring";
    private int cML;
    private int cMM;
    private int cMN;
    private int cMO;
    private final List<int[]> cMP = new ArrayList<int[]>(1);
    public static final aox_1 cMQ = new aob_2(new aoa_1("Pourtour d'un carr\u00e9", new aou_1("demi c\u00f4t\u00e9 inf\u00e9rieur (cellule comprise dedans)"), new aou_1("demi c\u00f4t\u00e9 sup\u00e9rieur (cellule comprise dedans)")), new aoa_1("Pourtour d'un rectangle", new aou_1("demi longueur inf\u00e9rieure X (cellule comprise dedans)"), new aou_1("demi longueur inf\u00e9rieure Y (cellule comprise dedans)"), new aou_1("demi longueur sup\u00e9rieure X (cellule comprise dedans)"), new aou_1("demi longueur sup\u00e9rieure Y (cellule comprise dedans)")));

    @Override
    public aox_1 bEt() {
        return cMQ;
    }

    @Override
    public List<int[]> bEm() {
        return this.cMP;
    }

    @Override
    public String bEn() {
        return "rectangular or square ring-w:" + this.cML + "-" + this.cMM + " / h:" + this.cMN + "-" + this.cMO;
    }

    @Override
    public String bEo() {
        return this.cML + "-" + this.cMM + " x " + this.cMN + "-" + this.cMO;
    }

    @Override
    public void p(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : 4 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 4 && nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring :4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        if (nArray.length == 2) {
            this.cMN = this.cML = Math.min(nArray[0], nArray[1]);
            this.cMO = this.cMM = Math.max(nArray[0], nArray[1]);
        } else {
            this.cML = nArray[0];
            this.cMN = nArray[1];
            this.cMM = nArray[2];
            this.cMO = nArray[3];
            if (this.cMN > this.cMO) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : innerY > outerY");
            }
            if (this.cML > this.cMM) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : innerX > outerX");
            }
        }
        this.cMP.clear();
        for (int i = 0; i <= this.cMM; ++i) {
            for (int j = 0; j <= this.cMO; ++j) {
                if (i < this.cML && j < this.cMN) continue;
                if (i == 0 && j == 0) {
                    this.cMP.add(aod_2.bQ(i, j));
                    continue;
                }
                if (i == 0) {
                    this.cMP.add(aod_2.bQ(i, j));
                    this.cMP.add(aod_2.bQ(i, -j));
                    continue;
                }
                if (j == 0) {
                    this.cMP.add(aod_2.bQ(i, j));
                    this.cMP.add(aod_2.bQ(-i, j));
                    continue;
                }
                this.cMP.add(aod_2.bQ(i, j));
                this.cMP.add(aod_2.bQ(-i, j));
                this.cMP.add(aod_2.bQ(i, -j));
                this.cMP.add(aod_2.bQ(-i, -j));
            }
        }
    }

    @Override
    protected boolean bEk() {
        return false;
    }

    @Override
    public aoi_1 bEl() {
        return aoi_1.cLn;
    }

    public int bEB() {
        return this.cMM;
    }

    public int bEC() {
        return this.cML;
    }

    @Override
    public ArrayList<aoh_1> bEp() {
        ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aoy_2 bEq() {
        if (this.cMO == 0 && this.cMM == 0) {
            return aoy_2.cLB;
        }
        if (this.cMO == this.cMM && this.cMN == this.cML) {
            return aoy_2.cLI;
        }
        return aoy_2.cLK;
    }
}

