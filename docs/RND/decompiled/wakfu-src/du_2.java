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
 * Renamed from du
 */
class du_2
extends AbstractParser<dt_2> {
    du_2() {
    }

    public dt_2 bV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new dt_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bV(codedInputStream, extensionRegistryLite);
    }
}

