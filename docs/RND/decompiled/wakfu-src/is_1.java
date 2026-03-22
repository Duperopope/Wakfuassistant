/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from is
 */
public final class is_1
extends GeneratedMessageV3.Builder<is_1>
implements iv_1 {
    private int an;
    private boolean yg;
    private boolean yi;
    private int yk = -1;
    private boolean ym = true;
    private int yo;
    private boolean yq;
    private boolean ys;
    private int yu = 0;

    public static final Descriptors.Descriptor Ox() {
        return ih_2.wL;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wM.ensureFieldAccessorsInitialized(iq_2.class, is_1.class);
    }

    is_1() {
        this.D();
    }

    is_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (iq_2.ar()) {
            // empty if block
        }
    }

    public is_1 Oy() {
        super.clear();
        this.yg = false;
        this.an &= 0xFFFFFFFE;
        this.yi = false;
        this.an &= 0xFFFFFFFD;
        this.yk = -1;
        this.an &= 0xFFFFFFFB;
        this.ym = true;
        this.an &= 0xFFFFFFF7;
        this.yo = 0;
        this.an &= 0xFFFFFFEF;
        this.yq = false;
        this.an &= 0xFFFFFFDF;
        this.ys = false;
        this.an &= 0xFFFFFFBF;
        this.yu = 0;
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wL;
    }

    public iq_2 Ow() {
        return iq_2.Ov();
    }

    public iq_2 Oz() {
        iq_2 iq_22 = this.OA();
        if (!iq_22.isInitialized()) {
            throw is_1.newUninitializedMessageException((Message)iq_22);
        }
        return iq_22;
    }

    public iq_2 OA() {
        iq_2 iq_22 = new iq_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            iq_22.yg = this.yg;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            iq_22.yi = this.yi;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        iq_22.yk = this.yk;
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        iq_22.ym = this.ym;
        if ((n & 0x10) != 0) {
            iq_22.yo = this.yo;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            iq_22.yq = this.yq;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            iq_22.ys = this.ys;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            n2 |= 0x80;
        }
        iq_22.yu = this.yu;
        iq_22.an = n2;
        this.onBuilt();
        return iq_22;
    }

    public is_1 OB() {
        return (is_1)super.clone();
    }

    public is_1 cY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is_1)super.setField(fieldDescriptor, object);
    }

    public is_1 aZ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (is_1)super.clearField(fieldDescriptor);
    }

    public is_1 aZ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (is_1)super.clearOneof(oneofDescriptor);
    }

    public is_1 aZ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (is_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public is_1 cZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public is_1 aZ(Message message) {
        if (message instanceof iq_2) {
            return this.c((iq_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public is_1 c(iq_2 iq_22) {
        if (iq_22 == iq_2.Ov()) {
            return this;
        }
        if (iq_22.Oc()) {
            this.A(iq_22.Od());
        }
        if (iq_22.Oe()) {
            this.B(iq_22.Of());
        }
        if (iq_22.Og()) {
            this.ev(iq_22.Oh());
        }
        if (iq_22.Oi()) {
            this.C(iq_22.Oj());
        }
        if (iq_22.Ok()) {
            this.ew(iq_22.Ol());
        }
        if (iq_22.Om()) {
            this.D(iq_22.On());
        }
        if (iq_22.Oo()) {
            this.E(iq_22.Op());
        }
        if (iq_22.Oq()) {
            this.a(iq_22.Or());
        }
        this.cZ(iq_2.b(iq_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Oc()) {
            return false;
        }
        if (!this.Oe()) {
            return false;
        }
        if (!this.Og()) {
            return false;
        }
        if (!this.Oi()) {
            return false;
        }
        if (!this.Ok()) {
            return false;
        }
        if (!this.Om()) {
            return false;
        }
        if (!this.Oo()) {
            return false;
        }
        return this.Oq();
    }

    public is_1 eZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iq_2 iq_22 = null;
        try {
            iq_22 = (iq_2)iq_2.yw.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iq_22 = (iq_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iq_22 != null) {
                this.c(iq_22);
            }
        }
        return this;
    }

    @Override
    public boolean Oc() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean Od() {
        return this.yg;
    }

    public is_1 A(boolean bl) {
        this.an |= 1;
        this.yg = bl;
        this.onChanged();
        return this;
    }

    public is_1 OC() {
        this.an &= 0xFFFFFFFE;
        this.yg = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Oe() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean Of() {
        return this.yi;
    }

    public is_1 B(boolean bl) {
        this.an |= 2;
        this.yi = bl;
        this.onChanged();
        return this;
    }

    public is_1 OD() {
        this.an &= 0xFFFFFFFD;
        this.yi = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Og() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Oh() {
        return this.yk;
    }

    public is_1 ev(int n) {
        this.an |= 4;
        this.yk = n;
        this.onChanged();
        return this;
    }

    public is_1 OE() {
        this.an &= 0xFFFFFFFB;
        this.yk = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Oi() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean Oj() {
        return this.ym;
    }

    public is_1 C(boolean bl) {
        this.an |= 8;
        this.ym = bl;
        this.onChanged();
        return this;
    }

    public is_1 OF() {
        this.an &= 0xFFFFFFF7;
        this.ym = true;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ok() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int Ol() {
        return this.yo;
    }

    public is_1 ew(int n) {
        this.an |= 0x10;
        this.yo = n;
        this.onChanged();
        return this;
    }

    public is_1 OG() {
        this.an &= 0xFFFFFFEF;
        this.yo = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Om() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean On() {
        return this.yq;
    }

    public is_1 D(boolean bl) {
        this.an |= 0x20;
        this.yq = bl;
        this.onChanged();
        return this;
    }

    public is_1 OH() {
        this.an &= 0xFFFFFFDF;
        this.yq = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Oo() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public boolean Op() {
        return this.ys;
    }

    public is_1 E(boolean bl) {
        this.an |= 0x40;
        this.ys = bl;
        this.onChanged();
        return this;
    }

    public is_1 OI() {
        this.an &= 0xFFFFFFBF;
        this.ys = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Oq() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public it_1 Or() {
        it_1 it_12 = it_1.ex(this.yu);
        return it_12 == null ? it_1.yx : it_12;
    }

    public is_1 a(it_1 it_12) {
        if (it_12 == null) {
            throw new NullPointerException();
        }
        this.an |= 0x80;
        this.yu = it_12.getNumber();
        this.onChanged();
        return this;
    }

    public is_1 OJ() {
        this.an &= 0xFFFFFF7F;
        this.yu = 0;
        this.onChanged();
        return this;
    }

    public final is_1 cY(UnknownFieldSet unknownFieldSet) {
        return (is_1)super.setUnknownFields(unknownFieldSet);
    }

    public final is_1 cZ(UnknownFieldSet unknownFieldSet) {
        return (is_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aZ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aZ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aZ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Oy();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.OB();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aZ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Oy();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aZ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.OB();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aZ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aZ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aZ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.OB();
    }

    public /* synthetic */ Message buildPartial() {
        return this.OA();
    }

    public /* synthetic */ Message build() {
        return this.Oz();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aZ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Oy();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.OB();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.OA();
    }

    public /* synthetic */ MessageLite build() {
        return this.Oz();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Oy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ow();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ow();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.OB();
    }

    public /* synthetic */ Object clone() {
        return this.OB();
    }
}

