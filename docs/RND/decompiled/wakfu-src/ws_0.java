/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ws
 */
public abstract class ws_0 {
    public int bap;
    public int baq;
    public short ban;
    public byte aXR;
    public boolean bNr;

    public int blW() {
        return this.ban - this.aXR;
    }

    public boolean a(ws_0 ws_02) {
        return ws_02.blW() <= this.ban && ws_02.ban >= this.ban;
    }

    public static boolean a(ws_0 ws_02, ws_0 ws_03) {
        return ws_02.a(ws_03) || ws_03.a(ws_02);
    }

    public abstract ws_0 b(ws_0 var1);

    protected static void a(ws_0 ws_02, ws_0 ws_03, ws_0 ws_04) {
        assert (ws_02.bap == ws_03.bap && ws_02.baq == ws_03.baq);
        ws_04.bap = ws_02.bap;
        ws_04.baq = ws_02.baq;
        ws_04.ban = (short)Math.max(ws_02.ban, ws_03.ban);
        int n = Math.min(ws_02.blW(), ws_03.blW());
        ws_04.aXR = GC.ct(ws_04.ban - n);
        ws_04.bNr = ws_02.bNr && ws_03.bNr;
    }
}

