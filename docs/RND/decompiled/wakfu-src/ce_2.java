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
 * Renamed from ce
 */
class ce_2
extends AbstractParser<cd_2> {
    ce_2() {
    }

    public cd_2 bc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cd_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bc(codedInputStream, extensionRegistryLite);
    }
}

