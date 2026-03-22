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
 * Renamed from lr
 */
class lr_0
extends AbstractParser<lq_1> {
    lr_0() {
    }

    public lq_1 hf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lq_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hf(codedInputStream, extensionRegistryLite);
    }
}

