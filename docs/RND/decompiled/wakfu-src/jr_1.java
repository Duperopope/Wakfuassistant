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
 * Renamed from jr
 */
public final class jr_1
extends GeneratedMessageV3.Builder<jr_1>
implements jw_1 {
    private int an;
    private List<js_1> Ce = Collections.emptyList();
    private RepeatedFieldBuilderV3<js_1, ju_1, jv_1> Ch;

    public static final Descriptors.Descriptor Vm() {
        return iu_2.As;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.At.ensureFieldAccessorsInitialized(jp_1.class, jr_1.class);
    }

    jr_1() {
        this.D();
    }

    jr_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jp_1.aq()) {
            this.Vv();
        }
    }

    public jr_1 Vn() {
        super.clear();
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.Ch.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.As;
    }

    public jp_1 Vl() {
        return jp_1.Vk();
    }

    public jp_1 Vo() {
        jp_1 jp_12 = this.Vp();
        if (!jp_12.isInitialized()) {
            throw jr_1.newUninitializedMessageException((Message)jp_12);
        }
        return jp_12;
    }

    public jp_1 Vp() {
        jp_1 jp_12 = new jp_1(this);
        int n = this.an;
        if (this.Ch == null) {
            if ((this.an & 1) != 0) {
                this.Ce = Collections.unmodifiableList(this.Ce);
                this.an &= 0xFFFFFFFE;
            }
            jp_12.Ce = this.Ce;
        } else {
            jp_12.Ce = this.Ch.build();
        }
        this.onBuilt();
        return jp_12;
    }

    public jr_1 Vq() {
        return (jr_1)super.clone();
    }

    public jr_1 dw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jr_1)super.setField(fieldDescriptor, object);
    }

    public jr_1 bl(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jr_1)super.clearField(fieldDescriptor);
    }

    public jr_1 bl(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jr_1)super.clearOneof(oneofDescriptor);
    }

    public jr_1 bl(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jr_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jr_1 dx(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jr_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jr_1 bl(Message message) {
        if (message instanceof jp_1) {
            return this.c((jp_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jr_1 c(jp_1 jp_12) {
        if (jp_12 == jp_1.Vk()) {
            return this;
        }
        if (this.Ch == null) {
            if (!jp_12.Ce.isEmpty()) {
                if (this.Ce.isEmpty()) {
                    this.Ce = jp_12.Ce;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Vr();
                    this.Ce.addAll(jp_12.Ce);
                }
                this.onChanged();
            }
        } else if (!jp_12.Ce.isEmpty()) {
            if (this.Ch.isEmpty()) {
                this.Ch.dispose();
                this.Ch = null;
                this.Ce = jp_12.Ce;
                this.an &= 0xFFFFFFFE;
                this.Ch = jp_1.ar() ? this.Vv() : null;
            } else {
                this.Ch.addAllMessages(jp_12.Ce);
            }
        }
        this.dx(jp_1.b(jp_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.fv(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jr_1 fJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jp_1 jp_12 = null;
        try {
            jp_12 = (jp_1)jp_1.Cg.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jp_12 = (jp_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jp_12 != null) {
                this.c(jp_12);
            }
        }
        return this;
    }

    private void Vr() {
        if ((this.an & 1) == 0) {
            this.Ce = new ArrayList<js_1>(this.Ce);
            this.an |= 1;
        }
    }

    @Override
    public List<js_1> Ve() {
        if (this.Ch == null) {
            return Collections.unmodifiableList(this.Ce);
        }
        return this.Ch.getMessageList();
    }

    @Override
    public int Vg() {
        if (this.Ch == null) {
            return this.Ce.size();
        }
        return this.Ch.getCount();
    }

    @Override
    public js_1 fv(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (js_1)this.Ch.getMessage(n);
    }

    public jr_1 a(int n, js_1 js_12) {
        if (this.Ch == null) {
            if (js_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.set(n, js_12);
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)js_12);
        }
        return this;
    }

    public jr_1 a(int n, ju_1 ju_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.set(n, ju_12.VE());
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)ju_12.VE());
        }
        return this;
    }

    public jr_1 a(js_1 js_12) {
        if (this.Ch == null) {
            if (js_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(js_12);
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)js_12);
        }
        return this;
    }

    public jr_1 b(int n, js_1 js_12) {
        if (this.Ch == null) {
            if (js_12 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(n, js_12);
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)js_12);
        }
        return this;
    }

    public jr_1 a(ju_1 ju_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(ju_12.VE());
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)ju_12.VE());
        }
        return this;
    }

    public jr_1 b(int n, ju_1 ju_12) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(n, ju_12.VE());
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)ju_12.VE());
        }
        return this;
    }

    public jr_1 K(Iterable<? extends js_1> iterable) {
        if (this.Ch == null) {
            this.Vr();
            AbstractMessageLite.Builder.addAll(iterable, this.Ce);
            this.onChanged();
        } else {
            this.Ch.addAllMessages(iterable);
        }
        return this;
    }

    public jr_1 Vs() {
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.Ch.clear();
        }
        return this;
    }

    public jr_1 fx(int n) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.remove(n);
            this.onChanged();
        } else {
            this.Ch.remove(n);
        }
        return this;
    }

    public ju_1 fy(int n) {
        return (ju_1)this.Vv().getBuilder(n);
    }

    @Override
    public jv_1 fw(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (jv_1)this.Ch.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jv_1> Vf() {
        if (this.Ch != null) {
            return this.Ch.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ce);
    }

    public ju_1 Vt() {
        return (ju_1)this.Vv().addBuilder((AbstractMessage)js_1.VA());
    }

    public ju_1 fz(int n) {
        return (ju_1)this.Vv().addBuilder(n, (AbstractMessage)js_1.VA());
    }

    public List<ju_1> Vu() {
        return this.Vv().getBuilderList();
    }

    private RepeatedFieldBuilderV3<js_1, ju_1, jv_1> Vv() {
        if (this.Ch == null) {
            this.Ch = new RepeatedFieldBuilderV3(this.Ce, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ce = null;
        }
        return this.Ch;
    }

    public final jr_1 dw(UnknownFieldSet unknownFieldSet) {
        return (jr_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jr_1 dx(UnknownFieldSet unknownFieldSet) {
        return (jr_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dx(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dx(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bl(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bl(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bl(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Vn();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Vq();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dx(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bl(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Vn();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bl(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Vq();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dx(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dx(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bl(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bl(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bl(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Vq();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Vp();
    }

    public /* synthetic */ Message build() {
        return this.Vo();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bl(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Vn();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Vq();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Vp();
    }

    public /* synthetic */ MessageLite build() {
        return this.Vo();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Vn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Vl();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Vl();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Vq();
    }

    public /* synthetic */ Object clone() {
        return this.Vq();
    }
}

