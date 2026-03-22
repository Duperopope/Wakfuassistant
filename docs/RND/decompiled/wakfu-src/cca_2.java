/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cca
 */
public final class cca_2
implements aeh_2,
ffc_2 {
    private static final String lNo = "type";
    private static final String lNp = "color";
    private static final String lNq = "moderatorName";
    private static final String lNr = "date";
    private static final String lNs = "reason";
    private static final String lNt = "isNote";
    private static final String[] lNu = new String[]{"type", "color", "moderatorName", "date", "reason", "isNote"};
    private static final SimpleDateFormat lNv = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    private final ftY lNw;
    private final exj lNx;

    public cca_2(ftY ftY2) {
        this.lNw = ftY2;
        this.lNx = exj.Oy(ftY2.gna());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "type": {
                return this.aLZ();
            }
            case "color": {
                return new awx_2(this.getColor(), 0.5f);
            }
            case "moderatorName": {
                return this.lNw.eta();
            }
            case "date": {
                return this.etc();
            }
            case "reason": {
                return this.etd();
            }
            case "isNote": {
                return this.ete();
            }
        }
        return null;
    }

    @NotNull
    public String aLZ() {
        if (this.lNx != null) {
            return this.lNx.ffl().name();
        }
        if (this.ete()) {
            return "NOTE";
        }
        if (this.etf()) {
            return "LANGUAGE RESTRICTION";
        }
        return "UNKNOWN";
    }

    private axb_2 getColor() {
        if (this.lNx != null) {
            switch (this.lNx.ffl()) {
                case oWx: {
                    return awx_2.dnX;
                }
                case oWy: {
                    return awx_2.dnU;
                }
                case oWz: {
                    return awx_2.dnJ;
                }
            }
        }
        if (this.ete()) {
            return awx_2.dnN;
        }
        if (this.etf()) {
            return awx_2.dnO;
        }
        return awx_2.dnB;
    }

    public String eta() {
        return this.lNw.eta();
    }

    public Date etb() {
        return this.lNw.etb();
    }

    private String etc() {
        return lNv.format(this.lNw.etb());
    }

    public String etd() {
        if (this.lNx != null) {
            return aum_0.cWf().c(String.format("moderationPanel.sanction%d", this.lNx.ezB()), new Object[0]);
        }
        return this.lNw.etd();
    }

    public boolean ete() {
        return this.lNw.gna() == -1;
    }

    private boolean etf() {
        return this.lNw.gna() == -2;
    }

    public ftY etg() {
        return this.lNw;
    }

    public String toString() {
        return this.aLZ() + " - " + this.lNw.eta() + " - " + this.etc() + " - " + this.etd();
    }

    @Override
    public String cUG() {
        return this.toString();
    }

    @Override
    public boolean cUH() {
        return false;
    }

    @Override
    public String[] bxk() {
        return lNu;
    }
}

