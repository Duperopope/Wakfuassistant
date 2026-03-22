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
 * Renamed from cC
 */
class cc_2
extends AbstractParser<cb_1> {
    cc_2() {
    }

    public cb_1 bu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cb_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bu(codedInputStream, extensionRegistryLite);
    }
}

