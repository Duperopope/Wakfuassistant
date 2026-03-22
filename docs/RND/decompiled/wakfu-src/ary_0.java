/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from aRy
 */
public class ary_0
extends aRY {
    public static final int eKe = 0;
    public static final int eKf = 1;
    public static final int eKg = 2;
    public static final int eKh = 3;
    public static final int eKi = 4;
    public static final int eKj = 5;
    public static final int eKk = 6;
    public static final int eKl = 7;
    public static final int eKm = 8;
    private final int eKn;
    private List<Integer> eKo = null;

    public ary_0(int n) {
        this.eKn = n;
    }

    public ary_0(int n, int n2) {
        this(n, Collections.singletonList(n2));
    }

    public ary_0(int n, List<Integer> list) {
        this.eKn = n;
        this.eKo = list;
    }

    @Override
    public boolean isValid() {
        switch (this.eKn) {
            case 0: 
            case 3: 
            case 5: 
            case 7: 
            case 8: {
                return true;
            }
            case 1: 
            case 2: 
            case 4: 
            case 6: {
                return this.eKo != null && this.eKo.size() > 0;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Can't use this command: you're not logged in!");
            return;
        }
        switch (this.eKn) {
            case 0: {
                ary_0.cBS();
                break;
            }
            case 1: {
                this.cCN();
                break;
            }
            case 2: {
                this.a(ayf_22, true, this.cCO());
                break;
            }
            case 4: {
                this.a(ayf_22, false, this.cCO());
                break;
            }
            case 3: {
                this.a(ayf_22, true, this.cCP());
                break;
            }
            case 5: {
                this.a(ayf_22, false, this.cCP());
                break;
            }
            case 6: {
                this.a(ayf_22, this.cCO());
                break;
            }
            case 7: {
                this.K(ayf_22);
                break;
            }
            case 8: {
                ary_0.cCM();
            }
        }
    }

    private static void cCM() {
        Optional optional = bbs_2.a(eva_1.owD);
        if (optional.isPresent()) {
            ary_0.jF("Guide account data :");
            ary_0.jF("discovered = " + String.valueOf(((frq_0)optional.get()).gkw()));
            ary_0.jF("unread = " + String.valueOf(((frq_0)optional.get()).gkx()));
            ary_0.jF(" ");
        } else {
            ary_0.jI("Missing tutorial data for this account");
        }
    }

    private void cCN() {
        for (Integer n : this.eKo) {
            dae_0 dae_02 = new dae_0(19396);
            dae_02.sY(n);
            aaw_1.bUq().h(dae_02);
        }
    }

    private void a(ayf_2 ayf_22, boolean bl, Set<Integer> set) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)393);
        ns_02.aN(bl);
        ns_02.R((short)set.size());
        set.forEach(ns_02::nX);
        ayf_22.d(ns_02);
    }

    private void a(ayf_2 ayf_22, Set<Integer> set) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)410);
        ns_02.aN(false);
        ns_02.R((short)set.size());
        set.forEach(ns_02::nX);
        ayf_22.d(ns_02);
    }

    private void K(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)410);
        ns_02.aN(true);
        ayf_22.d(ns_02);
    }

    private Set<Integer> cCO() {
        Set<Integer> set = this.cCP();
        return this.eKo.stream().filter(set::contains).collect(Collectors.toSet());
    }

    private Set<Integer> cCP() {
        return bop_2.egN().egO();
    }

    private static void cBS() {
        ary_0.jF("(help | h) : show full documentation");
        ary_0.jF("(show | s) ids... : show the given guide(s) in a popup");
        ary_0.jF("read ids... : mark given guide(s) as read");
        ary_0.jF("readAll : mark all guides as read");
        ary_0.jF("discover ids... : discover guide(s) and/or mark it as unread");
        ary_0.jF("discoverAll : discover all guides and/or mark them as unread");
        ary_0.jF("remove ids... : remove guide(s) from this account");
        ary_0.jF("removeAll : remove all guides from this account");
        ary_0.jF("info : print guides discovered/read by this account ");
    }
}

