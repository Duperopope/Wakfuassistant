/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.jetbrains.annotations.NotNull;

public class bsi
implements aeh_2,
Comparable<bsi> {
    public static final String jft = "title";
    public static final String jfu = "description";
    public static final String jfv = "type";
    public static final String jfw = "types";
    public static final String jfx = "selectedType";
    public static final String jfy = "iconUrl";
    public static final String jfz = "typeDescription";
    public static final String jfA = "areParticipantsLimited";
    public static final String jfB = "maxParticipants";
    public static final String jfC = "numParticipants";
    public static final String jfD = "numParticipantsDesc";
    public static final String jfE = "maxRegistrations";
    public static final String jfF = "numRegistrations";
    public static final String jfG = "numRegistrationsDesc";
    public static final String jfH = "startDateDesc";
    public static final String jfI = "endDateDesc";
    public static final String jfJ = "isRegistered";
    public static final String jfK = "registeredList";
    public static final String jfL = "isValidated";
    public static final String jfM = "validatedList";
    public static final String jfN = "canEditParticipantsLimit";
    private eTw jfO;
    private eTw jfP;
    private boolean jfQ = false;
    private boolean jfR = false;
    private boolean jfS = false;
    private boolean jfT = false;
    private bsj jfU;

    public int a(@NotNull bsi bsi2) {
        if (this.jfO != null) {
            return this.jfO.dis().k(bsi2.jfO.dis());
        }
        return 0;
    }

    public void Z(int n, int n2, int n3) {
        this.jfO = new eTw();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            this.jfO.pi(bgt_02.Sn());
        }
        this.jfO.mA(true);
        this.jfO.a((byte)1);
        this.jfO.bE((byte)0);
        this.jfU = bsj.bF((byte)1);
        this.jfO.bC((byte)-1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        ((Calendar)gregorianCalendar).add(10, 1);
        int n4 = gregorianCalendar.get(9) == 0 ? 0 : 12;
        uw_0 uw_02 = new uw_0(0, 0, gregorianCalendar.get(10) + n4, n, n2, n3);
        this.jfO.D(uw_02);
        ((Calendar)gregorianCalendar).add(10, 1);
        n4 = gregorianCalendar.get(9) == 0 ? 0 : 12;
        uw_02 = new uw_0(0, 0, gregorianCalendar.get(10) + n4, n, n2, n3);
        this.jfO.P(uw_02);
        this.jfR = false;
        this.jfQ = false;
        this.jfS = false;
        this.jfT = false;
    }

    public void d(int n, int n2, int n3, int n4, int n5) {
        uw_0 uw_02 = this.jfO.fJh();
        long l = uw_02.bjB();
        uw_0 uw_03 = this.jfO.fJi();
        long l2 = uw_03.bjB();
        int n6 = (int)((float)(l2 - l) / 1000.0f);
        uw_02.a(0, n, n2, n3, n4, n5);
        uw_03.a(n6, n, n2, n3, n4, n5);
        fse_1.gFu().a((aef_2)this, jfH, jfI);
    }

    public void e(int n, int n2, int n3, int n4, int n5) {
        uw_0 uw_02 = this.jfO.fJi();
        uw_02.a(0, n, n2, n3, n4, n5);
        fse_1.gFu().a((aef_2)this, jfI);
    }

    public void gR(boolean bl) {
        byte by = this.jfO.faA();
        if (bl && by >= 1 || !bl && by < 1) {
            return;
        }
        if (bl) {
            this.jfO.bC((byte)2);
            this.jfO.bD((byte)2);
        } else {
            this.jfO.bC((byte)-1);
            this.jfO.bD((byte)-1);
        }
        fse_1.gFu().a((aef_2)this, jfA, jfB, jfE);
    }

    public boolean dFc() {
        return this.jfO.faA() != -1;
    }

    public void bC(byte by) {
        if (by < 1 || by > 20) {
            return;
        }
        this.jfO.bC(by);
        fse_1.gFu().a((aef_2)this, jfB);
    }

    public void bD(byte by) {
        if (by < 1 || by > 20) {
            return;
        }
        this.jfO.bD(by);
        fse_1.gFu().a((aef_2)this, jfE);
    }

    public void a(byte by) {
        if (this.jfO.aFW() == by) {
            return;
        }
        this.jfO.a(by);
        this.jfU = bsj.bF(by);
        switch (by) {
            case 3: {
                this.gR(false);
                break;
            }
            case 2: {
                this.gR(true);
                break;
            }
            case 4: {
                this.gR(false);
            }
        }
        fse_1.gFu().a((aef_2)this, jfv, jfz, jfy, jfx, jfN);
    }

    public void bE(byte by) {
        if (this.jfO.eJz() == by) {
            return;
        }
        this.jfO.bE(by);
        fse_1.gFu().a((aef_2)this, jfy, jfx);
    }

    public void eQ(String string) {
        String string2 = this.jfO.bAD();
        if (string2 == string || string2 != null && string2.equals(string) || string != null && string.equals(string2)) {
            return;
        }
        this.jfO.eQ(string);
        fse_1.gFu().a((aef_2)this, jft);
    }

    public void cA(String string) {
        String string2 = this.jfO.getDescription();
        if (string2 == string || string2 != null && string2.equals(string) || string != null && string.equals(string2)) {
            return;
        }
        this.jfO.oA(string);
        fse_1.gFu().a((aef_2)this, jfu);
    }

    public void l(eTw eTw2) {
        this.jfO = eTw2;
        this.jfU = bsj.bF(this.jfO.aFW());
    }

    public void m(eTw eTw2) {
        this.jfP = eTw2;
        this.jfO = new eTw();
        this.jfO.o(this.jfP);
        this.jfU = bsj.bF(this.jfO.aFW());
        this.jfR = false;
        this.jfQ = false;
        this.jfS = false;
        this.jfT = false;
    }

    public boolean dFd() {
        if (this.jfP != null) {
            return !this.jfP.bAD().equals(this.jfO.bAD());
        }
        return false;
    }

    public boolean dFe() {
        if (this.jfP != null) {
            return !this.jfP.getDescription().equals(this.jfO.getDescription());
        }
        return false;
    }

    public boolean dFf() {
        if (this.jfP != null) {
            return this.jfP.dis().k(this.jfO.dis()) != 0;
        }
        return false;
    }

    public boolean dFg() {
        if (this.jfP != null) {
            return this.jfP.bka().k(this.jfO.bka()) != 0;
        }
        return false;
    }

    public boolean dFh() {
        if (this.jfP != null) {
            return this.jfP.faA() != this.jfO.faA();
        }
        return false;
    }

    public boolean dFi() {
        if (this.jfP != null) {
            return this.jfP.faB() != this.jfO.faB();
        }
        return false;
    }

    public void dFj() {
        if (this.jfP == null) {
            return;
        }
        TLongObjectHashMap<String> tLongObjectHashMap = this.jfO.fJk();
        tLongObjectHashMap.clear();
        TLongObjectHashMap<String> tLongObjectHashMap2 = this.jfP.fJk();
        if (tLongObjectHashMap2.size() > 0) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap2.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                tLongObjectHashMap.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        fse_1.gFu().a((aef_2)this, jfJ, jfK, jfG, jfF);
    }

    public void dFk() {
        if (this.jfP == null) {
            return;
        }
        TLongObjectHashMap<String> tLongObjectHashMap = this.jfO.fJj();
        tLongObjectHashMap.clear();
        TLongObjectHashMap<String> tLongObjectHashMap2 = this.jfP.fJj();
        if (tLongObjectHashMap2.size() > 0) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap2.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                tLongObjectHashMap.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        fse_1.gFu().a((aef_2)this, jfL, jfM, jfC, jfD);
    }

    public void dFl() {
        if (this.jfP == null) {
            return;
        }
        long l = aue_0.cVJ().cVK().Sn();
        if (this.jfO.fJk().containsKey(l)) {
            this.jfP.qD(l);
            this.dFj();
        } else if (this.jfO.fJj().containsKey(l)) {
            this.jfP.qC(l);
            this.dFk();
        }
    }

    public eTw dFm() {
        return this.jfO;
    }

    public eTw dFn() {
        return this.jfP;
    }

    public void dFo() {
        nv_0 nv_02;
        if (this.dFd()) {
            this.jfP.eQ(this.jfO.bAD());
            nv_02 = new cwH();
            ((cwH)nv_02).eQ(this.jfP.bAD());
            ((cwH)nv_02).nH(this.jfP.Lx());
            aue_0.cVJ().etu().d(nv_02);
        }
        if (this.dFe()) {
            this.jfP.oA(this.jfO.getDescription());
            nv_02 = new cwD();
            ((cwD)nv_02).oA(this.jfP.getDescription());
            ((cwD)nv_02).nH(this.jfP.Lx());
            aue_0.cVJ().etu().d(nv_02);
        }
        if (this.dFh()) {
            this.jfP.bC(this.jfO.faA());
            nv_02 = new cwF();
            ((cwF)nv_02).nH(this.jfP.Lx());
            ((cwF)nv_02).dO(this.jfP.faA());
            ((cwF)nv_02).a((byte)2);
            aue_0.cVJ().etu().d(nv_02);
        }
        if (this.dFi()) {
            this.jfP.bD(this.jfO.faB());
            nv_02 = new cwF();
            ((cwF)nv_02).nH(this.jfP.Lx());
            ((cwF)nv_02).dO(this.jfP.faB());
            ((cwF)nv_02).a((byte)1);
            aue_0.cVJ().etu().d(nv_02);
        }
        if (this.dFf()) {
            bse.dEP().b(this.jfP.Lx(), this.jfO.dis());
            nv_02 = new cwG();
            ((cwG)nv_02).F(this.jfP.dis());
            ((cwG)nv_02).nH(this.jfP.Lx());
            aue_0.cVJ().etu().d(nv_02);
        }
        if (this.dFg()) {
            this.jfP.P(this.jfO.bka());
            nv_02 = new cwE();
            ((cwE)nv_02).F(this.jfP.bka());
            ((cwE)nv_02).nH(this.jfP.Lx());
            aue_0.cVJ().etu().d(nv_02);
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jft)) {
            return bsb.a(this.jfO);
        }
        if (string.equals(jfu)) {
            return bsb.b(this.jfO);
        }
        if (string.equals(jfA)) {
            return this.dFc();
        }
        if (string.equals(jfB)) {
            return this.jfO.faA();
        }
        if (string.equals(jfE)) {
            return this.jfO.faB();
        }
        if (string.equals(jfC)) {
            return this.jfO.fJj().size();
        }
        if (string.equals(jfF)) {
            return this.jfO.fJk().size();
        }
        if (string.equals(jfD)) {
            StringBuilder stringBuilder = new StringBuilder().append(this.jfO.fJj().size());
            byte by = this.jfO.faA();
            if (by >= 0) {
                stringBuilder.append("/").append(by);
            }
            return stringBuilder.toString();
        }
        if (string.equals(jfG)) {
            StringBuilder stringBuilder = new StringBuilder().append(this.jfO.fJk().size());
            byte by = this.jfO.faB();
            if (by >= 0) {
                stringBuilder.append("/").append(by);
            }
            return stringBuilder.toString();
        }
        if (string.equals(jfH)) {
            ux_0 ux_02 = this.jfO.dis();
            if (ux_02 == null || ux_02.bjv()) {
                return null;
            }
            return ux_02.bjM();
        }
        if (string.equals(jfI)) {
            ux_0 ux_03 = this.jfO.bka();
            if (ux_03 == null || ux_03.bjv()) {
                return null;
            }
            return ux_03.bjM();
        }
        if (string.equals(jfv)) {
            return this.jfO.aFW();
        }
        if (string.equals(jfy)) {
            return auc_0.cVq().aY(this.jfO.aFW());
        }
        if (string.equals(jfz)) {
            return aum_0.cWf().c("calendar.event.type." + this.jfO.aFW(), new Object[0]);
        }
        if (string.equals(jfx)) {
            return this.jfU;
        }
        if (string.equals(jfw)) {
            return bsj.dFp();
        }
        if (string.equals(jfJ)) {
            return this.jfO.fJk().contains(aue_0.cVJ().cVK().Sn());
        }
        if (string.equals(jfL)) {
            return this.jfO.fJj().contains(aue_0.cVJ().cVK().Sn());
        }
        if (string.equals(jfK)) {
            return this.a(this.jfO.fJk());
        }
        if (string.equals(jfM)) {
            return this.a(this.jfO.fJj());
        }
        if (string.equals(jfN)) {
            return this.jfO.Xi() == aue_0.cVJ().cVK().dkF() || this.jfO.aFW() == 3 && evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ove);
        }
        return null;
    }

    private ArrayList<bsc> a(TLongObjectHashMap<String> tLongObjectHashMap) {
        ArrayList<bsc> arrayList = new ArrayList<bsc>(tLongObjectHashMap.size());
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.add(new bsc(tLongObjectIterator.key(), (String)tLongObjectIterator.value()));
        }
        return arrayList;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bsi)object);
    }
}

