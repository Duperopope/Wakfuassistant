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
 * Renamed from gU
 */
class gu_0
extends AbstractParser<gt_0> {
    gu_0() {
    }

    public gt_0 ec(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gt_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ec(codedInputStream, extensionRegistryLite);
    }
}

