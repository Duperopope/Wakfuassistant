/*
 * Decompiled with CFR 0.152.
 */
public class aRg
extends aRY {
    public static final int eIU = 0;
    public static final int eIV = 1;
    public static final int eIW = 2;
    public static final int eIX = 3;
    public static final int eIY = 4;
    public static final int eIZ = 5;
    public static final int eJa = 6;
    public static final int eJb = 7;
    private final int eJc;
    private final String[] eJd;

    public aRg(int n, String ... stringArray) {
        this.eJc = n;
        this.eJd = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eJc) {
            case 0: 
            case 5: {
                return this.eJd.length == 0;
            }
            case 3: 
            case 4: 
            case 6: {
                return this.eJd.length == 1;
            }
            case 1: 
            case 7: {
                return this.eJd.length == 0 || this.eJd.length == 1;
            }
            case 2: {
                return this.eJd.length == 1 || this.eJd.length == 2;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        if (this.eJc != 0 && this.eJc != 1) {
            this.cBY();
            return;
        }
        this.cBZ();
    }

    private void cBZ() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        switch (this.eJc) {
            case 0: {
                aRg.cBS();
                break;
            }
            case 1: {
                ns_02.Q((short)259);
                if (this.eJd.length > 0) {
                    ns_02.nX(Integer.parseInt(this.eJd[0]));
                    break;
                }
                ns_02.nX(-1);
                break;
            }
            case 4: {
                ns_02.Q((short)105);
                ns_02.cX(Long.parseLong(this.eJd[0]));
                break;
            }
            case 5: {
                ns_02.Q((short)174);
                break;
            }
            case 6: {
                ns_02.Q((short)318);
                ns_02.nX(Integer.parseInt(this.eJd[0]));
                break;
            }
            case 7: {
                ns_02.Q((short)83);
                if (this.eJd.length <= 0) break;
                ns_02.D(Byte.parseByte(this.eJd[0]));
                break;
            }
            case 3: {
                ns_02.Q((short)6);
                ns_02.D(Byte.parseByte(this.eJd[0]));
                break;
            }
            case 2: {
                ns_02.Q((short)60);
                ns_02.nX(Integer.parseInt(this.eJd[0]));
                if (this.eJd.length <= 1) break;
                ns_02.D(Byte.parseByte(this.eJd[1]));
            }
        }
        ayf_22.d(ns_02);
    }

    private void cBY() {
        fiq_2.gCw().d(fik_2.a(string -> this.cBZ(), string -> aRg.jF("You HAVE to validate your command with a dev")).vE("Do you have a developer agreement for this command ?"));
    }

    private static void cBS() {
        aRg.jF("Syntax: dungeonLadder | dl <command> : /!\\ ASK TO A DEV BEFORE /!\\ any command which isn't help or info");
        aRg.jF("(help | h) : show help");
        aRg.jF("(info) [dungeon_id] : show information about dungeon ladder, or for a specific dungeon if specified");
        aRg.jF("(reset_dungeon | rd) <dungeonId> :  clear ladder for a dungeon");
        aRg.jF("(recompute_ladder | rl) <recompute_type> : start ladder recompute, put 0 for full recompute, 1 for the recomputeAllTimeLadder from LAST_MONTH only");
        aRg.jF("(delete_entry | de) <team_id> : delete the ladder entry for specified teamId");
        aRg.jF("(disable) : disable ladder for whole dungeons");
        aRg.jF("(disable_dungeon | dd) <dungeon_id> : disable ladder for a dungeon");
        aRg.jF("(reload_from_database | rfd) : reload the ladder from the database");
    }
}

