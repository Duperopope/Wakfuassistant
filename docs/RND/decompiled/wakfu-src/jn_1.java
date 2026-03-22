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
 * Renamed from jn
 */
public final class jn_1
extends GeneratedMessageV3.Builder<jn_1>
implements jo_1 {
    private int an;
    private int BT;
    private List<jd_1> BV = Collections.emptyList();
    private RepeatedFieldBuilderV3<jd_1, jf_1, jg_1> Ca;
    private List<iz_2> BX = Collections.emptyList();
    private RepeatedFieldBuilderV3<iz_2, jb_1, jc_1> Cb;

    public static final Descriptors.Descriptor UN() {
        return iu_2.Ai;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Aj.ensureFieldAccessorsInitialized(jl_1.class, jn_1.class);
    }

    jn_1() {
        this.D();
    }

    jn_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jl_1.fa()) {
            this.UX();
            this.Vc();
        }
    }

    public jn_1 UO() {
        super.clear();
        this.BT = 0;
        this.an &= 0xFFFFFFFE;
        if (this.Ca == null) {
            this.BV = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.Ca.clear();
        }
        if (this.Cb == null) {
            this.BX = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.Cb.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Ai;
    }

    public jl_1 UM() {
        return jl_1.UL();
    }

    public jl_1 UP() {
        jl_1 jl_12 = this.UQ();
        if (!jl_12.isInitialized()) {
            throw jn_1.newUninitializedMessageException((Message)jl_12);
        }
        return jl_12;
    }

    public jl_1 UQ() {
        jl_1 jl_12 = new jl_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jl_12.BT = this.BT;
            n2 |= 1;
        }
        if (this.Ca == null) {
            if ((this.an & 2) != 0) {
                this.BV = Collections.unmodifiableList(this.BV);
                this.an &= 0xFFFFFFFD;
            }
            jl_12.BV = this.BV;
        } else {
            jl_12.BV = this.Ca.build();
        }
        if (this.Cb == null) {
            if ((this.an & 4) != 0) {
                this.BX = Collections.unmodifiableList(this.BX);
                this.an &= 0xFFFFFFFB;
            }
            jl_12.BX = this.BX;
        } else {
            jl_12.BX = this.Cb.build();
        }
        jl_12.an = n2;
        this.onBuilt();
        return jl_12;
    }

    public jn_1 UR() {
        return (jn_1)super.clone();
    }

    public jn_1 du(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jn_1)super.setField(fieldDescriptor, object);
    }

    public jn_1 bk(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jn_1)super.clearField(fieldDescriptor);
    }

    public jn_1 bk(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jn_1)super.clearOneof(oneofDescriptor);
    }

    public jn_1 bk(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jn_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jn_1 dv(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jn_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jn_1 bk(Message message) {
        if (message instanceof jl_1) {
            return this.g((jl_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jn_1 g(jl_1 jl_12) {
        if (jl_12 == jl_1.UL()) {
            return this;
        }
        if (jl_12.IR()) {
            this.fo(jl_12.UB());
        }
        if (this.Ca == null) {
            if (!jl_12.BV.isEmpty()) {
                if (this.BV.isEmpty()) {
                    this.BV = jl_12.BV;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.UT();
                    this.BV.addAll(jl_12.BV);
                }
                this.onChanged();
            }
        } else if (!jl_12.BV.isEmpty()) {
            if (this.Ca.isEmpty()) {
                this.Ca.dispose();
                this.Ca = null;
                this.BV = jl_12.BV;
                this.an &= 0xFFFFFFFD;
                this.Ca = jl_1.oV() ? this.UX() : null;
            } else {
                this.Ca.addAllMessages(jl_12.BV);
            }
        }
        if (this.Cb == null) {
            if (!jl_12.BX.isEmpty()) {
                if (this.BX.isEmpty()) {
                    this.BX = jl_12.BX;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.UY();
                    this.BX.addAll(jl_12.BX);
                }
                this.onChanged();
            }
        } else if (!jl_12.BX.isEmpty()) {
            if (this.Cb.isEmpty()) {
                this.Cb.dispose();
                this.Cb = null;
                this.BX = jl_12.BX;
                this.an &= 0xFFFFFFFB;
                this.Cb = jl_1.bg() ? this.Vc() : null;
            } else {
                this.Cb.addAllMessages(jl_12.BX);
            }
        }
        this.dv(jl_1.f(jl_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.IR()) {
            return false;
        }
        for (n = 0; n < this.UE(); ++n) {
            if (this.fk(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.UH(); ++n) {
            if (this.fm(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jn_1 fG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jl_1 jl_12 = null;
        try {
            jl_12 = (jl_1)jl_1.BZ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jl_12 = (jl_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jl_12 != null) {
                this.g(jl_12);
            }
        }
        return this;
    }

    @Override
    public boolean IR() {
        return (this.an & 1) != 0;
    }

    @Override
    public int UB() {
        return this.BT;
    }

    public jn_1 fo(int n) {
        this.an |= 1;
        this.BT = n;
        this.onChanged();
        return this;
    }

    public jn_1 US() {
        this.an &= 0xFFFFFFFE;
        this.BT = 0;
        this.onChanged();
        return this;
    }

    private void UT() {
        if ((this.an & 2) == 0) {
            this.BV = new ArrayList<jd_1>(this.BV);
            this.an |= 2;
        }
    }

    @Override
    public List<jd_1> UC() {
        if (this.Ca == null) {
            return Collections.unmodifiableList(this.BV);
        }
        return this.Ca.getMessageList();
    }

    @Override
    public int UE() {
        if (this.Ca == null) {
            return this.BV.size();
        }
        return this.Ca.getCount();
    }

    @Override
    public jd_1 fk(int n) {
        if (this.Ca == null) {
            return this.BV.get(n);
        }
        return (jd_1)this.Ca.getMessage(n);
    }

    public jn_1 a(int n, jd_1 jd_12) {
        if (this.Ca == null) {
            if (jd_12 == null) {
                throw new NullPointerException();
            }
            this.UT();
            this.BV.set(n, jd_12);
            this.onChanged();
        } else {
            this.Ca.setMessage(n, (AbstractMessage)jd_12);
        }
        return this;
    }

    public jn_1 a(int n, jf_1 jf_12) {
        if (this.Ca == null) {
            this.UT();
            this.BV.set(n, jf_12.Ti());
            this.onChanged();
        } else {
            this.Ca.setMessage(n, (AbstractMessage)jf_12.Ti());
        }
        return this;
    }

    public jn_1 d(jd_1 jd_12) {
        if (this.Ca == null) {
            if (jd_12 == null) {
                throw new NullPointerException();
            }
            this.UT();
            this.BV.add(jd_12);
            this.onChanged();
        } else {
            this.Ca.addMessage((AbstractMessage)jd_12);
        }
        return this;
    }

    public jn_1 b(int n, jd_1 jd_12) {
        if (this.Ca == null) {
            if (jd_12 == null) {
                throw new NullPointerException();
            }
            this.UT();
            this.BV.add(n, jd_12);
            this.onChanged();
        } else {
            this.Ca.addMessage(n, (AbstractMessage)jd_12);
        }
        return this;
    }

    public jn_1 a(jf_1 jf_12) {
        if (this.Ca == null) {
            this.UT();
            this.BV.add(jf_12.Ti());
            this.onChanged();
        } else {
            this.Ca.addMessage((AbstractMessage)jf_12.Ti());
        }
        return this;
    }

    public jn_1 b(int n, jf_1 jf_12) {
        if (this.Ca == null) {
            this.UT();
            this.BV.add(n, jf_12.Ti());
            this.onChanged();
        } else {
            this.Ca.addMessage(n, (AbstractMessage)jf_12.Ti());
        }
        return this;
    }

    public jn_1 I(Iterable<? extends jd_1> iterable) {
        if (this.Ca == null) {
            this.UT();
            AbstractMessageLite.Builder.addAll(iterable, this.BV);
            this.onChanged();
        } else {
            this.Ca.addAllMessages(iterable);
        }
        return this;
    }

    public jn_1 UU() {
        if (this.Ca == null) {
            this.BV = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.Ca.clear();
        }
        return this;
    }

    public jn_1 fp(int n) {
        if (this.Ca == null) {
            this.UT();
            this.BV.remove(n);
            this.onChanged();
        } else {
            this.Ca.remove(n);
        }
        return this;
    }

    public jf_1 fq(int n) {
        return (jf_1)this.UX().getBuilder(n);
    }

    @Override
    public jg_1 fl(int n) {
        if (this.Ca == null) {
            return this.BV.get(n);
        }
        return (jg_1)this.Ca.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jg_1> UD() {
        if (this.Ca != null) {
            return this.Ca.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.BV);
    }

    public jf_1 UV() {
        return (jf_1)this.UX().addBuilder((AbstractMessage)jd_1.Te());
    }

    public jf_1 fr(int n) {
        return (jf_1)this.UX().addBuilder(n, (AbstractMessage)jd_1.Te());
    }

    public List<jf_1> UW() {
        return this.UX().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jd_1, jf_1, jg_1> UX() {
        if (this.Ca == null) {
            this.Ca = new RepeatedFieldBuilderV3(this.BV, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.BV = null;
        }
        return this.Ca;
    }

    private void UY() {
        if ((this.an & 4) == 0) {
            this.BX = new ArrayList<iz_2>(this.BX);
            this.an |= 4;
        }
    }

    @Override
    public List<iz_2> UF() {
        if (this.Cb == null) {
            return Collections.unmodifiableList(this.BX);
        }
        return this.Cb.getMessageList();
    }

    @Override
    public int UH() {
        if (this.Cb == null) {
            return this.BX.size();
        }
        return this.Cb.getCount();
    }

    @Override
    public iz_2 fm(int n) {
        if (this.Cb == null) {
            return this.BX.get(n);
        }
        return (iz_2)this.Cb.getMessage(n);
    }

    public jn_1 a(int n, iz_2 iz_22) {
        if (this.Cb == null) {
            if (iz_22 == null) {
                throw new NullPointerException();
            }
            this.UY();
            this.BX.set(n, iz_22);
            this.onChanged();
        } else {
            this.Cb.setMessage(n, (AbstractMessage)iz_22);
        }
        return this;
    }

    public jn_1 a(int n, jb_1 jb_12) {
        if (this.Cb == null) {
            this.UY();
            this.BX.set(n, jb_12.SD());
            this.onChanged();
        } else {
            this.Cb.setMessage(n, (AbstractMessage)jb_12.SD());
        }
        return this;
    }

    public jn_1 d(iz_2 iz_22) {
        if (this.Cb == null) {
            if (iz_22 == null) {
                throw new NullPointerException();
            }
            this.UY();
            this.BX.add(iz_22);
            this.onChanged();
        } else {
            this.Cb.addMessage((AbstractMessage)iz_22);
        }
        return this;
    }

    public jn_1 b(int n, iz_2 iz_22) {
        if (this.Cb == null) {
            if (iz_22 == null) {
                throw new NullPointerException();
            }
            this.UY();
            this.BX.add(n, iz_22);
            this.onChanged();
        } else {
            this.Cb.addMessage(n, (AbstractMessage)iz_22);
        }
        return this;
    }

    public jn_1 a(jb_1 jb_12) {
        if (this.Cb == null) {
            this.UY();
            this.BX.add(jb_12.SD());
            this.onChanged();
        } else {
            this.Cb.addMessage((AbstractMessage)jb_12.SD());
        }
        return this;
    }

    public jn_1 b(int n, jb_1 jb_12) {
        if (this.Cb == null) {
            this.UY();
            this.BX.add(n, jb_12.SD());
            this.onChanged();
        } else {
            this.Cb.addMessage(n, (AbstractMessage)jb_12.SD());
        }
        return this;
    }

    public jn_1 J(Iterable<? extends iz_2> iterable) {
        if (this.Cb == null) {
            this.UY();
            AbstractMessageLite.Builder.addAll(iterable, this.BX);
            this.onChanged();
        } else {
            this.Cb.addAllMessages(iterable);
        }
        return this;
    }

    public jn_1 UZ() {
        if (this.Cb == null) {
            this.BX = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.Cb.clear();
        }
        return this;
    }

    public jn_1 fs(int n) {
        if (this.Cb == null) {
            this.UY();
            this.BX.remove(n);
            this.onChanged();
        } else {
            this.Cb.remove(n);
        }
        return this;
    }

    public jb_1 ft(int n) {
        return (jb_1)this.Vc().getBuilder(n);
    }

    @Override
    public jc_1 fn(int n) {
        if (this.Cb == null) {
            return this.BX.get(n);
        }
        return (jc_1)this.Cb.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jc_1> UG() {
        if (this.Cb != null) {
            return this.Cb.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.BX);
    }

    public jb_1 Va() {
        return (jb_1)this.Vc().addBuilder((AbstractMessage)iz_2.Sz());
    }

    public jb_1 fu(int n) {
        return (jb_1)this.Vc().addBuilder(n, (AbstractMessage)iz_2.Sz());
    }

    public List<jb_1> Vb() {
        return this.Vc().getBuilderList();
    }

    private RepeatedFieldBuilderV3<iz_2, jb_1, jc_1> Vc() {
        if (this.Cb == null) {
            this.Cb = new RepeatedFieldBuilderV3(this.BX, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.BX = null;
        }
        return this.Cb;
    }

    public final jn_1 du(UnknownFieldSet unknownFieldSet) {
        return (jn_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jn_1 dv(UnknownFieldSet unknownFieldSet) {
        return (jn_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dv(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.du(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dv(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bk(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bk(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bk(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.du(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.UO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.UR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dv(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bk(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.UO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bk(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.UR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dv(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.du(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dv(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bk(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bk(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bk(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.du(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.UR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.UQ();
    }

    public /* synthetic */ Message build() {
        return this.UP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bk(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.UO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.UR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.UQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.UP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.UO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.UM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.UM();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fG(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.UR();
    }

    public /* synthetic */ Object clone() {
        return this.UR();
    }
}

