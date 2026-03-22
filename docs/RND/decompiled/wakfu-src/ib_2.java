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
 * Renamed from iB
 */
class ib_2
extends AbstractParser<ia_2> {
    ib_2() {
    }

    public ia_2 fe(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ia_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fe(codedInputStream, extensionRegistryLite);
    }
}

