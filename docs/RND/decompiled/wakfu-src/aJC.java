/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class aJC {
    private static final Logger eby = Logger.getLogger(aJC.class);
    public static final int ebz = 8;
    static final Comparator<bgy> ebA = new aJD();
    static final Comparator<bgy> ebB = new aJE();
    static final Comparator<bgy> ebC = new aJF();
    private static final Comparator<bgy> ebD = new aJG();

    static Optional<aJI> a(acd_1 acd_12, bsi_0 bsi_02, int n) {
        try {
            aJI aJI2 = new aJI(aym_2.bSE(), acd_12.getX(), acd_12.getY(), acd_12.bdi(), bsi_02, (byte)n);
            aJI2.aPg();
            aJI2.a(new aJH(bsi_02, aJI2));
            return Optional.of(aJI2);
        }
        catch (Exception exception) {
            eby.error((Object)"unable to create fight sword element", (Throwable)exception);
            return Optional.empty();
        }
    }

    static boolean a(bsi_0 bsi_02, bgy bgy3, dci_0 dci_02) {
        if (bsi_02 == null) {
            return false;
        }
        if (bgy3 == null) {
            return false;
        }
        byte by = bsi_02.dGr();
        List list = bsi_02.bL(by).stream().filter(bgy2 -> !bgy2.dOp()).sorted(ebA.thenComparing(ebC.thenComparing(ebB))).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        byte by2 = by == 0 ? (byte)1 : 0;
        List list2 = bsi_02.dGo().fLv() ? bsi_02.bL(by2).stream().filter(bgy2 -> !bgy2.dOp()).sorted(Comparator.comparing(exP::Sn).reversed()).limit(8L).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList)) : bsi_02.bL(by2).stream().filter(bgy2 -> !bgy2.dOp()).sorted(ebA.thenComparing(ebC.thenComparing(ebB))).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        int n = adv_1.b(list, bgy2 -> bgy2.cmL());
        int n2 = adv_1.b(list2, bgy2 -> bgy2.cmL());
        if (!list.isEmpty()) {
            bdn_2.b(dci_02, n);
        }
        if (!list2.isEmpty()) {
            bdn_2.c(dci_02, n2);
        }
        boolean bl = bgy3.ddI().bps();
        bdn_2.a(dci_02, bgy3);
        if (!list.isEmpty()) {
            dci_02.kZ(list.get(0) instanceof bhJ);
        }
        if (!list2.isEmpty()) {
            dci_02.la(list2.get(0) instanceof bhJ);
        }
        aJC.a(true, list, bl, dci_02);
        aJC.a(false, list2, bl, dci_02);
        aJC.a(dci_02, bsi_02);
        aJC.b(dci_02, bsi_02);
        ahv_2 ahv_22 = new ahv_2();
        dci_02.re(ahv_22.ceu().c(list.size() + " VS " + list2.size()).cev().ceL());
        ahv_22.clear();
        return true;
    }

    private static void a(dci_0 dci_02, bsi_0 bsi_02) {
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = aJC.b(bsi_02);
        String string = bl ? aum_0.cWf().c("fight.placement", new Object[0]) : aum_0.cWf().c("desc.inFight", new Object[0]);
        dci_02.ri(ahv_22.ceu().c(string).cev().ceL());
    }

    public static void b(dci_0 dci_02, bsi_0 bsi_02) {
        Object object;
        boolean bl = aJC.b(bsi_02);
        if (bl) {
            object = aum_0.cWf().c("remainingDurationSeconds", bsi_02.dGE().bjS());
        } else {
            String string = bsi_02.dGF();
            String string2 = aum_0.cWf().c("fight.turn", bsi_02.dGD());
            object = string + " - " + string2;
        }
        dci_02.rh((String)object);
    }

    private static boolean b(bsi_0 bsi_02) {
        return bsi_02.dGp() == etw_0.rqT || bsi_02.dGp() == etw_0.rqV;
    }

    public static void a(boolean bl, List<bgy> list, boolean bl2, dci_0 dci_02) {
        for (bgy bgy2 : list) {
            boolean bl3;
            Object object;
            if (bgy2 instanceof bhx_0) {
                object = bji_1.g((bhx_0)bgy2);
                bdn_2.a(bl2, bgy2, dci_02, (bjk_1)object);
                continue;
            }
            if (!(bgy2 instanceof bhJ)) continue;
            bdn_2.c(bgy2.ddI());
            object = bdn_2.Y(bgy2);
            String string = (String)bgy2.eu("smileyIconUrl");
            boolean bl4 = bl3 = bgy2.fgU() || bgy2.doP();
            if (bl) {
                dci_02.a((String)object, bdn_2.e(bgy2, true), string, null, bl3);
                continue;
            }
            dci_02.b((String)object, bdn_2.e(bgy2, true), string, null, bl3);
        }
    }
}

