/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;

/*
 * Renamed from bNn
 */
public class bnn_0
implements aeh_2,
ezy_1 {
    public static final String kBF = "compartments";
    public static final String kBG = "selectedCompartment";
    public static final String kBH = "name";
    public static final String kBI = "prefSize";
    public static final String kBJ = "idealSizeMaxColumns";
    public static final String kBK = "idealSizeMaxRows";
    public static final String kBL = "moneyAmount";
    public static final String kBM = "canManageMoney";
    public static final String kBN = "canTakeMoney";
    public static final String kBO = "canPutMoney";
    public static final String kBP = "history";
    public static final String[] kBQ = new String[]{"compartments", "selectedCompartment", "name", "prefSize", "idealSizeMaxColumns", "idealSizeMaxRows", "canManageMoney", "canTakeMoney", "canPutMoney", "moneyAmount"};
    protected final ArrayList<bnl_0> kBR = new ArrayList();
    protected bnl_0 kBS;
    protected long kBT;
    private bnr_0 kBU;
    private final Map<Integer, Boolean> kBV;

    public bnn_0(Map<Integer, Boolean> map, fam fam2, long l) {
        this.a(fam2);
        this.kBV = map;
        this.kBT = l;
        for (faj faj2 : faj.values()) {
            this.kBR.add(new bnl_0(faj2));
        }
        this.kBS = this.kBR.isEmpty() ? null : this.kBR.getFirst();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ezu_1 ezu_12 = ((bjo_1)bgt_02.dpI()).drl();
        if (ezu_12 != null) {
            ezu_12.a(this);
        }
    }

    public boolean Ik(int n) {
        return this.kBV.containsKey(n);
    }

    public boolean Il(int n) {
        Boolean bl = this.kBV.get(n);
        return bl != null && bl != false;
    }

    protected String getName() {
        return aum_0.cWf().c("guild.storageBox", new Object[0]);
    }

    protected fsm_1 getPrefSize() {
        return new fsm_1(400, 160);
    }

    protected int getIdealSizeMaxColumns() {
        return 10;
    }

    protected int getIdealSizeMaxRows() {
        return 4;
    }

    protected boolean efU() {
        return true;
    }

    protected boolean efV() {
        return ewo_0.oBF.k(ewr_0.oEK);
    }

    protected boolean efW() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return false;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oEJ);
        if (!bl) {
            return false;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        return fab2 != null && fab2.b(eyh_2.rKL);
    }

    protected aef_2 efX() {
        return this.kBU;
    }

    public final void a(fam fam2) {
        this.kBU = new bnr_0(fam2);
        fse_1.gFu().a((aef_2)this, kBP);
    }

    public int bDw() {
        return this.kBV.size();
    }

    public void lT(long l) {
        if (!this.efV()) {
            fiq_2.gCw().d(fik_2.gBZ().l("error.guild.cannotDepositMoney", new Object[0]).abQ(1));
            return;
        }
        ckw_0 ckw_02 = new ckw_0(Math.abs(l));
        aue_0.cVJ().etu().d(ckw_02);
    }

    public void lU(long l) {
        if (!this.efW()) {
            fiq_2.gCw().d(fik_2.gBZ().l("error.guild.cannotWithdrawMoney", new Object[0]).abQ(1));
            return;
        }
        ckw_0 ckw_02 = new ckw_0(-Math.abs(l));
        aue_0.cVJ().etu().d(ckw_02);
    }

    @Override
    public void e(fab fab2) {
        fse_1.gFu().a((aef_2)this, kBN);
    }

    @Override
    public void d(ezz_1 ezz_12) {
        fse_1.gFu().a((aef_2)this, kBN);
    }

    public void clear() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ezu_1 ezu_12 = ((bjo_1)bgt_02.dpI()).drl();
        if (ezu_12 != null) {
            ezu_12.b(this);
        }
    }

    @Override
    public String[] bxk() {
        return kBQ;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kBF)) {
            return this.kBR;
        }
        if (string.equals(kBG)) {
            return this.kBS;
        }
        if (string.equals(kBH)) {
            return this.getName();
        }
        if (string.equals(kBI)) {
            return this.getPrefSize();
        }
        if (string.equals(kBJ)) {
            return this.getIdealSizeMaxColumns();
        }
        if (string.equals(kBK)) {
            return this.getIdealSizeMaxRows();
        }
        if (string.equals(kBM)) {
            return this.efU();
        }
        if (string.equals(kBN)) {
            return this.efW();
        }
        if (string.equals(kBO)) {
            return this.efV();
        }
        if (string.equals(kBP)) {
            return this.efX();
        }
        if (string.equals(kBL)) {
            return aum_0.cWf().cQ(this.kBT);
        }
        return null;
    }

    public void lV(long l) {
        this.kBT = l;
        fse_1.gFu().a((aef_2)this, kBL);
    }

    public long efY() {
        return this.kBT;
    }

    public bnl_0 efZ() {
        return this.kBS;
    }

    public bnl_0 cx(byte by) {
        return this.kBR.get(by);
    }

    public void a(bnl_0 bnl_02) {
        this.kBS = bnl_02;
    }

    public void eaj() {
        fse_1.gFu().a((aef_2)this, kBQ);
    }
}

