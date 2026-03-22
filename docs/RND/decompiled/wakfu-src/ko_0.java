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
 * Renamed from ko
 */
class ko_0
extends AbstractParser<kn_0> {
    ko_0() {
    }

    public kn_0 gs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new kn_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gs(codedInputStream, extensionRegistryLite);
    }
}

