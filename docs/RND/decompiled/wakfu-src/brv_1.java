/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bRV
 */
public class brv_1
extends bso_2 {
    public static final String ldp = "governorName";
    public static final String ldq = "allies";
    public static final String ldr = "ennemies";
    public static final String lds = "isLocalAlly";
    public static final String ldt = "isLocalEnemy";
    public static final String ldu = "isWaitingForAllianceResult";
    public static final String ldv = "isWaitingForAllianceAnswer";
    public static final String ldw = "hasAlreadyAnAlly";
    public static final String ldx = "canInviteAnotherNation";
    public static final String[] ldy = new String[]{"governorName", "allies", "ennemies", "isLocalAlly", "isLocalEnemy", "isWaitingForAllianceResult", "isWaitingForAllianceAnswer", "hasAlreadyAnAlly", "canInviteAnotherNation"};
    private final ArrayList<bso_2> ldz = new ArrayList();
    private final ArrayList<bso_2> ldA = new ArrayList();
    private boolean ldB;
    private boolean ldC;
    private boolean ldD;
    private boolean ldE;

    public brv_1(int n) {
        super(n);
        this.aPg();
    }

    private void aPg() {
        fjo_0 fjo_02 = fjt.syH.WG(this.lfQ);
        this.ldD = false;
        this.ldE = true;
        Object object = fjt.syH.b(this.lfQ);
        while (object.hasNext()) {
            object.advance();
            int n = object.key();
            switch (fjo_02.gbD().WO(n)) {
                case sAp: {
                    this.ldz.add(new bso_2(n));
                    this.ldD = true;
                    break;
                }
                case sAo: {
                    this.ldA.add(new bso_2(n));
                }
            }
        }
        object = aue_0.cVJ().cVK();
        if (object == null) {
            return;
        }
        fjo_0 fjo_03 = ((exP)object).ffF().ems();
        fkc_0 fkc_02 = fjo_03.gbD().WN(this.lfQ);
        this.ldB = fkc_02 == fkc_0.sAp;
        fkc_0 fkc_03 = fjo_02.gbD().WN(fjo_03.Xt());
        this.ldC = fkc_03 == fkc_0.sAp;
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.b(fjo_03.Xt());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (fjo_03.gbD().WO(tIntObjectIterator.key()) != fkc_0.sAp) continue;
            this.ldE = false;
            break;
        }
    }

    @Override
    public String[] bxk() {
        return ldy;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(ldp)) {
            fkH fkH2 = fjt.syH.WG(this.lfQ).gbB().gcw();
            return fkH2 == null ? aum_0.cWf().c("nation.noGovernorDesc", new Object[0]) : fkH2.getName();
        }
        if (string.equals(ldq)) {
            return this.ldz;
        }
        if (string.equals(ldr)) {
            return this.ldA;
        }
        if (string.equals(lds)) {
            return this.elH() == fkc_0.sAp;
        }
        if (string.equals(ldt)) {
            return this.elH() == fkc_0.sAo;
        }
        if (string.equals(ldu)) {
            return this.ldB;
        }
        if (string.equals(ldv)) {
            return this.ldC;
        }
        if (string.equals(ldw)) {
            return this.ldD;
        }
        if (string.equals(ldx)) {
            return this.ldE;
        }
        return super.eu(string);
    }

    public boolean elG() {
        return this.ldC;
    }

    public fkc_0 elH() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 == null ? fkc_0.sAo : bgt_02.ffF().ems().gbD().WO(this.lfQ);
    }
}

