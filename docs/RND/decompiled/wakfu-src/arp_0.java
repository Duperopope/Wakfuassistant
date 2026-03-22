/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aRP
 */
public class arp_0
extends aRY {
    private static final List<Byte> eMd = List.of(Byte.valueOf((byte)0), Byte.valueOf((byte)1), Byte.valueOf((byte)2), Byte.valueOf((byte)3), Byte.valueOf((byte)4), Byte.valueOf((byte)6));
    public static final int eMe = 0;
    public static final int eMf = 1;
    public static final int eMg = 2;
    public static final int eMh = 3;
    private final int eMi;
    private final Object[] eMj;

    public arp_0(int n, Object ... objectArray) {
        this.eMi = n;
        this.eMj = objectArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eMi) {
            case 0: {
                return true;
            }
            case 2: 
            case 3: {
                return this.eMj.length == 0 || eMd.contains((byte)((Byte)this.eMj[0]));
            }
            case 1: {
                return this.eMj.length >= 3 && eMd.contains((byte)((Byte)this.eMj[0])) && (Integer)this.eMj[1] > 0 && (Integer)this.eMj[2] > 0;
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
        if (!evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ovp)) {
            aqh_0.cBI().jI("You do not have the rights to use this command.");
            return;
        }
        switch (this.eMi) {
            case 0: {
                arp_0.cBS();
                break;
            }
            case 1: {
                this.am(ayf_22);
                break;
            }
            case 2: {
                this.an(ayf_22);
                break;
            }
            case 3: {
                this.ao(ayf_22);
            }
        }
    }

    private void am(ayf_2 ayf_22) {
        cic_0 cic_02 = new cic_0((Byte)this.eMj[0], (Integer)this.eMj[1], (Integer)this.eMj[2]);
        ayf_22.d(cic_02);
    }

    private void an(ayf_2 ayf_22) {
        if (this.eMj.length > 0) {
            cid_0 cid_02 = new cid_0((Byte)this.eMj[0]);
            ayf_22.d(cid_02);
        } else {
            for (byte by : eMd) {
                cid_0 cid_03 = new cid_0(by);
                ayf_22.d(cid_03);
            }
        }
    }

    private void ao(ayf_2 ayf_22) {
        if (this.eMj.length > 0) {
            cia_0 cia_02 = new cia_0((Byte)this.eMj[0]);
            ayf_22.d(cia_02);
        } else {
            for (byte by : eMd) {
                cia_0 cia_03 = new cia_0(by);
                ayf_22.d(cia_03);
            }
        }
    }

    private static void cBS() {
        arp_0.jF("=== Lag command === ");
        arp_0.jI("/!\\ Please ask a dev before starting lag /!\\");
        arp_0.jF("\"help\" | \"h\" : show help");
        arp_0.jF("\"start\" &lt;Server Id&gt; &lt;Ping in ms&gt; &lt;Duration in min&gt; : start lag on given server with specified intensity and duration");
        arp_0.jF("\"stop\" &lt;Server Id&gt; : stop lag on given server");
        arp_0.jF("\"stop\" : stop lag on all servers");
        arp_0.jF("\"info\" &lt;Server Id&gt; : get lag info for given server");
        arp_0.jF("\"info\" : get lag info for all servers");
        arp_0.jF("");
        arp_0.jF("Server IDs :");
        for (byte by : eMd) {
            arp_0.jF("  - " + by + " : " + vh_0.ai(by));
        }
    }
}

