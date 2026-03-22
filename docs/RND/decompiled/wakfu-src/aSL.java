/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class aSL
extends aRY {
    public static final int ePg = 0;
    public static final int ePh = 1;
    private final int ePi;
    private @Unmodifiable @Nullable List<Short> ePj;
    private int bSr;
    private String ePk;
    private String ePl;
    private String aCL;

    public aSL(int n) {
        this.ePi = n;
    }

    public aSL(int n, String string) {
        this.aCL = string;
        this.ePi = n;
    }

    public aSL(int n, String string, int n2) {
        this(n, string);
        this.ePj = List.of(Short.valueOf((short)n2));
    }

    public aSL(int n, String string, List<Integer> list) {
        this(n, string);
        this.ePj = list.stream().map(GC::cu).toList();
    }

    public aSL(int n, String string, int n2, List<Integer> list, String string2, String string3) {
        this(n, string, list);
        this.bSr = n2;
        this.ePk = string2;
        this.ePl = string3;
    }

    public aSL() {
        this.ePi = 1;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        Object object;
        short s;
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        switch (this.ePi) {
            case 0: {
                s = 19;
                break;
            }
            case 1: {
                String string = "spam help : show full documentation\nspam message instanceId : same for an instance. Instance id -1 equals to all the instances\nspam message delay startDate endDate -1 : send message from start date to end date to all the players with delay between two messages\nspam message delay startDate endDate instanceId(s) : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nDelay is in minutes";
                aqh_0.cBI().jF("spam help : show full documentation\nspam message instanceId : same for an instance. Instance id -1 equals to all the instances\nspam message delay startDate endDate -1 : send message from start date to end date to all the players with delay between two messages\nspam message delay startDate endDate instanceId(s) : same for instance\nDate syntax : dd/mm/yyyy hh:mm\nDelay is in minutes");
                return;
            }
            default: {
                return;
            }
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q(s);
        ns_02.cT(this.aCL);
        ns_02.nX(this.bSr);
        if (this.ePk != null) {
            object = arz_0.jT(this.ePk);
            ns_02.cX(((uw_0)object).bjB());
            if (object == null) {
                aqh_0.cBI().jI("Erreur de syntaxe dans la date de d\u00e9part - taper spam help pour voir la syntaxe");
                return;
            }
        } else {
            ns_02.cX(0L);
        }
        if (this.ePl != null) {
            object = arz_0.jT(this.ePl);
            ns_02.cX(((uw_0)object).bjB());
            if (object == null) {
                aqh_0.cBI().jI("Erreur de syntaxe dans la date de fin - taper spam help pour voir la syntaxe");
                return;
            }
        } else {
            ns_02.cX(0L);
        }
        if (this.ePj != null) {
            for (Short s2 : this.ePj) {
                ns_02.R(s2);
            }
        }
        ayf_22.d(ns_02);
    }
}

