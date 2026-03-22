/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

/*
 * Renamed from aRf
 */
public class arf_0
extends aRY {
    public static final int eIK = 0;
    public static final int eIL = 1;
    public static final int eIM = 2;
    public static final int eIN = 5;
    public static final int eIO = 6;
    public static final int eIP = 7;
    public static final int eIQ = 8;
    public static final int eIR = 9;
    private final int eIS;
    private final String[] eIT;

    public arf_0(int n, String ... stringArray) {
        this.eIS = n;
        this.eIT = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eIS) {
            case 0: 
            case 1: 
            case 9: {
                return this.eIT.length == 0;
            }
            case 6: {
                return this.eIT.length == 0 || this.eIT.length == 1;
            }
            case 2: 
            case 7: 
            case 8: {
                return this.eIT.length == 1;
            }
            case 5: {
                return this.eIT.length == 1 || this.eIT.length == 2;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        switch (this.eIS) {
            case 0: {
                arf_0.cBS();
                break;
            }
            case 1: {
                arf_0.D(ayf_22);
                break;
            }
            case 2: {
                this.E(ayf_22);
                break;
            }
            case 5: {
                this.F(ayf_22);
                break;
            }
            case 6: {
                this.cCx();
                break;
            }
            case 7: {
                this.a(ayf_22, true);
                break;
            }
            case 8: {
                this.a(ayf_22, false);
                break;
            }
            case 9: {
                arf_0.G(ayf_22);
                break;
            }
        }
    }

    private static void D(ayf_2 ayf_22) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)24);
        ns_02.cX(bgt_02.Sn());
        ayf_22.d(ns_02);
    }

    private void E(ayf_2 ayf_22) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        int n = Integer.parseInt(this.eIT[0]);
        if (n < 1 || n > 50) {
            aqh_0.cBI().jI("Le niveau d'objet doit \u00eatre entre 1 et 50!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)116);
        ns_02.cX(bgt_02.Sn());
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private void F(ayf_2 ayf_22) {
        Object object;
        int n;
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        int n2 = Integer.parseInt(this.eIT[0]);
        if (n2 < 1 || n2 > 10) {
            aqh_0.cBI().jI("Difficult\u00e9 hors des limites disponibles.");
            return;
        }
        if (this.eIT.length == 2) {
            n = Integer.parseInt(this.eIT[1]);
            object = eId.quO.PM(n);
            if (object == null) {
                aqh_0.cBI().jI("Cet id ne correspond pas \u00e0 un donjon.");
                return;
            }
        } else {
            if (!bgt_02.doa().isPresent()) {
                aqh_0.cBI().jI("Pas dans un donjon.");
                return;
            }
            object = bgt_02.doa().get();
            long l = object.bhh();
            Optional<eIb> optional = eId.quO.pC(l);
            if (optional.isEmpty()) {
                aqh_0.cBI().jI("Pas dans un donjon.");
                return;
            }
            n = optional.get().d();
        }
        object = new ns_0();
        ((ns_0)object).C((byte)3);
        ((ns_0)object).Q((short)192);
        ((ns_0)object).cX(bgt_02.Sn());
        ((ns_0)object).nX(n);
        ((ns_0)object).nX(n2);
        ayf_22.d(object);
    }

    private void a(ayf_2 ayf_22, boolean bl) {
        int n = Integer.parseInt(this.eIT[0]);
        boolean bl2 = bwz_0.jAA.FY(n).isPresent();
        eIb eIb2 = eId.quO.PM(n);
        if (!bl2 && eIb2 == null) {
            aqh_0.cBI().jI("Cet id ne correspond pas \u00e0 un donjon.");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)336);
        ns_02.nX(n);
        ns_02.aN(bl);
        ayf_22.d(ns_02);
    }

    private void cCx() {
        arf_0.jF("Dungeon List:");
        String string = this.eIT.length > 0 ? this.eIT[0].toLowerCase() : "";
        eId.quO.D((TObjectProcedure<eIb>)((TObjectProcedure)eIb2 -> {
            String string2 = aum_0.cWf().a(137, (long)eIb2.d(), new Object[0]);
            if (string.isEmpty() || string2.toLowerCase().contains(string)) {
                arf_0.jF(String.format("%3d %s", eIb2.d(), string2));
            }
            return true;
        }));
        bwz_0.jAA.dMZ().forEach((n, bxa_02) -> {
            String string2 = aum_0.cWf().a(137, (long)n.intValue(), new Object[0]);
            if (string.isEmpty() || string2.toLowerCase().contains(string)) {
                arf_0.jF(String.format("%3d %s", n, string2));
            }
        });
    }

    private static void G(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)113);
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        arf_0.jF("Syntax: dungeon | dj <command>");
        arf_0.jF("(help | h) : show help");
        arf_0.jF("(info | i) : show information about dungeon difficulty");
        arf_0.jF("(level | lv) <1-50> : change the difficulty of the dungeon");
        arf_0.jF("(progression | p) <1-50> : set the current character max reached difficulty of the current dungeon");
        arf_0.jF("(progression | p) <1-50> dungeonId : set the current character max reached difficulty of the given dungeon");
        arf_0.jF("(list) : show the list of dungeon ids");
        arf_0.jF("(list) \"dungeon name\" : show the ids of the dungeons matching the search");
        arf_0.jF("(lock) dungeonId : lock the dungeon entrance");
        arf_0.jF("(unlock) dungeonId : unlock the dungeon entrance");
        arf_0.jF("(status) : show the locked dungeons");
    }
}

