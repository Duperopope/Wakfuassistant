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
 * Renamed from el
 */
class el_2
extends AbstractParser<ek_2> {
    el_2() {
    }

    public ek_2 cw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ek_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cw(codedInputStream, extensionRegistryLite);
    }
}

