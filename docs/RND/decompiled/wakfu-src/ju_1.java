/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ju
 */
public final class ju_1
extends GeneratedMessageV3.Builder<ju_1>
implements jv_1 {
    private int an;
    private long nW;
    private List<iv_2> AM = Collections.emptyList();
    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> AS;

    public static final Descriptors.Descriptor VC() {
        return iu_2.Au;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Av.ensureFieldAccessorsInitialized(js_1.class, ju_1.class);
    }

    ju_1() {
        this.D();
    }

    ju_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (js_1.iU()) {
            this.SN();
        }
    }

    public ju_1 VD() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.AS.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Au;
    }

    public js_1 VB() {
        return js_1.VA();
    }

    public js_1 VE() {
        js_1 js_12 = this.VF();
        if (!js_12.isInitialized()) {
            throw ju_1.newUninitializedMessageException((Message)js_12);
        }
        return js_12;
    }

    public js_1 VF() {
        js_1 js_12 = new js_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            js_12.nW = this.nW;
            n2 |= 1;
        }
        if (this.AS == null) {
            if ((this.an & 2) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
                this.an &= 0xFFFFFFFD;
            }
            js_12.AM = this.AM;
        } else {
            js_12.AM = this.AS.build();
        }
        js_12.an = n2;
        this.onBuilt();
        return js_12;
    }

    public ju_1 VG() {
        return (ju_1)super.clone();
    }

    public ju_1 dy(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ju_1)super.setField(fieldDescriptor, object);
    }

    public ju_1 bm(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ju_1)super.clearField(fieldDescriptor);
    }

    public ju_1 bm(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ju_1)super.clearOneof(oneofDescriptor);
    }

    public ju_1 bm(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ju_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ju_1 dz(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ju_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ju_1 bm(Message message) {
        if (message instanceof js_1) {
            return this.d((js_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ju_1 d(js_1 js_12) {
        if (js_12 == js_1.VA()) {
            return this;
        }
        if (js_12.xk()) {
            this.az(js_12.xl());
        }
        if (this.AS == null) {
            if (!js_12.AM.isEmpty()) {
                if (this.AM.isEmpty()) {
                    this.AM = js_12.AM;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.SJ();
                    this.AM.addAll(js_12.AM);
                }
                this.onChanged();
            }
        } else if (!js_12.AM.isEmpty()) {
            if (this.AS.isEmpty()) {
                this.AS.dispose();
                this.AS = null;
                this.AM = js_12.AM;
                this.an &= 0xFFFFFFFD;
                this.AS = js_1.BA() ? this.SN() : null;
            } else {
                this.AS.addAllMessages(js_12.AM);
            }
        }
        this.dz(js_1.c(js_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        for (int i = 0; i < this.Ss(); ++i) {
            if (this.eS(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ju_1 fM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        js_1 js_12 = null;
        try {
            js_12 = (js_1)js_1.Cm.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            js_12 = (js_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (js_12 != null) {
                this.d(js_12);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public ju_1 az(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public ju_1 VH() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    private void SJ() {
        if ((this.an & 2) == 0) {
            this.AM = new ArrayList<iv_2>(this.AM);
            this.an |= 2;
        }
    }

    @Override
    public List<iv_2> Sq() {
        if (this.AS == null) {
            return Collections.unmodifiableList(this.AM);
        }
        return this.AS.getMessageList();
    }

    @Override
    public int Ss() {
        if (this.AS == null) {
            return this.AM.size();
        }
        return this.AS.getCount();
    }

    @Override
    public iv_2 eS(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iv_2)this.AS.getMessage(n);
    }

    public ju_1 e(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.set(n, iv_22);
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public ju_1 e(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.set(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.setMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public ju_1 f(iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)iv_22);
        }
        return this;
    }

    public ju_1 f(int n, iv_2 iv_22) {
        if (this.AS == null) {
            if (iv_22 == null) {
                throw new NullPointerException();
            }
            this.SJ();
            this.AM.add(n, iv_22);
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)iv_22);
        }
        return this;
    }

    public ju_1 c(ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage((AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public ju_1 f(int n, ix_2 ix_22) {
        if (this.AS == null) {
            this.SJ();
            this.AM.add(n, ix_22.Sf());
            this.onChanged();
        } else {
            this.AS.addMessage(n, (AbstractMessage)ix_22.Sf());
        }
        return this;
    }

    public ju_1 L(Iterable<? extends iv_2> iterable) {
        if (this.AS == null) {
            this.SJ();
            AbstractMessageLite.Builder.addAll(iterable, this.AM);
            this.onChanged();
        } else {
            this.AS.addAllMessages(iterable);
        }
        return this;
    }

    public ju_1 VI() {
        if (this.AS == null) {
            this.AM = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.AS.clear();
        }
        return this;
    }

    public ju_1 fA(int n) {
        if (this.AS == null) {
            this.SJ();
            this.AM.remove(n);
            this.onChanged();
        } else {
            this.AS.remove(n);
        }
        return this;
    }

    public ix_2 eW(int n) {
        return (ix_2)this.SN().getBuilder(n);
    }

    @Override
    public iy_2 eT(int n) {
        if (this.AS == null) {
            return this.AM.get(n);
        }
        return (iy_2)this.AS.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends iy_2> Sr() {
        if (this.AS != null) {
            return this.AS.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.AM);
    }

    public ix_2 SL() {
        return (ix_2)this.SN().addBuilder((AbstractMessage)iv_2.Sb());
    }

    public ix_2 eX(int n) {
        return (ix_2)this.SN().addBuilder(n, (AbstractMessage)iv_2.Sb());
    }

    public List<ix_2> SM() {
        return this.SN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iv_2, ix_2, iy_2> SN() {
        if (this.AS == null) {
            this.AS = new RepeatedFieldBuilderV3(this.AM, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.AM = null;
        }
        return this.AS;
    }

    public final ju_1 dy(UnknownFieldSet unknownFieldSet) {
        return (ju_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ju_1 dz(UnknownFieldSet unknownFieldSet) {
        return (ju_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dz(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dy(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dz(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bm(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bm(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bm(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dy(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.VD();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.VG();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dz(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bm(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.VD();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bm(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.VG();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dz(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dy(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dz(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bm(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bm(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bm(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dy(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.VG();
    }

    public /* synthetic */ Message buildPartial() {
        return this.VF();
    }

    public /* synthetic */ Message build() {
        return this.VE();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bm(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.VD();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.VG();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.VF();
    }

    public /* synthetic */ MessageLite build() {
        return this.VE();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.VD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.VB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.VB();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fM(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.VG();
    }

    public /* synthetic */ Object clone() {
        return this.VG();
    }
}

