/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

public class bom
implements aeh_2 {
    public static final String iNV = "teamId";
    public static final String iNW = "rank";
    public static final String iNX = "stasis";
    public static final String iNY = "dungeonTurn";
    public static final String iNZ = "bossTurn";
    public static final String iOa = "completionDate";
    public static final String iOb = "members";
    public static final String iOc = "recordBorder";
    public static final String iOd = "member0";
    public static final String iOe = "member1";
    public static final String iOf = "member2";
    public static final String iOg = "member3";
    public static final String iOh = "member4";
    public static final String iOi = "member5";
    public static final String iOj = "laurel";
    public static final String iOk = "isRewarded";
    public static final String iOl = "teamScore";
    public static final String iOm = "waveReached";
    public static final String iOn = "monstersDefeated";
    private final long iOo;
    private final int iOp;
    private final short iOq;
    private final short iOr;
    private final short iOs;
    private final long iOt;
    private final long iOu;
    private final ArrayList<bok> iOv = new ArrayList();
    private final int iOw;
    private final int iOx;
    private final boolean iOy;

    public bom(hy_1 hy_12, int n) {
        this.iOo = hy_12.IS();
        this.iOp = n;
        this.iOq = (short)hy_12.IU();
        this.iOr = (short)hy_12.IY();
        this.iOs = (short)hy_12.Ja();
        this.iOw = hy_12.Jh();
        this.iOx = hy_12.Jj();
        this.iOu = hy_12.IW();
        this.iOt = hy_12.Jf();
        this.iOy = this.iOw == 0 && this.iOq > 0 && this.iOt == 0L;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iNV)) {
            return "(" + this.iOo + ")";
        }
        if (string.equals(iNW)) {
            return this.iOp + 1;
        }
        if (string.equals(iNY)) {
            return aum_0.cWf().c("stasis.dungeon.turn", this.iOr);
        }
        if (string.equals(iNZ)) {
            return aum_0.cWf().c("stasis.dungeon.turn", this.iOs);
        }
        if (string.equals(iOa)) {
            uw_0 uw_02 = uw_0.fn(this.iOu);
            Locale locale = aum_0.cWf().aUXX().aUJ();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(1, 3, locale);
            dateFormat.setTimeZone(uw_0.bvG);
            String string2 = dateFormat.format(uw_02.bjC());
            return aum_0.cWf().c("dungeon.ladder.completion", new Object[0]) + string2;
        }
        if (string.equals(iOb)) {
            return this.iOv;
        }
        if (string.equals(iNX)) {
            return this.iOq;
        }
        if (string.equals(iOc)) {
            return bof.EK(this.iOq);
        }
        if (string.equals(iOd)) {
            return this.EQ(0);
        }
        if (string.equals(iOe)) {
            return this.EQ(1);
        }
        if (string.equals(iOf)) {
            return this.EQ(2);
        }
        if (string.equals(iOg)) {
            return this.EQ(3);
        }
        if (string.equals(iOh)) {
            return this.EQ(4);
        }
        if (string.equals(iOi)) {
            return this.EQ(5);
        }
        if (string.equals(iOj)) {
            return this.dAH();
        }
        if (string.equals(iOk)) {
            return this.dAG();
        }
        if (string.equals(iOl)) {
            return this.iOt / (long)this.iOv.size();
        }
        if (string.equals(iOm)) {
            return this.iOw;
        }
        if (string.equals(iOn)) {
            return this.iOx;
        }
        return null;
    }

    public boolean dAG() {
        return this.iOp < (this.iOy ? 13 : 200);
    }

    public String dAH() {
        if (this.iOp < (this.iOy ? 1 : 1)) {
            auc_0.cVq();
            return auc_0.kA(String.valueOf(3));
        }
        if (this.iOp < (this.iOy ? 7 : 60)) {
            auc_0.cVq();
            return auc_0.kA(String.valueOf(2));
        }
        if (this.iOp < (this.iOy ? 13 : 200)) {
            auc_0.cVq();
            return auc_0.kA(String.valueOf(1));
        }
        auc_0.cVq();
        return auc_0.kA(String.valueOf(0));
    }

    @Nullable
    public bok EQ(int n) {
        if (this.iOv.size() < n + 1) {
            return null;
        }
        return this.iOv.get(n);
    }

    public void a(bok bok2) {
        bok2.b(this);
        this.iOv.add(bok2);
    }

    public void clear() {
        this.iOv.clear();
    }

    public ArrayList<bok> dAI() {
        return this.iOv;
    }

    public int dAJ() {
        return this.iOp;
    }

    public short cnb() {
        return this.iOq;
    }
}

