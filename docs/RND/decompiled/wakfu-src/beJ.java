/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.Objects;
import lombok.Generated;

public class beJ
extends ug_0 {
    private final ux_0 hNT;
    private final boolean hNU;

    public beJ(ux_0 ux_02) {
        this(ux_02, ux_02, true);
    }

    public beJ(ux_0 ux_02, ux_0 ux_03) {
        this(ux_02, ux_03, false);
    }

    private beJ(ux_0 ux_02, ux_0 ux_03, boolean bl) {
        super(ux_02);
        this.hNT = ux_03;
        this.hNU = bl;
    }

    public void f(ut_0 ut_02) {
        String string = aum_0.cWf().aUXX().aUP();
        bQy.ejB().b(string, this.hNT);
        if (this.hNU) {
            bQy.ejB().b(string, this.hNT.bjO());
        }
        beJ beJ2 = this.deI();
        ut_02.a(beJ2);
    }

    public beJ deI() {
        ux_0 ux_02 = this.hNT.bjL();
        if (this.hNU) {
            ux_02 = ux_02.bjO();
        }
        return new beJ(this.bwG.bjO(), ux_02);
    }

    @Override
    public void a(ut_0 ut_02) {
        this.f(ut_02);
        ut_02.b(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof beJ)) {
            return false;
        }
        beJ beJ2 = (beJ)object;
        return Objects.equals(this.hNT, beJ2.hNT) && Objects.equals(this.bwG, beJ2.bwG) && Objects.equals(this.hNU, beJ2.hNU);
    }

    public int hashCode() {
        return Objects.hash(this.hNT, this.bwG, this.hNU);
    }

    public String toString() {
        return "DailyAlmanachEventRetriever{m_dateToRetrieve=" + String.valueOf(this.hNT) + ", m_date=" + String.valueOf(this.bwG) + ", m_retrieveTwoDay=" + this.hNU + "}";
    }

    @Generated
    public ux_0 deJ() {
        return this.hNT;
    }

    @Generated
    public boolean deK() {
        return this.hNU;
    }
}

