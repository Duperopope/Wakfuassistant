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
 * Renamed from fx
 */
class fx_1
extends AbstractParser<fw_1> {
    fx_1() {
    }

    public fw_1 dj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fw_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dj(codedInputStream, extensionRegistryLite);
    }
}

