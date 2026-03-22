/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Range
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;

public class Ct {
    public static void a(Cr cr, do_0 do_02) {
        try {
            int n2 = do_02.aIz() & 0xFFFF;
            Cq[] cqArray = (Cq[])ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(n2)), (DiscreteDomain)DiscreteDomain.integers()).stream().map(n -> Ct.b(do_02)).toArray(Cq[]::new);
            cr.a(cqArray);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to load sprite definitions", iOException);
        }
    }

    @Nullable
    private static Cq b(do_0 do_02) {
        try {
            int n;
            int n2;
            Cq cq = new Cq();
            cq.au(false);
            short s = do_02.aIz();
            cq.j(s);
            cq.f(do_02.aIy());
            if ((cq.aIl() & 0x40) == 0) {
                cq.mp(0);
                cq.mq(0);
            } else {
                cq.setName(do_02.aIC());
                cq.mp(cq.getName().hashCode());
                n2 = cq.getName().indexOf(95) + 1;
                cq.mq(cq.getName().substring(n2).hashCode());
            }
            do_02.aIA();
            do_02.aIA();
            if (!cq.aIq()) {
                int n3;
                n2 = do_02.aIy() & 0xFF;
                if (n2 != 0) {
                    for (n3 = 0; n3 < n2; ++n3) {
                        dn_0.c(do_02);
                    }
                }
                if ((n3 = do_02.aIy() & 0xFF) != 0) {
                    for (n = 0; n < n3; ++n) {
                        dn_0.c(do_02);
                    }
                }
            }
            n2 = do_02.aIz() & 0xFFFF;
            ea_1[] ea_1Array = new ea_1[n2];
            cq.a(ea_1Array);
            for (n = 0; n < ea_1Array.length; ++n) {
                int n4;
                eh_2[] eh_2Array = new ea_1();
                int n5 = dm_0.a((ea_1)eh_2Array, do_02, n);
                ea_1Array[n] = eh_2Array;
                if (n5 > 0) {
                    try {
                        ea_1 ea_12 = new ea_1();
                        ea_12.a(ea_1Array[n].aIG());
                        ea_12.a(new eh_2[0]);
                        for (int i = 0; i < n5; ++i) {
                            ea_1Array[++n] = ea_12;
                        }
                    }
                    catch (Exception exception) {
                        throw new IOException("erreur avec la definition " + cq.getName() + ". nombre de frame incorrete", exception);
                    }
                }
                if ((n4 = ea_1Array[n].aIG().length) <= cq.aIn()) continue;
                cq.ms(n4);
            }
            if (ea_1Array.length == 1) {
                eh_2[] eh_2Array;
                for (eh_2 eh_22 : eh_2Array = ea_1Array[0].aIH()) {
                    switch (eh_22.aJd()) {
                        case azj: 
                        case azq: 
                        case azm: 
                        case azk: {
                            cq.at(true);
                        }
                    }
                }
            }
            if (Cp.bn(cq.getName())) {
                return null;
            }
            return cq;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to load sprite", iOException);
        }
    }
}

