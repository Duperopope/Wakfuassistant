/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from jD
 */
class jd_2
extends AbstractParser<jc_2> {
    jd_2() {
    }

    public jc_2 fR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jc_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fR(codedInputStream, extensionRegistryLite);
    }
}

