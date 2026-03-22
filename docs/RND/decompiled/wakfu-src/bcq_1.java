/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bcQ
 */
public class bcq_1
extends bcu_2 {
    private static final Logger hJw = Logger.getLogger(bcq_1.class);
    private static final String hJx = "quests";

    public bcq_1(long l, bcd_2 bcd_22) {
        super(l, bcd_22);
        Optional<bcc_1> optional = bcb_1.hDb.daC().stream().filter(bcc_12 -> bcc_12.d() == 4).findFirst();
        if (optional.isEmpty()) {
            hJw.error((Object)"Error with data export, no Quests achievement category found");
            return;
        }
        bcc_1 bcc_13 = optional.get();
        if (bcc_13.getChildren() == null) {
            hJw.error((Object)"Error with data export, no achievement in Quests category found");
            return;
        }
        bch_2 bch_22 = bcm_1.hIK.b(this.hEL, bcc_13, null);
        this.hEG.put(bcc_13.d(), bch_22);
        this.hEH.add(bch_22);
        this.hEI = bch_22;
    }

    @Override
    public boolean dbh() {
        return true;
    }

    @Override
    public String dbi() {
        return hJx;
    }
}

