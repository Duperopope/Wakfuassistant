/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from z
 */
public final class z_0
extends GeneratedMessageV3.Builder<z_0>
implements b_0 {
    private int ax = 0;
    private Object ay;
    private Object R = "";
    private int aB;

    public static final Descriptors.Descriptor bh() {
        return g_0.E;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.F.ensureFieldAccessorsInitialized(x.class, z_0.class);
    }

    z_0() {
        this.D();
    }

    z_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (x.bg()) {
            // empty if block
        }
    }

    public z_0 bi() {
        super.clear();
        this.R = "";
        this.aB = 0;
        this.ax = 0;
        this.ay = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.E;
    }

    public x bf() {
        return x.be();
    }

    public x bj() {
        x x2 = this.bk();
        if (!x2.isInitialized()) {
            throw z_0.newUninitializedMessageException((Message)x2);
        }
        return x2;
    }

    public x bk() {
        x x2 = new x(this);
        x2.R = this.R;
        x2.aB = this.aB;
        if (this.ax == 3) {
            x2.ay = this.ay;
        }
        if (this.ax == 4) {
            x2.ay = this.ay;
        }
        x2.ax = this.ax;
        this.onBuilt();
        return x2;
    }

    public z_0 bl() {
        return (z_0)super.clone();
    }

    public z_0 i(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (z_0)super.setField(fieldDescriptor, object);
    }

    public z_0 e(Descriptors.FieldDescriptor fieldDescriptor) {
        return (z_0)super.clearField(fieldDescriptor);
    }

    public z_0 e(Descriptors.OneofDescriptor oneofDescriptor) {
        return (z_0)super.clearOneof(oneofDescriptor);
    }

    public z_0 e(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (z_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public z_0 j(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (z_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public z_0 e(Message message) {
        if (message instanceof x) {
            return this.c((x)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public z_0 c(x x2) {
        if (x2 == x.be()) {
            return this;
        }
        if (!x2.n().isEmpty()) {
            this.R = x2.R;
            this.onChanged();
        }
        if (x2.aU() != 0) {
            this.f(x2.aU());
        }
        switch (x2.aT().ordinal()) {
            case 0: {
                this.ax = 3;
                this.ay = x2.ay;
                this.onChanged();
                break;
            }
            case 1: {
                this.ax = 4;
                this.ay = x2.ay;
                this.onChanged();
                break;
            }
        }
        this.j(x.b(x2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public z_0 o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        x x2 = null;
        try {
            x2 = (x)x.aF.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            x2 = (x)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (x2 != null) {
                this.c(x2);
            }
        }
        return this;
    }

    @Override
    public a_0 aT() {
        return a_0.h(this.ax);
    }

    public z_0 bm() {
        this.ax = 0;
        this.ay = null;
        this.onChanged();
        return this;
    }

    @Override
    public String n() {
        Object object = this.R;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.R = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString o() {
        Object object = this.R;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.R = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public z_0 f(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.R = string;
        this.onChanged();
        return this;
    }

    public z_0 bn() {
        this.R = x.be().n();
        this.onChanged();
        return this;
    }

    public z_0 s(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        x.p(byteString);
        this.R = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public int aU() {
        return this.aB;
    }

    public z_0 f(int n) {
        this.aB = n;
        this.onChanged();
        return this;
    }

    public z_0 bo() {
        this.aB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aV() {
        return this.ax == 3;
    }

    @Override
    public String aW() {
        Object object = "";
        if (this.ax == 3) {
            object = this.ay;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.ax == 3) {
                this.ay = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aX() {
        Object object = "";
        if (this.ax == 3) {
            object = this.ay;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ax == 3) {
                this.ay = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public z_0 g(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.ax = 3;
        this.ay = string;
        this.onChanged();
        return this;
    }

    public z_0 bp() {
        if (this.ax == 3) {
            this.ax = 0;
            this.ay = null;
            this.onChanged();
        }
        return this;
    }

    public z_0 t(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        x.q(byteString);
        this.ax = 3;
        this.ay = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aY() {
        return this.ax == 4;
    }

    @Override
    public String aZ() {
        Object object = "";
        if (this.ax == 4) {
            object = this.ay;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.ax == 4) {
                this.ay = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString ba() {
        Object object = "";
        if (this.ax == 4) {
            object = this.ay;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ax == 4) {
                this.ay = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public z_0 h(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.ax = 4;
        this.ay = string;
        this.onChanged();
        return this;
    }

    public z_0 bq() {
        if (this.ax == 4) {
            this.ax = 0;
            this.ay = null;
            this.onChanged();
        }
        return this;
    }

    public z_0 u(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        x.r(byteString);
        this.ax = 4;
        this.ay = byteString;
        this.onChanged();
        return this;
    }

    public final z_0 i(UnknownFieldSet unknownFieldSet) {
        return (z_0)super.setUnknownFields(unknownFieldSet);
    }

    public final z_0 j(UnknownFieldSet unknownFieldSet) {
        return (z_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.j(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.i(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.j(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.e(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.e(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.e(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.i(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.bi();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.bl();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.j(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.o(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.e(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.bi();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.e(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.bl();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.j(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.i(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.j(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.e(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.e(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.e(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.i(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.o(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.bl();
    }

    public /* synthetic */ Message buildPartial() {
        return this.bk();
    }

    public /* synthetic */ Message build() {
        return this.bj();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.e(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.bi();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.o(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.bl();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.bk();
    }

    public /* synthetic */ MessageLite build() {
        return this.bj();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.bi();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.bf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.bf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.o(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.bl();
    }

    public /* synthetic */ Object clone() {
        return this.bl();
    }
}

