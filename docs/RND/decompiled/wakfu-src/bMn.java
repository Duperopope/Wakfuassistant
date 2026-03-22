/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  com.google.common.primitives.Shorts
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bMn
implements aeh_2,
ayz_2,
Comparable<bMn> {
    private static final Logger kwA = Logger.getLogger(bMn.class);
    private final ArrayList<QD> kwB = new ArrayList();
    private long kwC;
    private tz_0 kwD;
    private final ArrayList<Qk> kwE = new ArrayList();
    private ObjectPool bip;
    public static final String kwF = "name";
    public static final String kwG = "id";
    public static final String kwH = "nameAndLevel";
    public static final String kwI = "description";
    public static final String kwJ = "tableTurnDuration";
    public static final String kwK = "plainRemainingDuration";
    public static final String kwL = "remainingDuration";
    public static final String kwM = "remainingDurationText";
    public static final String kwN = "isInfiniteDuration";
    public static final String kwO = "iconUrl";
    public static final String kwP = "effects";
    public static final String kwQ = "stackSize";
    public static final String kwR = "canBeAddedToFavorites";
    public static final String[] kwS = new String[]{"name", "id", "tableTurnDuration", "remainingDuration", "remainingDurationText", "iconUrl", "effects", "stackSize", "canBeAddedToFavorites"};
    private static final ObjectPool kwT = new ayv_2(new bMo());

    public static bMn c(Qk qk) {
        bMn bMn2;
        try {
            bMn2 = (bMn)kwT.borrowObject();
            bMn2.bip = kwT;
        }
        catch (Exception exception) {
            bMn2 = new bMn();
            bMn2.bip = null;
            kwA.error((Object)("Erreur lors d'un checkOut sur un RunningEffectFieldProvider : " + exception.getMessage()));
        }
        bMn2.kwE.add(qk);
        bMn2.kwC = -1L;
        return bMn2;
    }

    bMn() {
    }

    @Override
    public Object eu(String string) {
        if (string.equalsIgnoreCase(kwH)) {
            String string2 = this.getName();
            int n = this.eev();
            if (n < 2) {
                return string2;
            }
            return string2 + " (" + aum_0.cWf().c("levelShort.custom", n) + ")";
        }
        if (string.equalsIgnoreCase(kwF)) {
            return this.getName();
        }
        if (string.equals(kwG)) {
            Qk qk = this.eex();
            if (qk instanceof fqU) {
                fqU fqU2 = (fqU)qk;
                return fqU2.gjy();
            }
            if (qk != null) {
                return qk.QF();
            }
            return 0;
        }
        if (string.equalsIgnoreCase(kwI)) {
            return this.getDescription();
        }
        if (string.equalsIgnoreCase(kwK)) {
            return this.m(false, true);
        }
        if (string.equalsIgnoreCase(kwL)) {
            return this.m(true, true);
        }
        if (string.equalsIgnoreCase(kwM)) {
            return this.m(true, false);
        }
        if (string.equals(kwN)) {
            bsj_0 bsj_02 = aue_0.cVJ().cVK().dmV();
            if (bsj_02 != null && this.kwD != null) {
                return this.kwD.bbY();
            }
            return this.kwC == -1L;
        }
        if (string.equalsIgnoreCase(kwO)) {
            return this.byf();
        }
        if (string.equalsIgnoreCase(kwQ)) {
            return this.eev();
        }
        if (string.equalsIgnoreCase(kwP)) {
            List<String> list = this.eeu();
            return list == null || list.isEmpty() ? null : list;
        }
        if (string.equals(kwR)) {
            return this.eex() instanceof bmq_0;
        }
        return null;
    }

    @Nullable
    private String getDescription() {
        Qk qk = this.eex();
        if (qk == null) {
            return null;
        }
        switch (qk.bab()) {
            case 1: {
                bmq_0 bmq_02 = (bmq_0)qk;
                String string = bmq_02.getDescription();
                if (string == null || string.isEmpty()) break;
                return string;
            }
            case 34: {
                if (this.kwB.isEmpty()) {
                    return null;
                }
                QD qD = this.kwB.get(0);
                eHC eHC2 = eHC.Px(qD.bba().aZH());
                return aum_0.cWf().c("antiAddictionLevel.desc." + eHC2.aJr(), new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    public fqY eet() {
        Qk qk = this.eex();
        if (qk == null) {
            return null;
        }
        if (qk.bab() == 1) {
            bmq_0 bmq_02 = (bmq_0)qk;
            return bmq_02.eet();
        }
        return null;
    }

    private String m(boolean bl, boolean bl2) {
        Object object;
        Object object2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null && this.kwD != null) {
            String string;
            if (this.kwD.bbY()) {
                return null;
            }
            short s = bsj_02.dGQ().a(this.kwD);
            if (s == 0) {
                String string2 = bl2 ? aum_0.cWf().c("remaining.duration.turn.short", "&lt;1") : aum_0.cWf().c("duration.last.turn", new Object[0]);
                return bl ? new ahv_2().ceC().ih(awx_2.dnJ.bQk()).c(string2).ceL() : string2;
            }
            String string3 = string = bl2 ? aum_0.cWf().c("remaining.duration.turn.short", s) : aum_0.cWf().c("remaining.turns", s);
            if (s <= 2 && bl) {
                return new ahv_2().ceC().ih(awx_2.dnJ.bQk()).c(string).ceD().ceL();
            }
            return string;
        }
        long l = this.kwC;
        Qk qk = this.eex();
        if (qk != null && qk.bab() == 34) {
            object2 = bgt_02.dnu();
            object = ((ehz_0)object2).fvM().l(ue_0.bjV().bjc());
            ((uz_0)object).g(((ehz_0)object2).fvL());
            l = (int)((uz_0)object).bjS();
        }
        if (l != -1L) {
            object2 = uz_0.fo(l);
            Object object3 = object = bl2 ? uc_0.i((ua_0)object2) : uc_0.k((ua_0)object2);
            if (bl && l <= 60L) {
                object = new ahv_2().ceC().ih(awx_2.dnJ.bQk()).c((CharSequence)object).ceD().ceL();
            }
            return object;
        }
        return null;
    }

    @Nullable
    private List<String> eeu() {
        return bms_0.a(this.kwB, this.eex());
    }

    public int eev() {
        int n;
        Qk qk = this.eex();
        if (qk instanceof fqU) {
            fqU fqU2 = (fqU)qk;
            return fqU2.cmL();
        }
        if (qk instanceof eSS) {
            eSS eSS2 = (eSS)qk;
            return eSS2.cmL();
        }
        if (qk != null && ((n = qk.bab()) == 28 || n == 32)) {
            return 0;
        }
        if (this.kwE.size() == 1) {
            n = -1;
            boolean bl = true;
            int n2 = this.kwB.size();
            for (int i = 0; i < n2; ++i) {
                QD qD = this.kwB.get(i);
                if (qD.aZQ() && qD.bba() != null) {
                    bl = false;
                    break;
                }
                if (n != -1 && n != qD.d()) {
                    bl = false;
                    break;
                }
                n = qD.d();
            }
            if (bl) {
                return this.kwB.size();
            }
        }
        return 0;
    }

    public String byf() {
        Qk qk = this.eex();
        try {
            if (qk != null) {
                switch (qk.bab()) {
                    case 12: {
                        bgv_2 bgv_22;
                        if (!(qk instanceof ffV)) {
                            int n = (int)qk.QF();
                            bgv_22 = (bgv_2)fgD.fXh().Vd(n);
                        } else {
                            bgv_22 = (bgv_2)((ffV)qk).dOg();
                        }
                        return (String)bgv_22.eu(kwO);
                    }
                    case 11: 
                    case 25: {
                        return (String)((bmx_0)qk).eu("smallIconUrl");
                    }
                    case 1: {
                        bmq_0 bmq_02 = (bmq_0)qk;
                        return bmq_02.byf();
                    }
                    case 3: {
                        QQ qQ = (QQ)qk;
                        return String.format(auc_0.cVq().bS("effectAreasIconsPath"), qQ.bcw());
                    }
                    case 19: 
                    case 33: {
                        return auc_0.cVq().a("protectorBuffsIconsPath", "defaultIconPath", -1);
                    }
                    case 32: {
                        return auc_0.cVq().a("protectorBuffsIconsPath", "defaultIconPath", -2);
                    }
                    case 28: {
                        return auc_0.cVq().a("protectorBuffsIconsPath", "defaultIconPath", -2);
                    }
                    case 21: {
                        return auc_0.cVq().a("timePointBonusIconsPath", "defaultIconPath", ewc_1.rBP.SL((int)qk.QF()));
                    }
                    case 34: {
                        if (this.kwB.isEmpty()) {
                            return null;
                        }
                        QD qD = this.kwB.get(0);
                        eHC eHC2 = eHC.Px(qD.bba().aZH());
                        return auc_0.cVq().a("antiAddictionIconsPath", "defaultIconPath", eHC2.aJr());
                    }
                }
            }
        }
        catch (fu_0 fu_02) {
            kwA.error((Object)"PropertyException pendant l'acc\u00e8s \u00e0 l'url de l'icone du RunningEffect");
            return null;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return kwS;
    }

    public void d(Qk qk) {
        if (!this.kwE.contains(qk)) {
            this.kwE.add(qk);
        }
    }

    public void e(Qk qk) {
        this.kwE.remove(qk);
    }

    public boolean eew() {
        return !this.kwE.isEmpty();
    }

    @Nullable
    public Qk eex() {
        if (!this.kwE.isEmpty()) {
            return this.kwE.get(0);
        }
        return null;
    }

    private void A(QD qD) {
        boolean bl;
        Qk qk = this.eex();
        boolean bl2 = bl = qk != null && qk.bab() != 1;
        if (bl && qD.bbY()) {
            return;
        }
        tz_0 tz_02 = qD.bbW();
        if (tz_02 == null) {
            return;
        }
        if (this.kwD == null) {
            this.kwD = tz_02;
        }
        if (tz_02.b(this.kwD) > 0) {
            this.kwD = tz_02;
        }
    }

    public String getName() {
        Qk qk = this.eex();
        if (qk != null) {
            switch (qk.bab()) {
                case 12: {
                    return ((ffV)qk).getName();
                }
                case 11: 
                case 25: {
                    return (String)((bmx_0)qk).eu(kwF);
                }
                case 1: {
                    bmq_0 bmq_02 = (bmq_0)qk;
                    Object object = bmq_02.efb();
                    if (bmq_02.cwF() && !this.kwB.isEmpty()) {
                        QD qD = this.kwB.get(0);
                        String string = ((bgy)qD.bbc()).getName();
                        object = (String)object + " - " + string;
                    }
                    return object;
                }
                case 3: {
                    QQ qQ = (QQ)qk;
                    return aum_0.cWf().a(6, (long)((int)qQ.bcw()), new Object[0]);
                }
                case 19: 
                case 33: {
                    return aum_0.cWf().c("protector.buff.generic.name", new Object[0]);
                }
                case 28: {
                    return aum_0.cWf().c("haven.world.buff", new Object[0]);
                }
                case 32: {
                    return aum_0.cWf().c("guild.buff", new Object[0]);
                }
                case 21: {
                    return aum_0.cWf().c("timePoint.bonus", new Object[0]);
                }
                case 34: {
                    if (this.kwB.isEmpty()) {
                        return null;
                    }
                    QD qD = this.kwB.get(0);
                    eHC eHC2 = eHC.Px(qD.bba().aZH());
                    return aum_0.cWf().c("antiAddictionLevel.name." + eHC2.aJr(), new Object[0]);
                }
            }
        }
        return "";
    }

    public short aHb() {
        Qk qk = this.eex();
        if (qk != null && qk.bab() == 1) {
            return ((bmq_0)qk).aHb();
        }
        return 16383;
    }

    @Override
    public void aZp() {
        if (this.bip != null) {
            try {
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                kwA.error((Object)("Exception dans le release de " + this.getClass().toString() + " normalement impossible"));
            }
            this.bip = null;
        } else {
            this.aVH();
        }
    }

    @Override
    public void aVH() {
        this.kwE.clear();
        this.kwB.clear();
        this.bip = null;
        this.kwC = -1L;
        this.kwD = null;
    }

    @Override
    public void aVI() {
    }

    public int a(@NotNull bMn bMn2) {
        bsj_0 bsj_02;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        tz_0 tz_02 = this.kwD;
        tz_0 tz_03 = bMn2.kwD;
        Qk qk = this.eex();
        Qk qk2 = bMn2.eex();
        long l = this.kwC;
        long l2 = bMn2.kwC;
        if (qk == null) {
            return 1;
        }
        if (qk2 == null) {
            return -1;
        }
        if (bgt_02 != null && (bsj_02 = bgt_02.dmV()) != null && tz_02 != null && tz_03 != null) {
            if (tz_02.bbY() && tz_03.bbY()) {
                return Longs.compare((long)qk.QF(), (long)qk2.QF());
            }
            if (tz_02.bbY()) {
                return 1;
            }
            if (tz_03.bbY()) {
                return -1;
            }
            short s = bsj_02.dGQ().a(tz_02);
            short s2 = bsj_02.dGQ().a(tz_03);
            return Shorts.compare((short)s, (short)s2);
        }
        if (l == l2) {
            return Longs.compare((long)qk.QF(), (long)qk2.QF());
        }
        if (l == -1L) {
            return 1;
        }
        if (l2 == -1L) {
            return -1;
        }
        return Longs.compare((long)l, (long)l2);
    }

    public void lO(long l) {
        this.kwC = l;
    }

    public void b(QD qD, boolean bl) {
        if (bl && !this.kwB.contains(qD)) {
            int n;
            boolean bl2 = false;
            ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
            for (Object object : this.kwE.get(0)) {
                arrayList.add((enk_0)object);
            }
            for (n = this.kwB.size() - 1; n >= 0; --n) {
                Object object;
                object = this.kwB.get(n);
                if (!((QD)object).aZQ() || ((QD)object).bba() == null || !qD.aZQ() || qD.bba() == null || ((QD)object).bba().avZ() != qD.bba().avZ()) continue;
                int n2 = this.kwB.indexOf(object);
                if (this.kwB.contains(qD)) continue;
                this.kwB.add(n2, qD);
                bl2 = true;
            }
            if (!bl2) {
                n = arrayList.indexOf(qD.bba());
                if (n >= 0 && n < this.kwB.size()) {
                    if (!this.kwB.contains(qD)) {
                        this.kwB.add(n, qD);
                    }
                } else if (!this.kwB.contains(qD)) {
                    this.kwB.add(qD);
                }
            }
        }
        this.A(qD);
    }

    public int eey() {
        return this.kwB.size();
    }

    public List<Integer> eez() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        this.kwB.forEach(qD -> arrayList.add(qD.getValue()));
        return arrayList;
    }

    public void eeA() {
        fse_1.gFu().a((aef_2)this, kwJ, kwL, kwK, kwM, kwN);
    }

    public bMn eeB() {
        int n;
        bMn bMn2 = new bMn();
        int n2 = this.kwB.size();
        for (n = 0; n < n2; ++n) {
            bMn2.kwB.add(this.kwB.get(n));
        }
        bMn2.kwC = this.kwC;
        bMn2.kwD = this.kwD;
        n2 = this.kwE.size();
        for (n = 0; n < n2; ++n) {
            bMn2.kwE.add(this.kwE.get(n));
        }
        return bMn2;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bMn)object);
    }
}

