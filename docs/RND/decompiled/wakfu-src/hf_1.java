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
 * Renamed from hf
 */
public final class hf_1
extends GeneratedMessageV3.Builder<hf_1>
implements hg_1 {
    private int an;
    private List<gz_0> tO = Collections.emptyList();
    private RepeatedFieldBuilderV3<gz_0, hb_0, hc_1> tR;

    public static final Descriptors.Descriptor Hj() {
        return gy_0.tC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gy_0.tD.ensureFieldAccessorsInitialized(hd_1.class, hf_1.class);
    }

    hf_1() {
        this.D();
    }

    hf_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hd_1.aJ()) {
            this.Hs();
        }
    }

    public hf_1 Hk() {
        super.clear();
        if (this.tR == null) {
            this.tO = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.tR.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gy_0.tC;
    }

    public hd_1 Hi() {
        return hd_1.Hh();
    }

    public hd_1 Hl() {
        hd_1 hd_12 = this.Hm();
        if (!hd_12.isInitialized()) {
            throw hf_1.newUninitializedMessageException((Message)hd_12);
        }
        return hd_12;
    }

    public hd_1 Hm() {
        hd_1 hd_12 = new hd_1(this);
        int n = this.an;
        if (this.tR == null) {
            if ((this.an & 1) != 0) {
                this.tO = Collections.unmodifiableList(this.tO);
                this.an &= 0xFFFFFFFE;
            }
            hd_12.tO = this.tO;
        } else {
            hd_12.tO = this.tR.build();
        }
        this.onBuilt();
        return hd_12;
    }

    public hf_1 Hn() {
        return (hf_1)super.clone();
    }

    public hf_1 cw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_1)super.setField(fieldDescriptor, object);
    }

    public hf_1 aL(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hf_1)super.clearField(fieldDescriptor);
    }

    public hf_1 aL(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hf_1)super.clearOneof(oneofDescriptor);
    }

    public hf_1 aL(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hf_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hf_1 cx(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public hf_1 aL(Message message) {
        if (message instanceof hd_1) {
            return this.c((hd_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hf_1 c(hd_1 hd_12) {
        if (hd_12 == hd_1.Hh()) {
            return this;
        }
        if (this.tR == null) {
            if (!hd_12.tO.isEmpty()) {
                if (this.tO.isEmpty()) {
                    this.tO = hd_12.tO;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Ho();
                    this.tO.addAll(hd_12.tO);
                }
                this.onChanged();
            }
        } else if (!hd_12.tO.isEmpty()) {
            if (this.tR.isEmpty()) {
                this.tR.dispose();
                this.tR = null;
                this.tO = hd_12.tO;
                this.an &= 0xFFFFFFFE;
                this.tR = hd_1.oB() ? this.Hs() : null;
            } else {
                this.tR.addAllMessages(hd_12.tO);
            }
        }
        this.cx(hd_1.b(hd_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.Hd(); ++i) {
            if (this.dp(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hf_1 ej(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hd_1 hd_12 = null;
        try {
            hd_12 = (hd_1)hd_1.tQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hd_12 = (hd_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hd_12 != null) {
                this.c(hd_12);
            }
        }
        return this;
    }

    private void Ho() {
        if ((this.an & 1) == 0) {
            this.tO = new ArrayList<gz_0>(this.tO);
            this.an |= 1;
        }
    }

    @Override
    public List<gz_0> Hb() {
        if (this.tR == null) {
            return Collections.unmodifiableList(this.tO);
        }
        return this.tR.getMessageList();
    }

    @Override
    public int Hd() {
        if (this.tR == null) {
            return this.tO.size();
        }
        return this.tR.getCount();
    }

    @Override
    public gz_0 dp(int n) {
        if (this.tR == null) {
            return this.tO.get(n);
        }
        return (gz_0)this.tR.getMessage(n);
    }

    public hf_1 a(int n, gz_0 gz_02) {
        if (this.tR == null) {
            if (gz_02 == null) {
                throw new NullPointerException();
            }
            this.Ho();
            this.tO.set(n, gz_02);
            this.onChanged();
        } else {
            this.tR.setMessage(n, (AbstractMessage)gz_02);
        }
        return this;
    }

    public hf_1 a(int n, hb_0 hb_02) {
        if (this.tR == null) {
            this.Ho();
            this.tO.set(n, hb_02.GV());
            this.onChanged();
        } else {
            this.tR.setMessage(n, (AbstractMessage)hb_02.GV());
        }
        return this;
    }

    public hf_1 d(gz_0 gz_02) {
        if (this.tR == null) {
            if (gz_02 == null) {
                throw new NullPointerException();
            }
            this.Ho();
            this.tO.add(gz_02);
            this.onChanged();
        } else {
            this.tR.addMessage((AbstractMessage)gz_02);
        }
        return this;
    }

    public hf_1 b(int n, gz_0 gz_02) {
        if (this.tR == null) {
            if (gz_02 == null) {
                throw new NullPointerException();
            }
            this.Ho();
            this.tO.add(n, gz_02);
            this.onChanged();
        } else {
            this.tR.addMessage(n, (AbstractMessage)gz_02);
        }
        return this;
    }

    public hf_1 a(hb_0 hb_02) {
        if (this.tR == null) {
            this.Ho();
            this.tO.add(hb_02.GV());
            this.onChanged();
        } else {
            this.tR.addMessage((AbstractMessage)hb_02.GV());
        }
        return this;
    }

    public hf_1 b(int n, hb_0 hb_02) {
        if (this.tR == null) {
            this.Ho();
            this.tO.add(n, hb_02.GV());
            this.onChanged();
        } else {
            this.tR.addMessage(n, (AbstractMessage)hb_02.GV());
        }
        return this;
    }

    public hf_1 A(Iterable<? extends gz_0> iterable) {
        if (this.tR == null) {
            this.Ho();
            AbstractMessageLite.Builder.addAll(iterable, this.tO);
            this.onChanged();
        } else {
            this.tR.addAllMessages(iterable);
        }
        return this;
    }

    public hf_1 Hp() {
        if (this.tR == null) {
            this.tO = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.tR.clear();
        }
        return this;
    }

    public hf_1 dr(int n) {
        if (this.tR == null) {
            this.Ho();
            this.tO.remove(n);
            this.onChanged();
        } else {
            this.tR.remove(n);
        }
        return this;
    }

    public hb_0 ds(int n) {
        return (hb_0)this.Hs().getBuilder(n);
    }

    @Override
    public hc_1 dq(int n) {
        if (this.tR == null) {
            return this.tO.get(n);
        }
        return (hc_1)this.tR.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends hc_1> Hc() {
        if (this.tR != null) {
            return this.tR.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.tO);
    }

    public hb_0 Hq() {
        return (hb_0)this.Hs().addBuilder((AbstractMessage)gz_0.GR());
    }

    public hb_0 dt(int n) {
        return (hb_0)this.Hs().addBuilder(n, (AbstractMessage)gz_0.GR());
    }

    public List<hb_0> Hr() {
        return this.Hs().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gz_0, hb_0, hc_1> Hs() {
        if (this.tR == null) {
            this.tR = new RepeatedFieldBuilderV3(this.tO, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.tO = null;
        }
        return this.tR;
    }

    public final hf_1 cw(UnknownFieldSet unknownFieldSet) {
        return (hf_1)super.setUnknownFields(unknownFieldSet);
    }

    public final hf_1 cx(UnknownFieldSet unknownFieldSet) {
        return (hf_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cx(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cx(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aL(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aL(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aL(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Hk();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Hn();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cx(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ej(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aL(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Hk();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aL(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Hn();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cx(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cx(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aL(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aL(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aL(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ej(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Hn();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Hm();
    }

    public /* synthetic */ Message build() {
        return this.Hl();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aL(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Hk();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ej(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Hn();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Hm();
    }

    public /* synthetic */ MessageLite build() {
        return this.Hl();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Hk();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Hi();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Hi();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ej(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Hn();
    }

    public /* synthetic */ Object clone() {
        return this.Hn();
    }
}

