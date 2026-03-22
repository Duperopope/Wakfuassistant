/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Renamed from aTF
 */
@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.SOURCE)
@Inherited
public @interface atf_0 {
    public String cDS();

    public String cDT();

    public String cDU();

    public evp_2[] cDV();

    public boolean cDW();
}

