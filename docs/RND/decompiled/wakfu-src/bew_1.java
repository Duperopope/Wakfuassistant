/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEw
 */
public class bew_1
extends fhx_0 {
    private static final bew_1 jOx = new bew_1();
    private final aqd_1<ana_0> jOy;
    private final Set<fhy_0> jOz = new HashSet<fhy_0>();

    private bew_1() {
        this.jOy = new aqe_1<ana_0>(new ana_0());
    }

    public static bew_1 dSk() {
        return jOx;
    }

    @Override
    @Nullable
    public fhy_0 Gy(int n) {
        if (n == 0) {
            return null;
        }
        fhy_0 fhy_02 = (fhy_0)this.srb.get(n);
        if (fhy_02 == null && !this.srb.containsKey(n)) {
            ana_0 ana_02 = this.jOy.tE(n);
            if (ana_02 == null) {
                return null;
            }
            fhy_02 = bew_1.c(ana_02);
            if (fhy_02 != null) {
                this.k(fhy_02);
            }
        }
        return fhy_02;
    }

    public void b(ana_0 ana_02) {
        fhy_0 fhy_02 = bew_1.c(ana_02);
        this.k(fhy_02);
        if (fhy_02 != null && fhy_02.cpZ()) {
            this.jOz.add(fhy_02);
        }
    }

    @Nullable
    private static fhy_0 c(ana_0 ana_02) {
        if (ana_02 == null) {
            return null;
        }
        short s = ana_02.aIi();
        short s2 = ana_02.cpX();
        String[] stringArray = ana_02.cqa();
        ArrayList<ffS> arrayList = new ArrayList<ffS>();
        for (String string : stringArray) {
            if (string != null && !string.isEmpty()) {
                ffS ffS2 = ffS.valueOf(string);
                arrayList.add(ffS2);
                continue;
            }
            sra.error((Object)("Le slot [" + string + "] n'est pas valide"));
        }
        String[] stringArray2 = ana_02.cqb();
        ArrayList<ffS> arrayList2 = new ArrayList<ffS>();
        for (String string : stringArray2) {
            arrayList2.add(ffS.valueOf(string));
        }
        Object[] objectArray = bew_1.J(arrayList);
        ffS[] ffSArray = bew_1.J(arrayList2);
        fhy_0 fhy_02 = new fhy_0(s, s2, (ffS[])objectArray);
        if (ffSArray != null) {
            fhy_02.d(ffSArray);
        }
        fhy_02.nq(ana_02.cpZ());
        fhy_02.nr(ana_02.cpY());
        fhy_02.nt(ana_02.cqc());
        fhy_02.fe(ana_02.cqd());
        return fhy_02;
    }

    private static ffS[] J(ArrayList<ffS> arrayList) {
        if (arrayList.size() > 0) {
            return arrayList.toArray(new ffS[arrayList.size()]);
        }
        return null;
    }

    public boolean aJG() {
        return this.srb.isEmpty();
    }

    public Collection<fhy_0> dSl() {
        return Collections.unmodifiableSet(this.jOz);
    }
}

