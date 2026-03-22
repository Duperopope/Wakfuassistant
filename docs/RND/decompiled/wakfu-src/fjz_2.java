/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fJZ
 */
public abstract class fjz_2
extends fjs_2 {
    private static final Logger uFk = LoggerFactory.getLogger(fjz_2.class);
    private String ucc;
    private fes_2 uFl;
    public static final int uFm = -1399201153;

    @Nullable
    public fes_2 getWidgetRelated() {
        fes_2 fes_22;
        if (this.ucc == null) {
            fes_22 = this.getParentOfType(fes_2.class);
        } else {
            fhv_1 fhv_12 = this.getElementMap().uH(this.ucc);
            if (fhv_12 instanceof fes_2) {
                fes_22 = (fes_2)fhv_12;
            } else if (fhv_12 instanceof fje_2) {
                fje_2 fje_22 = (fje_2)fhv_12;
                Optional<fcv_1> optional = fje_22.getManager().getRenderables().stream().filter(this::n).findFirst().or(() -> Optional.ofNullable(fje_22.getParentOfType(fcv_1.class)));
                if (optional.isPresent()) {
                    fes_22 = optional.get();
                } else {
                    uFk.warn("Element with following id : {} is {} and any {} can't be found in hierarchy", new Object[]{this.ucc, fhv_12.getClass().getName(), fcv_1.class.getName()});
                    fes_22 = null;
                }
            } else if (fhv_12 != null) {
                uFk.warn("Element with following id : {} is {} and not {}!", new Object[]{this.ucc, fhv_12.getClass().getName(), fes_2.class.getName()});
                fes_22 = null;
            } else {
                uFk.warn("Unable to find {} with following id : {}", (Object)fes_2.class.getName(), (Object)this.ucc);
                fes_22 = null;
            }
        }
        if (fes_22 != this.uFl) {
            this.c(this.uFl, fes_22);
        }
        this.uFl = fes_22;
        return fes_22;
    }

    public void c(@Nullable fes_2 fes_22, @Nullable fes_2 fes_23) {
    }

    @Nullable
    public String getWidgetId() {
        return this.ucc;
    }

    public void setWidgetId(@Nullable String string) {
        if (Objects.equals(this.ucc, string)) {
            return;
        }
        this.ucc = string;
        this.gCJ();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ucc = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjz_2 fjz_22 = (fjz_2)fhi_22;
        fjz_22.ucc = this.ucc;
        super.a(fhi_22);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case -1399201153: {
                this.setWidgetId(string);
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -1399201153: {
                this.setWidgetId(String.valueOf(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

