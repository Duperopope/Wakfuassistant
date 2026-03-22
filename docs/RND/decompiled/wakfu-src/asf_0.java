/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aSf
 */
public class asf_0
extends aRY {
    private final int eNh;
    private final int eNi;
    private final List<Integer> eNj;

    public asf_0(int n) {
        this.eNh = n;
        this.eNi = -1;
        this.eNj = List.of();
    }

    public asf_0(int n, List<Integer> list) {
        this.eNh = 1;
        this.eNi = n;
        this.eNj = list;
    }

    @Override
    public boolean isValid() {
        return this.eNh != 1 || this.eNi >= 0;
    }

    @Override
    public void bGy() {
        if (this.eNh == 0) {
            asf_0.cBS();
        } else if (this.eNh == 1) {
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)335);
            ns_02.D((byte)1);
            ns_02.nX(this.eNi);
            ns_02.D((byte)this.eNj.size());
            for (int n : this.eNj) {
                ns_02.D((byte)n);
            }
            asf_0.c(ns_02);
        } else if (this.eNh == 2) {
            ns_0 ns_03 = new ns_0();
            ns_03.C((byte)3);
            ns_03.Q((short)335);
            ns_03.D((byte)2);
            asf_0.c(ns_03);
        } else {
            aqh_0.cBI().jI("A problem occurred with the mutePartition command");
        }
    }

    private static void c(ns_0 ns_02) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("You need to be connected to access this command!");
        }
    }

    private static void cBS() {
        asf_0.jF("\"help\" | \"h\" : show help");
        asf_0.jF("[radius] : mute partitions for everything in the specified radius (default is 1)");
        asf_0.jF("&lt;radius&gt; [type...] : mute partitions for the specified types in the specified radius (multiple types may be specified by separating them with spaces)");
        asf_0.jF("\nTypes : ");
        for (fsh_0 fsh_02 : fsh_0.values()) {
            asf_0.jF("   - " + fsh_02.name() + " : " + fsh_02.aJr());
        }
    }
}

