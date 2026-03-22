/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aPA
 */
public final class apa_0 {
    private apa_0() {
    }

    public static void jl(String string) {
        if (StringUtils.isEmpty((CharSequence)string)) {
            return;
        }
        apc_0 apc_02 = apa_0.jm(string);
        apa_0.e(apc_02);
    }

    @Nullable
    private static apc_0 jm(String string) {
        apc_0 apc_02 = apd_0.cAO().cAQ().jj(string);
        if (apc_02 == null && (apc_02 = apd_0.cAO().jk(string)) == null) {
            apc_02 = new apc_0(-1L, string, string);
        }
        return apc_02;
    }

    public static void e(apc_0 apc_02) {
        if (apc_02 == null) {
            return;
        }
        if (apd_0.cAO().cAQ().d(apc_02) != null) {
            String string2 = aum_0.cWf().c("contactList.error.alreadyInFriendList", apc_02.xO());
            aPh.czg().iY(string2);
            return;
        }
        if (apd_0.cAO().cAQ().cAF() >= 100) {
            fiq_2.gCw().d(fik_2.gBZ().l("notification.groupLimitReached", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        if (apd_0.cAO().cAR().d(apc_02) != null) {
            fiq_2.gCw().d(fik_2.a(string -> {
                NJ nJ = new NJ();
                nJ.v(apc_02.Sn());
                aue_0.cVJ().etu().d(nJ);
                nd_1 nd_12 = new nd_1();
                nd_12.cU(apc_02.xO());
                aue_0.cVJ().etu().d(nd_12);
            }).l("contactList.question.friendToIgnored", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
        } else {
            nd_1 nd_12 = new nd_1();
            nd_12.cU(apc_02.xO());
            aue_0.cVJ().etu().d(nd_12);
        }
    }

    public static void jn(String string) {
        if (StringUtils.isEmpty((CharSequence)string)) {
            return;
        }
        apc_0 apc_02 = apa_0.jm(string);
        apa_0.f(apc_02);
    }

    public static void f(apc_0 apc_02) {
        if (apc_02 == null) {
            return;
        }
        if (apd_0.cAO().cAR().d(apc_02) != null) {
            String string2 = aum_0.cWf().c("contactList.error.alreadyInIgnoreList", apc_02.xO());
            aPh.czg().iY(string2);
            return;
        }
        if (apd_0.cAO().cAR().cAF() >= 100) {
            fiq_2.gCw().d(fik_2.gBZ().l("notification.groupLimitReached", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
            return;
        }
        if (apd_0.cAO().cAQ().d(apc_02) != null) {
            fiq_2.gCw().d(fik_2.a(string -> {
                ni_0 ni_02 = new ni_0();
                ni_02.u(apc_02.Sn());
                aue_0.cVJ().etu().d(ni_02);
                ne_0 ne_02 = new ne_0();
                ne_02.cW(apc_02.xO());
                aue_0.cVJ().etu().d(ne_02);
            }).l("contactList.question.ignoredToFriend", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
        } else {
            ne_0 ne_02 = new ne_0();
            ne_02.cW(apc_02.xO());
            aue_0.cVJ().etu().d(ne_02);
        }
    }
}

