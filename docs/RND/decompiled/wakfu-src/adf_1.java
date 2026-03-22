/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aDF
 */
public interface adf_1
extends aao_2,
azd_2 {
    default public void a(adc_1 adc_12, Exception exception) {
        Logger.getLogger(this.getClass()).error((Object)("Exception during request execution, request : " + String.valueOf(adc_12)), (Throwable)exception);
    }
}

