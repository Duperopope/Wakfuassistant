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
 * Renamed from je
 */
class je_1
extends AbstractParser<jd_1> {
    je_1() {
    }

    public jd_1 fz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jd_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fz(codedInputStream, extensionRegistryLite);
    }
}

